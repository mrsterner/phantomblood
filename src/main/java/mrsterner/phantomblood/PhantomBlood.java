package mrsterner.phantomblood;

import com.chocohead.mm.api.ClassTinkerers;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.williambl.haema.Vampirable;
import com.williambl.haema.VampireBloodManager;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import dev.onyxstudios.cca.api.v3.world.WorldComponentFactoryRegistry;
import mrsterner.phantomblood.common.StandPunchHandler;
import mrsterner.phantomblood.common.block.CoffinBlock;
import mrsterner.phantomblood.common.enchantment.*;
import mrsterner.phantomblood.common.item.KillerQueenTriggerItem;
import mrsterner.phantomblood.common.statuseffects.DarkBlueMoonEffect;
import mrsterner.phantomblood.common.worldgen.structure.RuinStructure;
import mrsterner.phantomblood.common.worldgen.RegistrationHelper;
import mrsterner.phantomblood.common.stand.*;
import mrsterner.phantomblood.common.timestop.StoppedTimeDamageHandler;
import mrsterner.phantomblood.common.timestop.TimeStopComponent;
import mrsterner.phantomblood.common.timestop.TimeStopComponentImpl;
import nerdhub.cardinal.components.api.util.RespawnCopyStrategy;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.fabricmc.fabric.api.util.TriState;
import net.minecraft.command.EntitySelector;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import mrsterner.phantomblood.common.registry.*;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;
import software.bernie.geckolib3.GeckoLib;
import top.theillusivec4.somnus.api.PlayerSleepEvents;
import top.theillusivec4.somnus.api.WorldSleepEvents;
import dev.onyxstudios.cca.api.v3.world.WorldComponentInitializer;

import java.util.List;
import java.util.function.Predicate;

import static mrsterner.phantomblood.common.registry.PBCommands.*;
import static net.minecraft.server.command.CommandManager.argument;


public final class PhantomBlood implements ModInitializer, EntityComponentInitializer, WorldComponentInitializer  {

