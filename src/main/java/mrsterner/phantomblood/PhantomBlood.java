package mrsterner.phantomblood;

import com.williambl.haema.Vampirable;
import com.williambl.haema.VampireBloodManager;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import dev.onyxstudios.cca.api.v3.world.WorldComponentFactoryRegistry;
import mrsterner.phantomblood.client.StandPunchHandler;
import mrsterner.phantomblood.common.block.CoffinBlock;
import mrsterner.phantomblood.common.item.KillerQueenTriggerItem;
import mrsterner.phantomblood.common.registry.PBUtil;
import mrsterner.phantomblood.common.worldgen.structure.RuinStructure;
import mrsterner.phantomblood.common.worldgen.RegistrationHelper;
import mrsterner.phantomblood.stand.*;
import mrsterner.phantomblood.timestop.StoppedTimeDamageHandler;
import mrsterner.phantomblood.timestop.TimeStopComponent;
import mrsterner.phantomblood.timestop.TimeStopComponentImpl;
import nerdhub.cardinal.components.api.util.RespawnCopyStrategy;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.fabricmc.fabric.api.util.TriState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.nbt.CompoundTag;
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
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;
import org.apache.logging.log4j.LogManager;
import software.bernie.geckolib3.GeckoLib;
import top.theillusivec4.somnus.api.PlayerSleepEvents;
import top.theillusivec4.somnus.api.WorldSleepEvents;
import dev.onyxstudios.cca.api.v3.world.WorldComponentInitializer;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.function.Predicate;




public final class PhantomBlood implements ModInitializer, EntityComponentInitializer, WorldComponentInitializer  {
    private static final Logger LOGGER = LogManager.getLogger();

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
    public static CompoundTag getTagCompoundSafe(ItemStack stack) {
        CompoundTag tagCompound = stack.getTag();
        if (tagCompound == null) {
            tagCompound = new CompoundTag();
            stack.setTag(tagCompound);
        }
        return tagCompound;
    }

    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        PBObjects.init();
        registerStructures();
        putStructures();


        //Vampire Coat abilities, if ampoule is in off-hand, add blood ampoule on villager hit, otherwise, 10% chance to give blood directly to user
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack chest = player.getEquippedStack(EquipmentSlot.CHEST);
            ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
            if (hand == Hand.MAIN_HAND && chest.getItem() == PBObjects.VAMPIRE_BOOTS && entity.isAlive() && ((Vampirable) player).isVampire() && player.getStackInHand(hand).isEmpty()) {
                ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 4));
                //Inflict slowness on hit with empty hand
            }
            if (!world.isClient && chest.getItem() == PBObjects.VAMPIRE_JACKET && ((Vampirable) player).isVampire() && VampireBloodManager.Companion.getGoodBloodTag().contains(entity.getType())) {
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
                    player.setStackInHand(hand, trigger);
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
                    player.setStackInHand(hand, trigger);
                }else{
                    PlayerInventory inventory = player.inventory;
                    List<ItemStack> mainInventory = inventory.main;
                    for(ItemStack trigger : mainInventory) {
                        if(trigger.getItem() == PBObjects.KILLER_QUEEN_TRIGGER) {
                            KillerQueenTriggerItem.setData(trigger, KillerQueenTriggerItem.TYPE.BLOCK.getName(),"empty",pos.getX(), pos.getY(), pos.getZ());
                            break;
                        }
                    }
                }
            }
            return ActionResult.PASS;
        });


        //Somnus and Coffin code for sleep on the day
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
    }

    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(StandUserComponent.entityKey, StandUserComponentImpl::new, RespawnCopyStrategy.ALWAYS_COPY);
    }

    public void registerWorldComponentFactories(WorldComponentFactoryRegistry registry) {
        registry.register(TimeStopComponent.worldKey, TimeStopComponentImpl::new);
    }





}