package mrsterner.phantomblood.common;

import mrsterner.phantomblood.common.registry.PBSoundEvents;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandMode;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.MathHelper;

public class StandPunchHandler implements ServerTickEvents.StartWorldTick{
    double ticksSinceSound;

    @Override
    public void onStartTick(ServerWorld world) {
        ticksSinceSound++;
        world.getPlayers().stream()
                .filter(it -> StandUtils.getStand(it) != Stand.NONE && StandUtils.isStandActive(it) && StandUtils.getStandMode(it) == StandMode.ATTACKING)
                .forEach(player -> {
                    int level = StandUtils.getStandLevel(player);
                    world.getOtherEntities(player, player.getBoundingBox().expand(2.0* MathHelper.sin(player.yaw), 0.0, 2.0*MathHelper.cos(player.yaw))).stream()
                            .filter(it -> it instanceof LivingEntity)
                            .forEach(it -> {
                                if (ticksSinceSound > 10) {
                                    ticksSinceSound = 0;
                                    //world.playSoundFromEntity(null,it,PBSoundEvents.PUNCH,SoundCategory.PLAYERS,0.0001F,1);
                                    world.playSound(null,player.getBlockPos(),PBSoundEvents.PUNCH,SoundCategory.PLAYERS,0.15F,1);
                                }
                                it.damage(DamageSource.player(player), level == 0 ? 3.0f : 6.0f);
                            });
                });
        world.getPlayers().stream()
                .filter(it -> StandUtils.getStand(it) == Stand.CRAZY_DIAMOND && StandUtils.isStandActive(it) && StandUtils.getStandMode(it) == StandMode.HEALING)
                .forEach(player -> {
                    int level = StandUtils.getStandLevel(player);
                    world.getOtherEntities(player, player.getBoundingBox().expand(2.0* MathHelper.sin(player.yaw), 0.0, 2.0*MathHelper.cos(player.yaw))).stream()
                            .filter(it -> it instanceof LivingEntity)
                            .forEach(it -> {
                                if (ticksSinceSound > 10) {
                                    ticksSinceSound = 0;
                                    world.playSound(null,player.getBlockPos(),PBSoundEvents.PUNCH,SoundCategory.PLAYERS,0.15F,1);
                                }

                                int energy = StandUtils.getStandEnergy(player);
                                int energyForAbility = StandUtils.getStand(player).energyForAbility;
                                StandUtils.setStandEnergy(player, energy - energyForAbility);
                                //((LivingEntity) it).applyStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40,2));
                                ((LivingEntity) it).heal(1);

                            });
                });
    }
}
