package mrsterner.phantomblood.client;

import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandMode;
import mrsterner.phantomblood.common.stand.StandUtils;
import mrsterner.phantomblood.common.timestop.TimeStopUtils;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

import javax.swing.*;

public class PBClientTickEvents implements ClientTickEvents.EndTick {


    public static void init(){
        KeyBinding useAbilityKeybind = KeyBindingHelper.registerKeyBinding(new KeyBinding("phantomblood.key.use_ability", GLFW.GLFW_KEY_O, "key.categories.phantomblood"));
        final boolean[] wasUseAbilityKeybindPressed = {false};
        KeyBinding toggleStandKeybind = KeyBindingHelper.registerKeyBinding(new KeyBinding("phantomblood.key.toggle_stand", GLFW.GLFW_KEY_P, "key.categories.phantomblood"));
        final boolean[] wasToggleStandKeybindPressed = {false};
        KeyBinding changeStandModeKeybind = KeyBindingHelper.registerKeyBinding(new KeyBinding("phantomblood.key.change_stand_mode", GLFW.GLFW_KEY_LEFT_ALT, "key.categories.phantomblood"));
        final boolean[] wasChangeStandKeybindPressed = {false};
        final boolean[] wasChangeStandKeybindReleased = {false};

        ClientTickEvents.START_WORLD_TICK.register(world -> {
            PlayerEntity player = MinecraftClient.getInstance().player;
            if (player != null && StandUtils.getStand(player) != Stand.NONE) {
                if (useAbilityKeybind.isPressed()) {
                    if (TimeStopUtils.getTimeStoppedTicks(world) < 0 && !wasUseAbilityKeybindPressed[0]) {
                        ClientPlayNetworking.send(new Identifier("phantomblood:use_ability"), PacketByteBufs.create());
                    }
                    wasUseAbilityKeybindPressed[0] = true;
                } else {
                    wasUseAbilityKeybindPressed[0] = false;
                }
                if (toggleStandKeybind.isPressed()) {
                    if (!wasToggleStandKeybindPressed[0]) {
                        ClientPlayNetworking.send(new Identifier("phantomblood:toggle_stand"), PacketByteBufs.create());
                    }
                    wasToggleStandKeybindPressed[0] = true;
                } else {
                    wasToggleStandKeybindPressed[0] = false;
                }

                //Push to Stand
                //Press
                if (changeStandModeKeybind.isPressed()) {
                    if (!wasChangeStandKeybindPressed[0]) {
                        ClientPlayNetworking.send(new Identifier("phantomblood:change_stand_mode"), PacketByteBufs.create());
                    }
                    wasChangeStandKeybindPressed[0] = true;
                }else {
                    wasChangeStandKeybindPressed[0] = false;
                }
                //Release
                if(!changeStandModeKeybind.isPressed() && changeStandModeKeybind.wasPressed()){
                    if(!wasChangeStandKeybindReleased[0]){
                        ClientPlayNetworking.send(new Identifier("phantomblood:change_stand_mode"), PacketByteBufs.create());
                        if(StandUtils.getStand(player) == Stand.CRAZY_DIAMOND && StandUtils.getStandMode(player) == StandMode.ATTACKING){
                            ClientPlayNetworking.send(new Identifier("phantomblood:change_stand_mode"), PacketByteBufs.create());
                        }
                    }
                    wasChangeStandKeybindReleased[0] = true;
                }else{
                    wasChangeStandKeybindReleased[0] = false;
                }
            }
        });
    }

    @Override
    public void onEndTick(MinecraftClient client) {

        }
}
