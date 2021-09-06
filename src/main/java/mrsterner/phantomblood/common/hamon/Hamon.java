package mrsterner.phantomblood.common.hamon;


import mrsterner.phantomblood.common.registry.PBSoundEvents;
import mrsterner.phantomblood.common.registry.PBStatusEffects;
import mrsterner.phantomblood.common.stand.StandUtils;
import mrsterner.phantomblood.common.timestop.TimeStopUtils;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Identifier;

import java.util.Locale;

public enum Hamon {
    NONE(0, (server, player, handler1, buf, responseSender) -> {}),
    HAMON(60000, (server, player, handler1, buf, responseSender) -> {
        server.execute(() -> {
            int energy = HamonUtils.getHamonEnergy(player);
            int energyForAbility = HamonUtils.getHamon(player).energyForAbility;
            long ticks = HamonUtils.getHamonLevel(player) == 0 ? 120 : 200;
            if (energy >= energyForAbility) {
                HamonUtils.setHamonEnergy(player, energy - energyForAbility);
                System.out.println("Hamon");
             }
        });
    });

    public int energyForAbility;
    public ServerPlayNetworking.PlayChannelHandler handler;
    Hamon(int i, ServerPlayNetworking.PlayChannelHandler handlerIn) {
        energyForAbility = i;
        handler = handlerIn;
    }

    @Override
    public String toString() {
        return "hamon.phantomblood."+name().toLowerCase(Locale.ROOT);
    }
}