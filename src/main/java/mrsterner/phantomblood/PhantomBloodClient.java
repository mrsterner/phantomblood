package mrsterner.phantomblood;

import mrsterner.phantomblood.client.EntitySpawnPacket;
import mrsterner.phantomblood.client.StandUserHud;
import mrsterner.phantomblood.client.ZaWarudoShader;
import mrsterner.phantomblood.client.model.stand.*;
import mrsterner.phantomblood.client.renderer.armor.BloodStonemaskRenderer;
import mrsterner.phantomblood.client.renderer.armor.StonemaskRenderer;
import mrsterner.phantomblood.client.renderer.armor.VampireArmorFRenderer;
import mrsterner.phantomblood.client.renderer.armor.VampireArmorRenderer;
import mrsterner.phantomblood.client.renderer.item.AnubisSwordRenderer;
import mrsterner.phantomblood.client.renderer.item.BloodStonemaskItemRenderer;
import mrsterner.phantomblood.client.renderer.item.StonemaskItemRenderer;
import mrsterner.phantomblood.client.renderer.stand.*;
import mrsterner.phantomblood.client.PBClientTickEvents;
import mrsterner.phantomblood.common.item.*;
import mrsterner.phantomblood.common.registry.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;
import sun.security.provider.Sun;

import java.util.Optional;
import java.util.UUID;


@Environment(EnvType.CLIENT)
public class PhantomBloodClient implements ClientModInitializer {

    ZaWarudoShader zaWarudoShader = new ZaWarudoShader();

    public static final Identifier PacketID = new Identifier(PhantomBlood.MODID, "spawn_packet");

    public void receiveEntityPacket() {
        ClientSidePacketRegistry.INSTANCE.register(PacketID, (ctx, byteBuf) -> {
            EntityType<?> entityType = Registry.ENTITY_TYPE.get(byteBuf.readVarInt());
            UUID uuid = byteBuf.readUuid();
            int entityId = byteBuf.readVarInt();
            Vec3d pos = EntitySpawnPacket.PacketBufUtil.readVec3d(byteBuf);
            float pitch = EntitySpawnPacket.PacketBufUtil.readAngle(byteBuf);
            float yaw = EntitySpawnPacket.PacketBufUtil.readAngle(byteBuf);
            ctx.getTaskQueue().execute(() -> {
                if (MinecraftClient.getInstance().world == null)
                    throw new IllegalStateException("Tried to spawn entity in a null world!");
                Entity entity = entityType.create(MinecraftClient.getInstance().world);
                if (entity == null)
                    throw new IllegalStateException("Failed to create instance of entity \"" + Registry.ENTITY_TYPE.getId(entityType) + "\"!");
                entity.updateTrackedPosition(pos);
                entity.setPos(pos.x, pos.y, pos.z);
                entity.pitch = pitch;
                entity.yaw = yaw;
                entity.setEntityId(entityId);
                entity.setUuid(uuid);
                MinecraftClient.getInstance().world.addEntity(entityId, entity);
            });
        });
    }


