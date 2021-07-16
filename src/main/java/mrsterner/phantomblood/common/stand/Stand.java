package mrsterner.phantomblood.common.stand;


import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.registry.PBSoundEvents;
import mrsterner.phantomblood.common.timestop.TimeStopUtils;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.Locale;

public enum Stand {
    NONE(0, (server, player, handler1, buf, responseSender) -> {}),
    THE_WORLD(60000, (server, player, handler1, buf, responseSender) -> {
        server.execute(() -> {
            int energy = StandUtils.getStandEnergy(player);
            int energyForAbility = StandUtils.getStand(player).energyForAbility;
            long ticks = StandUtils.getStandLevel(player) == 0 ? 120 : 200;
            if (energy >= energyForAbility) {
                StandUtils.setStandEnergy(player, energy - energyForAbility);
                TimeStopUtils.setTimeStoppedTicks(player.world, ticks);
                TimeStopUtils.setTimeStopper(player.world, player);
                player.world.playSound(null, player.getBlockPos(), PBSoundEvents.THE_WORLD, SoundCategory.PLAYERS, 1, 1f);
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, (int) ticks));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, (int) ticks));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, (int) ticks));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, (int) ticks));
                server.getPlayerManager().sendToAll(ServerPlayNetworking.createS2CPacket(new Identifier("phantomblood:stop_time"), PacketByteBufs.create().writeUuid(player.getUuid()).writeVarLong(ticks)));
            }
        });
    }),
    STAR_PLATINUM(40000, (server, player, handler1, buf, responseSender) -> {
        server.execute(() -> {
            long ticks = StandUtils.getStandLevel(player) == 0 ? 90 : 180;
            int energy = StandUtils.getStandEnergy(player);
            int energyForAbility = StandUtils.getStand(player).energyForAbility;
             if (energy >= energyForAbility) {
                StandUtils.setStandEnergy(player, energy - energyForAbility);
                TimeStopUtils.setTimeStoppedTicks(player.world, ticks);
                TimeStopUtils.setTimeStopper(player.world, player);
                player.world.playSound(null, player.getBlockPos(), PBSoundEvents.THE_WORLD, SoundCategory.PLAYERS, 1, 1f);
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, (int) ticks, 1));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, (int) ticks, 2));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, (int) ticks));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, (int) ticks));
                server.getPlayerManager().sendToAll(ServerPlayNetworking.createS2CPacket(new Identifier("phantomblood:stop_time"), PacketByteBufs.create().writeUuid(player.getUuid()).writeVarLong(ticks)));
            }
        });
    }),
    KILLER_QUEEN(8000, (server, player, handler1, buf, responseSender) -> {}),
    CRAZY_DIAMOND(3000, (server, player, handler1, buf, responseSender) -> {
        if(StandUtils.isStandActive(player) && StandUtils.getStandMode(player) == StandMode.HEALING){
            StandUtils.setStandMode(player, StandMode.ATTACKING);
        }
        else if(StandUtils.isStandActive(player) && StandUtils.getStandMode(player) == StandMode.ATTACKING){
            StandUtils.setStandMode(player, StandMode.HEALING);
        }
    }),
    WEATHER_REPORT(8000, (server, player, handler1, buf, responseSender) -> {}),
    DARK_BLUE_MOON(8000, (server, player, handler1, buf, responseSender) -> {
        server.execute(() -> {
            long ticks = StandUtils.getStandLevel(player) == 0 ? 200 : 300;
            player.addStatusEffect(new StatusEffectInstance(PhantomBlood.DEEP_BLUE_MOON_EFFECT, (int) ticks));
        });

    }),
    THE_SUN(3000, (server, player, handler1, buf, responseSender) -> {}),
    KING_CRIMSON(3000, (server, player, handler1, buf, responseSender) -> {}),
    PURPLE_HAZE(3000, (server, player, handler1, buf, responseSender) -> {}),
    HAMON(8000, (server, player, handler1, buf, responseSender) -> {});

    public int energyForAbility;
    public ServerPlayNetworking.PlayChannelHandler handler;
    Stand(int i, ServerPlayNetworking.PlayChannelHandler handlerIn) {
        energyForAbility = i;
        handler = handlerIn;
    }
    /*
    Vec3d start = something;
    Vec3d end = somethingElse;
    double dist = end.distanceTo(start);
for(int i = 0;i<dist;i++) {
        double progress = i/dist;
        double currentX = lerp(start.x,end.x,progress);
        double currentY = lerp(start.y,end.y,progress);
        double currentZ = lerp(start.z,end.z,progress);
        Vec3d current = new Vec3d(currentX,currentY,currentZ);
        // do whatever with current
    }

     */

    @Override
    public String toString() {
        return "stand.phantomblood."+name().toLowerCase(Locale.ROOT);
    }
}