    public static final String MODID = "phantomblood";
    public static final ItemGroup PHANTOMBLOOD_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, MODID), () -> new ItemStack(PBObjects.STONE_MASK_ITEM));

    public static final StructureFeature<StructurePoolFeatureConfig> RUIN = new RuinStructure();

    private static void registerStructures() { FabricStructureBuilder.create(RuinStructure.ID, RUIN).step(GenerationStep.Feature.SURFACE_STRUCTURES)
            .defaultConfig(50, 25, 165757306).superflatFeature(PBObjects.RUIN).adjustsSurface().register();
    }
    public static void putStructures() {
        RegistrationHelper.addToBiome(
                RuinStructure.ID,
                BiomeSelectors.categories(Biome.Category.DESERT).and(RegistrationHelper.booleanToPredicate(true)).and(BiomeSelectors.foundInOverworld()),
                (context) -> RegistrationHelper.addStructure(context, PBObjects.RUIN)
        );
    }
    public static Identifier id(String name) {
        return new Identifier(MODID, name);
    }

    public static Predicate<BiomeSelectionContext> vanilla() {
        return context -> {
            // No data pack check bc it crash
            return context.getBiomeKey().getValue().getNamespace().equals("minecraft");
        };
    }
    public static NbtCompound getTagCompoundSafe(ItemStack stack) {
        NbtCompound tagCompound = stack.getTag();
        if (tagCompound == null) {
            tagCompound = new NbtCompound();
            stack.setTag(tagCompound);
        }
        return tagCompound;
    }
    public static final StatusEffect DEEP_BLUE_MOON_EFFECT = new DarkBlueMoonEffect();

    public static final EnchantmentTarget ARROW_HEAD = ClassTinkerers.getEnum(EnchantmentTarget.class, "ARROW_HEAD");

    public static final TheWorldEnchantment THE_WORLD_ENCHANTMENT = new TheWorldEnchantment(Enchantment.Rarity.COMMON, ARROW_HEAD, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    public static final TheSunEnchantment THE_SUN_ENCHANTMENT = new TheSunEnchantment(Enchantment.Rarity.COMMON, ARROW_HEAD, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    public static final StarPlatinumEnchantment STAR_PLATINUM_ENCHANTMENT = new StarPlatinumEnchantment(Enchantment.Rarity.COMMON, ARROW_HEAD, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    public static final DarkBlueMoonEnchantment DARK_BLUE_MOON_ENCHANTMENT = new DarkBlueMoonEnchantment(Enchantment.Rarity.COMMON, ARROW_HEAD, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    public static final CrazyDiamondEnchantment CRAZY_DIAMOND_ENCHANTMENT = new CrazyDiamondEnchantment(Enchantment.Rarity.COMMON, ARROW_HEAD, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    public static final WeatherReportEnchantment WEATHER_REPORT_ENCHANTMENT = new WeatherReportEnchantment(Enchantment.Rarity.COMMON, ARROW_HEAD, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    public static final KillerQueenEnchantment KILLER_QUEEN_ENCHANTMENT = new KillerQueenEnchantment(Enchantment.Rarity.COMMON, ARROW_HEAD, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    public static final KingCrimsonEnchantment KING_CRIMSON_ENCHANTMENT = new KingCrimsonEnchantment(Enchantment.Rarity.COMMON, ARROW_HEAD, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    public static final PurpleHazeEnchantment PURPLE_HAZE_ENCHANTMENT = new PurpleHazeEnchantment(Enchantment.Rarity.COMMON, ARROW_HEAD, new EquipmentSlot[] {EquipmentSlot.MAINHAND});


    @Override
    public void onInitialize() {


        GeckoLib.initialize();
        PBObjects.init();
        PBStatusEffects.init();
        PBCommands.registerArgumentTypes();
        registerStructures();
        putStructures();


        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
            LiteralCommandNode<ServerCommandSource> phantombloodNode = CommandManager
                    .literal("phantomblood").requires(source -> source.hasPermissionLevel(2)).build();
            LiteralCommandNode<ServerCommandSource> standNode = CommandManager
                    .literal("stand").build();
            LiteralCommandNode<ServerCommandSource> removeNode = CommandManager
                    .literal("remove")
                    .executes(context -> removeStand(context, context.getSource().getPlayer())).build();
            LiteralCommandNode<ServerCommandSource> setNode = CommandManager
                    .literal("set").build();
            LiteralCommandNode<ServerCommandSource> setHamonNode = CommandManager
                    .literal("hamon")
                    .executes(context -> hamon(context, context.getSource().getPlayer()))
                    .build();
            ArgumentCommandNode<ServerCommandSource, EntitySelector> hamonNode =
                    argument("player", EntityArgumentType.player())
                    .executes(context -> hamon(context, EntityArgumentType.getPlayer(context,"player")))
                    .build();
            ArgumentCommandNode<ServerCommandSource, EntitySelector> playerRemoveNode =
                    argument("player", EntityArgumentType.player())
                    .executes(context -> removeStand(context, EntityArgumentType.getPlayer(context, "player")))
                    .build();
            ArgumentCommandNode<ServerCommandSource, EntitySelector> playerSetNode =
                    argument("player", EntityArgumentType.player()).build();
            LiteralCommandNode<ServerCommandSource> setTheWorld = CommandManager.literal("the_world").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.THE_WORLD)).build();
            LiteralCommandNode<ServerCommandSource> setTheSun = CommandManager.literal("the_sun").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.THE_SUN)).build();
            LiteralCommandNode<ServerCommandSource> setStarsPlatinum = CommandManager.literal("star_platinum").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.STAR_PLATINUM)).build();
            LiteralCommandNode<ServerCommandSource> setWeatherReport = CommandManager.literal("weather_report").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.WEATHER_REPORT)).build();
            LiteralCommandNode<ServerCommandSource> setKillerQueen = CommandManager.literal("killer_queen").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.KILLER_QUEEN)).build();
            LiteralCommandNode<ServerCommandSource> setDarkBlueMoon = CommandManager.literal("dark_blue_moon").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.DARK_BLUE_MOON)).build();
            LiteralCommandNode<ServerCommandSource> setCrazyDiamond = CommandManager.literal("crazy_diamond").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.CRAZY_DIAMOND)).build();
            LiteralCommandNode<ServerCommandSource> setKingCrimson = CommandManager.literal("king_crimson").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.KING_CRIMSON)).build();
            LiteralCommandNode<ServerCommandSource> setPurpleHaze = CommandManager.literal("purple_haze").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.PURPLE_HAZE)).build();
            LiteralCommandNode<ServerCommandSource> setTwentyCenturyBoy = CommandManager.literal("20_century_boy").executes(context -> setStand(context, EntityArgumentType.getPlayer(context, "player"), Stand.TWENTY_CENTURY_BOY)).build();

            dispatcher.getRoot().addChild(phantombloodNode);
            phantombloodNode.addChild(standNode);
            phantombloodNode.addChild(setHamonNode);
            setHamonNode.addChild(hamonNode);
            standNode.addChild(removeNode);
            standNode.addChild(setNode);
            removeNode.addChild(playerRemoveNode);
            setNode.addChild(playerSetNode);
            playerSetNode.addChild(setTheWorld);
            playerSetNode.addChild(setTheSun);
            playerSetNode.addChild(setStarsPlatinum);
            playerSetNode.addChild(setWeatherReport);
            playerSetNode.addChild(setKillerQueen);
            playerSetNode.addChild(setDarkBlueMoon);
            playerSetNode.addChild(setCrazyDiamond);
            playerSetNode.addChild(setKingCrimson);
            playerSetNode.addChild(setPurpleHaze);
            playerSetNode.addChild(setTwentyCenturyBoy);
        });


        Registry.register(Registry.STATUS_EFFECT, new Identifier("phantomblood", "dark_blue_moon_effect"), DEEP_BLUE_MOON_EFFECT);


        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, identifier, fabricLootSupplierBuilder, lootTableSetter) -> {
            Identifier nether_fortress = new Identifier(PhantomBlood.MODID, "inject/nether_fortress");
            Identifier simple_dungeon = new Identifier(PhantomBlood.MODID, "inject/simple_dungeon");
            if (LootTables.NETHER_BRIDGE_CHEST.equals(identifier)) {
                fabricLootSupplierBuilder.withPool(LootPool.builder().with(LootTableEntry.builder(nether_fortress).weight(1)).build());
            }
            if (LootTables.DESERT_PYRAMID_CHEST.equals(identifier) || LootTables.SIMPLE_DUNGEON_CHEST.equals(identifier)) {
                fabricLootSupplierBuilder.withPool(LootPool.builder().with(LootTableEntry.builder(simple_dungeon).weight(1)).build());
            }
        });

        //Vampire Coat abilities, if ampoule is in off-hand, add blood ampoule on villager hit, otherwise, 10% chance to give blood directly to user
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack chest = player.getEquippedStack(EquipmentSlot.CHEST);
            ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
            if (hand == Hand.MAIN_HAND && chest.getItem() == PBObjects.VAMPIRE_BOOTS && entity.isAlive() && ((Vampirable) player).isVampire() && player.getStackInHand(hand).isEmpty()) {
                ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 4));
                //Inflict slowness on hit with empty hand
            }
            if (!world.isClient && chest.getItem() == PBObjects.VAMPIRE_JACKET || chest.getItem() == PBObjects.VAMPIRE_JACKET_F && ((Vampirable) player).isVampire() && VampireBloodManager.Companion.getGoodBloodTag().contains(entity.getType())) {
                if (player.getOffHandStack().getItem() == PBObjects.AMPOULE) {
                    PBUtil.addItemToInventoryAndConsume(player, Hand.OFF_HAND, new ItemStack(PBObjects.BLOOD_AMPOULE));
                    return ActionResult.SUCCESS;
                    //Create blood ampoule
                }
                HungerManager var4 = player.getHungerManager();
                int t = MathHelper.nextInt(world.random, 1, 10);
                if (t == 1) {
                    ((VampireBloodManager) var4).addBlood(2F);
                    return ActionResult.SUCCESS;
                    //Randomly give blood on hit w/o ampoule
                }
            }
            if(StandUtils.getStand(player) == Stand.KILLER_QUEEN && hand == Hand.MAIN_HAND){
                if(!player.inventory.contains(new ItemStack(PBObjects.KILLER_QUEEN_TRIGGER))){
                    ItemStack trigger = new ItemStack(PBObjects.KILLER_QUEEN_TRIGGER);
                    KillerQueenTriggerItem.setData(trigger, KillerQueenTriggerItem.TYPE.ENTITY.getName(), entity.getUuid().toString(), 0, 0, 0);
                    if(player.getStackInHand(Hand.MAIN_HAND).isEmpty()){
                        player.setStackInHand(Hand.MAIN_HAND, trigger);
                    }else{
                        player.dropItem(trigger, false, true);
                    }
               }else{
                    PlayerInventory inventory = player.inventory;
                    List<ItemStack> mainInventory = inventory.main;
                    for(ItemStack trigger : mainInventory) {
                        if(trigger.getItem() == PBObjects.KILLER_QUEEN_TRIGGER) {
                            KillerQueenTriggerItem.setData(trigger, KillerQueenTriggerItem.TYPE.ENTITY.getName(), entity.getUuid().toString(), 0, 0, 0);
                            break;
                        }
                    }
                }
            }
            return ActionResult.PASS;
        });
        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
            if(StandUtils.getStand(player) == Stand.KILLER_QUEEN && hand == Hand.MAIN_HAND) {
                if(!player.inventory.contains(new ItemStack(PBObjects.KILLER_QUEEN_TRIGGER))){
                    ItemStack trigger = new ItemStack(PBObjects.KILLER_QUEEN_TRIGGER);
                    KillerQueenTriggerItem.setData(trigger, KillerQueenTriggerItem.TYPE.BLOCK.getName(),"empty",pos.getX(), pos.getY(), pos.getZ());
                    if(player.getStackInHand(Hand.MAIN_HAND).isEmpty()){
                        player.setStackInHand(Hand.MAIN_HAND, trigger);
                    }else{
                        player.dropItem(trigger, false, true);
                    }
                }else{
                    PlayerInventory inventory = player.inventory;
                    List<ItemStack> mainInventory = inventory.main;
                    for(ItemStack trigger : mainInventory) {
                        if(trigger.getItem() == PBObjects.KILLER_QUEEN_TRIGGER) {
                            System.out.println("Yee");
                            KillerQueenTriggerItem.setData(trigger, KillerQueenTriggerItem.TYPE.BLOCK.getName(),"empty",pos.getX(), pos.getY(), pos.getZ());
                            break;
                        }
                    }
                }
            }
            return ActionResult.PASS;
        });

        WorldSleepEvents.WORLD_WAKE_TIME.register((world, newTime, curTime) -> {
            if (world.isDay()) {
                long time = curTime;
                while (time % 24000 < 13000) {
                    time++;
                }
                return time;
            }
            return newTime;
        });
        PlayerSleepEvents.CAN_SLEEP_NOW.register((player, pos) -> {
            if (player.world.getBlockState(pos).getBlock() instanceof CoffinBlock) {
                return player.world.isDay() ? TriState.TRUE : TriState.FALSE;
            }
            return TriState.DEFAULT;
        });
        PlayerSleepEvents.TRY_SLEEP.register((player, pos) -> {
            if (player.world.getBlockState(pos).getBlock() instanceof CoffinBlock && player.world.isNight()) {
                player.sendMessage(new TranslatableText("block.minecraft.bed.coffin"), true);
                return PlayerEntity.SleepFailureReason.OTHER_PROBLEM;
            }
            return null;
        });

        //Keybind Serverside
        ServerPlayNetworking.registerGlobalReceiver(new Identifier("phantomblood:use_ability"), (server, player, handler, buf, response) -> {
            StandUtils.getStand(player).handler.receive(server, player, handler, buf, response);
        });
        ServerPlayNetworking.registerGlobalReceiver(new Identifier("phantomblood:toggle_stand"), (server, player, handler, buf, response) -> {
            server.execute(() -> StandUtils.toggleStandActive(player));
        });
        ServerPlayNetworking.registerGlobalReceiver(new Identifier("phantomblood:change_stand_mode"), (server, player, handler, buf, response) -> {
            server.execute(() -> StandUtils.setToNextStandMode(player));
        });

        new StoppedTimeDamageHandler().registerCallbacks();


        ServerTickEvents.START_WORLD_TICK.register((new StandPunchHandler()));
        Registry.register(Registry.ENCHANTMENT, new Identifier(PhantomBlood.MODID, "the_world_enchantment"), THE_WORLD_ENCHANTMENT);
        Registry.register(Registry.ENCHANTMENT, new Identifier(PhantomBlood.MODID, "the_sun_enchantment"), THE_SUN_ENCHANTMENT);
        Registry.register(Registry.ENCHANTMENT, new Identifier(PhantomBlood.MODID, "star_platinum_enchantment"), STAR_PLATINUM_ENCHANTMENT);
        Registry.register(Registry.ENCHANTMENT, new Identifier(PhantomBlood.MODID, "dark_blue_moon_enchantment"), DARK_BLUE_MOON_ENCHANTMENT);
        Registry.register(Registry.ENCHANTMENT, new Identifier(PhantomBlood.MODID, "crazy_diamond_enchantment"), CRAZY_DIAMOND_ENCHANTMENT);
        Registry.register(Registry.ENCHANTMENT, new Identifier(PhantomBlood.MODID, "killer_queen_enchantment"), KILLER_QUEEN_ENCHANTMENT);
        Registry.register(Registry.ENCHANTMENT, new Identifier(PhantomBlood.MODID, "weather_report_enchantment"), WEATHER_REPORT_ENCHANTMENT);
        Registry.register(Registry.ENCHANTMENT, new Identifier(PhantomBlood.MODID, "king_crimson_enchantment"), KING_CRIMSON_ENCHANTMENT);
        Registry.register(Registry.ENCHANTMENT, new Identifier(PhantomBlood.MODID, "purple_haze_enchantment"), PURPLE_HAZE_ENCHANTMENT);
    }

    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(StandUserComponent.entityKey, StandUserComponentImpl::new, RespawnCopyStrategy.ALWAYS_COPY);
    }

    public void registerWorldComponentFactories(WorldComponentFactoryRegistry registry) {
        registry.register(TimeStopComponent.worldKey, TimeStopComponentImpl::new);
    }
}