    @Override
    public void onInitializeClient() {
        PBClientTickEvents.init();

        EntityRendererRegistry.INSTANCE.register(PhantomBlood.KillerVirusEntityType, (dispatcher, context) -> new FlyingItemEntityRenderer(dispatcher, context.getItemRenderer()));receiveEntityPacket();
        EntityRendererRegistry.INSTANCE.register(PhantomBlood.KillerVirusCloudEntityType, (dispatcher, context) -> new FlyingItemEntityRenderer(dispatcher, context.getItemRenderer()));receiveEntityPacket();
        EntityRendererRegistry.INSTANCE.register(PhantomBlood.EMERALD_SPLASH_ENTITY_TYPE, (dispatcher, context) -> new FlyingItemEntityRenderer(dispatcher, context.getItemRenderer()));


        Registry.ITEM.forEach((item) -> {
            if(item instanceof AnubisSwordItem) {
                FabricModelPredicateProviderRegistry.register(item, new Identifier("blocking"), (stack, world, entity) ->
                        entity != null && entity.isUsingItem() ? 1.0F : 0.0F);
            }
        });


        ClientPlayNetworking.registerGlobalReceiver(new Identifier("phantomblood:stop_time"), (client, handler, buf, responseSender) -> {
            UUID uuid = buf.readUuid();
            long ticks = buf.readVarLong();
            client.execute(() -> {
                World world = client.world;
                if (world != null) {
                    zaWarudoShader.player = Optional.ofNullable(world.getPlayerByUuid(uuid)).orElse(client.player);
                    zaWarudoShader.effectLength = ticks;
                    zaWarudoShader.shouldRender = true;
                }
            });
        });
        zaWarudoShader.registerCallbacks();

        WorldRenderEvents.LAST.register(new TheWorldFirstPersonArmRenderer());
        WorldRenderEvents.LAST.register(new KillerQueenFirstPersonArmRenderer());
        WorldRenderEvents.LAST.register(new StarPlatinumFirstPersonArmRenderer());
        WorldRenderEvents.LAST.register(new CrazyDiamondFirstPersonArmRenderer());
        WorldRenderEvents.LAST.register(new WeatherReportFirstPersonArmRenderer());
        WorldRenderEvents.LAST.register(new DarkBlueMoonFirstPersonArmRenderer());
        WorldRenderEvents.LAST.register(new KingCrimsonFirstPersonArmRenderer());
        WorldRenderEvents.LAST.register(new PurpleHazeFirstPersonArmRenderer());

        HudRenderCallback.EVENT.register(new StandUserHud());


        LivingEntityFeatureRendererRegistrationCallback.EVENT.register((entityType, entityRenderer, registrationHelper) -> {
            if (entityType == EntityType.PLAYER) {
                //noinspection unchecked
                registrationHelper.register(new TheWorldFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new TheWorldModel()));
                registrationHelper.register(new KillerQueenFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new KillerQueenModel()));
                registrationHelper.register(new StarPlatinumFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new StarPlatinumModel()));
                registrationHelper.register(new CrazyDiamondFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new CrazyDiamondModel()));
                registrationHelper.register(new WeatherReportFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new WeatherReportModel()));
                registrationHelper.register(new DarkBlueMoonFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new DarkBlueMoonModel()));
                registrationHelper.register(new TheSunFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new TheSunModel()));
                registrationHelper.register(new KingCrimsonFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new KingCrimsonModel()));
                registrationHelper.register(new PurpleHazeFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new PurpleHazeModel()));
                registrationHelper.register(new HierophantGreenFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new HierophantGreenModel()));
            }
        });

        GeoItemRenderer.registerItemRenderer(PBObjects.STONE_MASK_ITEM, new StonemaskItemRenderer());
        GeoItemRenderer.registerItemRenderer(PBObjects.BLOODY_STONE_MASK_ITEM, new BloodStonemaskItemRenderer());
        StonemaskRenderer.registerArmorRenderer(StonemaskItem.class, new StonemaskRenderer());
        BloodStonemaskRenderer.registerArmorRenderer(BloodStonemaskItem.class, new BloodStonemaskRenderer());
        GeoArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());
        VampireArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(VampireArmorFItem.class, new VampireArmorFRenderer());
        VampireArmorFRenderer.registerArmorRenderer(VampireArmorFItem.class, new VampireArmorFRenderer());

        GeoItemRenderer.registerItemRenderer(PBObjects.ANUBIS_SWORD, new AnubisSwordRenderer());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> tintIndex == 1 ? ((BedBlock) state.getBlock()).getColor().getFireworkColor() : 0xffffff,
                PBObjects.BLACK_COFFIN, PBObjects.RED_COFFIN, PBObjects.GREEN_COFFIN, PBObjects.BROWN_COFFIN, PBObjects.BLUE_COFFIN, PBObjects.PURPLE_COFFIN, PBObjects.CYAN_COFFIN, PBObjects.LIGHT_GRAY_COFFIN,
                PBObjects.GRAY_COFFIN, PBObjects.PINK_COFFIN, PBObjects.LIME_COFFIN, PBObjects.YELLOW_COFFIN, PBObjects.LIGHT_BLUE_COFFIN, PBObjects.MAGENTA_COFFIN, PBObjects.ORANGE_COFFIN, PBObjects.WHITE_COFFIN);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> tintIndex == 1 ? ((BedBlock) Block.getBlockFromItem(stack.getItem())).getColor().getFireworkColor() : 0xffffff,
                PBObjects.BLACK_COFFIN, PBObjects.RED_COFFIN, PBObjects.GREEN_COFFIN, PBObjects.BROWN_COFFIN, PBObjects.BLUE_COFFIN, PBObjects.PURPLE_COFFIN, PBObjects.CYAN_COFFIN, PBObjects.LIGHT_GRAY_COFFIN,
                PBObjects.GRAY_COFFIN, PBObjects.PINK_COFFIN, PBObjects.LIME_COFFIN, PBObjects.YELLOW_COFFIN, PBObjects.LIGHT_BLUE_COFFIN, PBObjects.MAGENTA_COFFIN, PBObjects.ORANGE_COFFIN, PBObjects.WHITE_COFFIN);


    }
}