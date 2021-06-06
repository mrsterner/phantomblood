package mrsterner.phantomblood.client;

import mrsterner.phantomblood.client.model.stand.KillerQueenAttackingModel;
import mrsterner.phantomblood.client.model.stand.KillerQueenIdleModel;
import mrsterner.phantomblood.client.model.stand.TheWorldAttackingModel;
import mrsterner.phantomblood.client.model.stand.TheWorldIdleModel;
import mrsterner.phantomblood.client.renderer.armor.BloodStonemaskRenderer;
import mrsterner.phantomblood.client.renderer.armor.StonemaskRenderer;
import mrsterner.phantomblood.client.renderer.armor.VampireArmorFRenderer;
import mrsterner.phantomblood.client.renderer.armor.VampireArmorRenderer;
import mrsterner.phantomblood.client.renderer.item.BloodStonemaskItemRenderer;
import mrsterner.phantomblood.client.renderer.item.StonemaskItemRenderer;
import mrsterner.phantomblood.client.stand.KillerQueenFeatureRenderer;
import mrsterner.phantomblood.client.stand.KillerQueenFirstPersonArmRenderer;
import mrsterner.phantomblood.client.stand.TheWorldFeatureRenderer;
import mrsterner.phantomblood.client.stand.TheWorldFirstPersonArmRenderer;
import mrsterner.phantomblood.common.item.BloodStonemaskItem;
import mrsterner.phantomblood.common.item.StonemaskItem;
import mrsterner.phantomblood.common.item.VampireArmorItem;
import mrsterner.phantomblood.common.registry.*;
import mrsterner.phantomblood.stand.Stand;
import mrsterner.phantomblood.stand.StandUtils;
import mrsterner.phantomblood.timestop.TimeStopUtils;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendereregistry.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.lwjgl.glfw.GLFW;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

import java.util.Optional;
import java.util.UUID;


@Environment(EnvType.CLIENT)
public class PhantomBloodClient implements ClientModInitializer {
    KeyBinding useAbilityKeybind = KeyBindingHelper.registerKeyBinding(new KeyBinding("phantomblood.key.use_ability", GLFW.GLFW_KEY_O, "key.categories.gameplay"));
    boolean wasUseAbilityKeybindPressed = false;
    KeyBinding toggleStandKeybind = KeyBindingHelper.registerKeyBinding(new KeyBinding("phantomblood.key.toggle_stand", GLFW.GLFW_KEY_P, "key.categories.gameplay"));
    boolean wasToggleStandKeybindPressed = false;
    KeyBinding changeStandModeKeybind = KeyBindingHelper.registerKeyBinding(new KeyBinding("phantomblood.key.change_stand_mode", GLFW.GLFW_KEY_I, "key.categories.gameplay"));
    boolean wasChangeStandKeybindPressed = false;

    public ZaWarudoShader zaWarudoShader = new ZaWarudoShader();

    @Override
    public void onInitializeClient() {

        ClientTickEvents.START_WORLD_TICK.register(world -> {
            PlayerEntity player = MinecraftClient.getInstance().player;
            if (player != null && StandUtils.getStand(player) != Stand.NONE) {
                if (useAbilityKeybind.isPressed()) {
                    if (TimeStopUtils.getTimeStoppedTicks(world) < 0 && !wasUseAbilityKeybindPressed) {
                        ClientPlayNetworking.send(new Identifier("phantomblood:use_ability"), PacketByteBufs.create());
                    }
                    wasUseAbilityKeybindPressed = true;
                } else {
                    wasUseAbilityKeybindPressed = false;
                }
                if (toggleStandKeybind.isPressed()) {
                    if (!wasToggleStandKeybindPressed) {
                        ClientPlayNetworking.send(new Identifier("phantomblood:toggle_stand"), PacketByteBufs.create());
                    }
                    wasToggleStandKeybindPressed = true;
                } else {
                    wasToggleStandKeybindPressed = false;
                }
                if (changeStandModeKeybind.isPressed()) {
                    if (!wasChangeStandKeybindPressed) {
                        ClientPlayNetworking.send(new Identifier("phantomblood:change_stand_mode"), PacketByteBufs.create());
                    }
                    wasChangeStandKeybindPressed = true;
                } else {
                    wasChangeStandKeybindPressed = false;
                }
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

        HudRenderCallback.EVENT.register(new StandUserHud());

        LivingEntityFeatureRendererRegistrationCallback.EVENT.register((entityType, entityRenderer, registrationHelper) -> {
            if (entityType == EntityType.PLAYER) {
                //noinspection unchecked
                registrationHelper.register(new TheWorldFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new TheWorldAttackingModel(), new TheWorldIdleModel()));
                registrationHelper.register(new KillerQueenFeatureRenderer<>((FeatureRendererContext<PlayerEntity, EntityModel<PlayerEntity>>) entityRenderer, new KillerQueenAttackingModel(), new KillerQueenIdleModel()));
            }
        });

        //GeoArmorRenderer.registerArmorRenderer(BloodStonemaskItem.class, new BloodStonemaskRenderer());
        GeoItemRenderer.registerItemRenderer(PBObjects.STONE_MASK_ITEM, new StonemaskItemRenderer());
        GeoItemRenderer.registerItemRenderer(PBObjects.BLOODY_STONE_MASK_ITEM, new BloodStonemaskItemRenderer());
        StonemaskRenderer.registerArmorRenderer(StonemaskItem.class, new StonemaskRenderer());
        BloodStonemaskRenderer.registerArmorRenderer(BloodStonemaskItem.class, new BloodStonemaskRenderer());
        GeoArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());
        VampireArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorFRenderer());
        VampireArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorFRenderer());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> tintIndex == 1 ? ((BedBlock) state.getBlock()).getColor().getFireworkColor() : 0xffffff,
                PBObjects.BLACK_COFFIN, PBObjects.RED_COFFIN, PBObjects.GREEN_COFFIN, PBObjects.BROWN_COFFIN, PBObjects.BLUE_COFFIN, PBObjects.PURPLE_COFFIN, PBObjects.CYAN_COFFIN, PBObjects.LIGHT_GRAY_COFFIN,
                PBObjects.GRAY_COFFIN, PBObjects.PINK_COFFIN, PBObjects.LIME_COFFIN, PBObjects.YELLOW_COFFIN, PBObjects.LIGHT_BLUE_COFFIN, PBObjects.MAGENTA_COFFIN, PBObjects.ORANGE_COFFIN, PBObjects.WHITE_COFFIN);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> tintIndex == 1 ? ((BedBlock) Block.getBlockFromItem(stack.getItem())).getColor().getFireworkColor() : 0xffffff,
                PBObjects.BLACK_COFFIN, PBObjects.RED_COFFIN, PBObjects.GREEN_COFFIN, PBObjects.BROWN_COFFIN, PBObjects.BLUE_COFFIN, PBObjects.PURPLE_COFFIN, PBObjects.CYAN_COFFIN, PBObjects.LIGHT_GRAY_COFFIN,
                PBObjects.GRAY_COFFIN, PBObjects.PINK_COFFIN, PBObjects.LIME_COFFIN, PBObjects.YELLOW_COFFIN, PBObjects.LIGHT_BLUE_COFFIN, PBObjects.MAGENTA_COFFIN, PBObjects.ORANGE_COFFIN, PBObjects.WHITE_COFFIN);


    }
}