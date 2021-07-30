package mrsterner.phantomblood;

import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import dev.onyxstudios.cca.api.v3.world.WorldComponentFactoryRegistry;
import mrsterner.phantomblood.common.CommandCallback;
import mrsterner.phantomblood.common.StandCallback;
import mrsterner.phantomblood.common.StandPunchHandler;
import mrsterner.phantomblood.common.VampireCallback;
import mrsterner.phantomblood.common.entity.KillerVirusCloudEntity;
import mrsterner.phantomblood.common.entity.KillerVirusEntity;
import mrsterner.phantomblood.common.hamon.HamonUserComponent;
import mrsterner.phantomblood.common.hamon.HamonUserComponentImpl;
import mrsterner.phantomblood.common.stand.*;
import mrsterner.phantomblood.common.timestop.StoppedTimeDamageHandler;
import mrsterner.phantomblood.common.timestop.TimeStopComponent;
import mrsterner.phantomblood.common.timestop.TimeStopComponentImpl;
import nerdhub.cardinal.components.api.util.RespawnCopyStrategy;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.nbt.NbtCompound;
import mrsterner.phantomblood.common.registry.*;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;
import dev.onyxstudios.cca.api.v3.world.WorldComponentInitializer;


public final class PhantomBlood implements ModInitializer, EntityComponentInitializer, WorldComponentInitializer  {

    public static final String MODID = "phantomblood";
    public static final ItemGroup PHANTOMBLOOD_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, MODID), () -> new ItemStack(PBObjects.STONE_MASK_ITEM));

    //Killer Queen Tagger
    public static NbtCompound getTagCompoundSafe(ItemStack stack) {
        NbtCompound tagCompound = stack.getTag();
        if (tagCompound == null) {
            tagCompound = new NbtCompound();
            stack.setTag(tagCompound);
        }
        return tagCompound;
    }
    public static final EntityType<KillerVirusEntity> KillerVirusEntityType = Registry.register(Registry.ENTITY_TYPE, new Identifier(PhantomBlood.MODID, "killer_virus"),
            FabricEntityTypeBuilder.<KillerVirusEntity>create(SpawnGroup.MISC, KillerVirusEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F)).trackRangeBlocks(4).trackedUpdateRate(10).build()
    );
    public static final EntityType<KillerVirusCloudEntity> KillerVirusCloudEntityType = Registry.register(Registry.ENTITY_TYPE, new Identifier(PhantomBlood.MODID, "killer_virus_cloud"),
            FabricEntityTypeBuilder.<KillerVirusCloudEntity>create(SpawnGroup.MISC, KillerVirusCloudEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F)).trackRangeBlocks(4).trackedUpdateRate(10).build()
    );

    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        PBObjects.init();
        PBStatusEffects.init();
        PBEnchantments.init();
        PBCommands.init();
        CommandCallback.init();
        VampireCallback.init();
        StandCallback.init();
        PBStructures.init();

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

    }

    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(StandUserComponent.entityKey, StandUserComponentImpl::new, RespawnCopyStrategy.ALWAYS_COPY);
        registry.registerForPlayers(HamonUserComponent.entityKey, HamonUserComponentImpl::new, RespawnCopyStrategy.ALWAYS_COPY);
    }

    public void registerWorldComponentFactories(WorldComponentFactoryRegistry registry) {
        registry.register(TimeStopComponent.worldKey, TimeStopComponentImpl::new);
    }
}