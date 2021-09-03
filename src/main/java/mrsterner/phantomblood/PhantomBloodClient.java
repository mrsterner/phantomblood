package mrsterner.phantomblood;

import mrsterner.phantomblood.client.EntitySpawnPacket;
import mrsterner.phantomblood.client.StandUserHud;
import mrsterner.phantomblood.client.ZaWarudoShader;
import mrsterner.phantomblood.client.model.HamonModel;
import mrsterner.phantomblood.client.model.stand.*;
import mrsterner.phantomblood.client.renderer.item.AnubisSwordRenderer;
import mrsterner.phantomblood.client.renderer.item.BloodStonemaskItemRenderer;
import mrsterner.phantomblood.client.renderer.item.StonemaskItemRenderer;
import mrsterner.phantomblood.client.PBClientTickEvents;
import mrsterner.phantomblood.common.item.*;
import mrsterner.phantomblood.common.registry.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

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
               // entity.pitch = pitch;
               // entity.yaw = yaw;
                entity.setId(entityId);
                entity.setUuid(uuid);
                MinecraftClient.getInstance().world.addEntity(entityId, entity);
            });
        });
    }

    public static final EntityModelLayer THE_WORLD_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "the_world"), "main");
    public static final EntityModelLayer STAR_PLATINUM_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "start_platinum"), "main");
    public static final EntityModelLayer KILLER_QUEEN_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "killer_queen"), "main");
    public static final EntityModelLayer CRAZY_DIAMOND_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "crazy_diamond"), "main");
    public static final EntityModelLayer WEATHER_REPORT_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "weather_report"), "main");
    public static final EntityModelLayer DARK_BLUE_MOON_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "dark_blue_moon"), "main");
    public static final EntityModelLayer THE_SUN_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "the_sun"), "main");
    public static final EntityModelLayer KING_CRIMSON_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "king_crimson"), "main");
    public static final EntityModelLayer PURPLE_HAZE_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "purple_haze"), "main");
    public static final EntityModelLayer HIEROPHANT_GREEN_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "hierophant_green"), "main");
    public static final EntityModelLayer HAMON_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "hamon"), "main");
    public static final EntityModelLayer TWENTY_CENTURY_BOY_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "twenty_century_boy"), "main");

    @Override
    public void onInitializeClient() {
        PBClientTickEvents.init();

        //EntityRendererRegistry.INSTANCE.register(PhantomBlood.KillerVirusEntityType, (dispatcher, context) -> new FlyingItemEntityRenderer(dispatcher, context.getItemRenderer()));receiveEntityPacket();
        //EntityRendererRegistry.INSTANCE.register(PhantomBlood.KillerVirusCloudEntityType, (dispatcher, context) -> new FlyingItemEntityRenderer(dispatcher, context.getItemRenderer()));receiveEntityPacket();
        EntityRendererRegistry.INSTANCE.register(PhantomBlood.EMERALD_SPLASH_ENTITY_TYPE, (dispatcher, context) -> new FlyingItemEntityRenderer(dispatcher, context.getItemRenderer()));


        Registry.ITEM.forEach((item) -> {
            if(item instanceof AnubisSwordItem) {
                FabricModelPredicateProviderRegistry.register(item, new Identifier("blocking"), (stack, world, entity, context) ->
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


        HudRenderCallback.EVENT.register(new StandUserHud());


        EntityModelLayerRegistry.registerModelLayer(THE_WORLD_MODEL_LAYER, TheWorldModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(KILLER_QUEEN_MODEL_LAYER, KillerQueenModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(STAR_PLATINUM_MODEL_LAYER, StarPlatinumModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(CRAZY_DIAMOND_MODEL_LAYER, CrazyDiamondModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(WEATHER_REPORT_MODEL_LAYER, WeatherReportModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(DARK_BLUE_MOON_MODEL_LAYER, DarkBlueMoonModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(THE_SUN_MODEL_LAYER, TheSunModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(KING_CRIMSON_MODEL_LAYER, KingCrimsonModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(PURPLE_HAZE_MODEL_LAYER, PurpleHazeModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(HIEROPHANT_GREEN_MODEL_LAYER, HierophantGreenModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(TWENTY_CENTURY_BOY_MODEL_LAYER, TwentyCenturyBoyModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(HAMON_MODEL_LAYER, HamonModel::getTexturedModelData);


        GeoItemRenderer.registerItemRenderer(PBObjects.STONE_MASK_ITEM, new StonemaskItemRenderer());
        GeoItemRenderer.registerItemRenderer(PBObjects.BLOODY_STONE_MASK_ITEM, new BloodStonemaskItemRenderer());
        //StonemaskRenderer.registerArmorRenderer(StonemaskItem.class, new StonemaskRenderer());
        //BloodStonemaskRenderer.registerArmorRenderer(BloodStonemaskItem.class, (ctx) -> new BloodStonemaskRenderer(ctx));
        //GeoArmorRenderer.registerArmorRenderer(BloodStonemaskItem.class, (context) -> new BloodStonemaskRenderer(context));
        //GeoArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());
        //VampireArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());
        //GeoArmorRenderer.registerArmorRenderer(VampireArmorFItem.class, new VampireArmorFRenderer());
        //VampireArmorFRenderer.registerArmorRenderer(VampireArmorFItem.class, new VampireArmorFRenderer());

        GeoItemRenderer.registerItemRenderer(PBObjects.ANUBIS_SWORD, new AnubisSwordRenderer());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> tintIndex == 1 ? ((BedBlock) state.getBlock()).getColor().getFireworkColor() : 0xffffff,
                PBObjects.BLACK_COFFIN, PBObjects.RED_COFFIN, PBObjects.GREEN_COFFIN, PBObjects.BROWN_COFFIN, PBObjects.BLUE_COFFIN, PBObjects.PURPLE_COFFIN, PBObjects.CYAN_COFFIN, PBObjects.LIGHT_GRAY_COFFIN,
                PBObjects.GRAY_COFFIN, PBObjects.PINK_COFFIN, PBObjects.LIME_COFFIN, PBObjects.YELLOW_COFFIN, PBObjects.LIGHT_BLUE_COFFIN, PBObjects.MAGENTA_COFFIN, PBObjects.ORANGE_COFFIN, PBObjects.WHITE_COFFIN);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> tintIndex == 1 ? ((BedBlock) Block.getBlockFromItem(stack.getItem())).getColor().getFireworkColor() : 0xffffff,
                PBObjects.BLACK_COFFIN, PBObjects.RED_COFFIN, PBObjects.GREEN_COFFIN, PBObjects.BROWN_COFFIN, PBObjects.BLUE_COFFIN, PBObjects.PURPLE_COFFIN, PBObjects.CYAN_COFFIN, PBObjects.LIGHT_GRAY_COFFIN,
                PBObjects.GRAY_COFFIN, PBObjects.PINK_COFFIN, PBObjects.LIME_COFFIN, PBObjects.YELLOW_COFFIN, PBObjects.LIGHT_BLUE_COFFIN, PBObjects.MAGENTA_COFFIN, PBObjects.ORANGE_COFFIN, PBObjects.WHITE_COFFIN);


    }
}