package mrsterner.phantomblood;

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
import mrsterner.phantomblood.common.item.BloodStonemaskItem;
import mrsterner.phantomblood.common.item.StonemaskItem;
import mrsterner.phantomblood.common.item.VampireArmorFItem;
import mrsterner.phantomblood.common.item.VampireArmorItem;
import mrsterner.phantomblood.common.registry.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendereregistry.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

import java.util.Optional;
import java.util.UUID;


@Environment(EnvType.CLIENT)
public class PhantomBloodClient implements ClientModInitializer {

    ZaWarudoShader zaWarudoShader = new ZaWarudoShader();

    @Override
    public void onInitializeClient() {
        PBClientTickEvents.init();


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