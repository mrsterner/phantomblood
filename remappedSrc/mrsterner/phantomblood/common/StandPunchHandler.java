package mrsterner.phantomblood.common;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.registry.PBSoundEvents;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandMode;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.MathHelper;

public class StandPunchHandler implements ServerTickEvents.StartWorldTick {
    double ticksSinceSound;
    double boxX = 0;
    double boxY = 0;
    double boxZ = 0;


    @Override
    public void onStartTick(ServerWorld world) {

        ticksSinceSound++;
        world.getPlayers().stream()
                .filter(it -> StandUtils.getStand(it) != Stand.NONE && StandUtils.isStandActive(it) && StandUtils.getStandMode(it) == StandMode.ATTACKING)
                .forEach(player -> {
                    String stand = StandUtils.getStand(player).toString();
                    int level = StandUtils.getStandLevel(player);
                    switch (stand) {
                        case "stand.phantomblood.the_world":
                        case "stand.phantomblood.crazy_diamond":
                        case "stand.phantomblood.star_platinum":
                            boxX = 3.0;
                            boxY = 1.0;
                            boxZ = 2.0;
                            break;
                        case "stand.phantomblood.killer_queen":
                        case "stand.phantomblood.weather_report":
                            boxX = 10.0;
                            boxY = 10.0;
                            boxZ = 10.0;
                            break;
                    }
                    world.getOtherEntities(player, player.getBoundingBox()
                            .expand(boxX * MathHelper.sin(player.yaw), boxY, boxZ * MathHelper.cos(player.yaw))).stream()
                            .filter(it -> it instanceof LivingEntity)
                            .forEach(it -> {
                                if (ticksSinceSound > 8) {
                                    ticksSinceSound = 0;
                                    world.playSound(null, player.getBlockPos(), PBSoundEvents.PUNCH, SoundCategory.PLAYERS, 0.15F, 1);
                                }
                                switch (stand) {
                                    case "stand.phantomblood.the_world":
                                    case "stand.phantomblood.crazy_diamond":
                                    case "stand.phantomblood.star_platinum":
                                        it.damage(DamageSource.player(player), level == 0 ? 3.0f : 6.0f);
                                        break;
                                    case "stand.phantomblood.killer_queen":
                                    case "stand.phantomblood.weather_report":
                                        it.damage(DamageSource.player(player), level == 0 ? 1.0f : 2.0f);
                                        break;
                                }
                            });
                });
        world.getPlayers().stream()
                .filter(it -> StandUtils.getStand(it) == Stand.WEATHER_REPORT && StandUtils.isStandActive(it) && StandUtils.getStandMode(it) == StandMode.ATTACKING)
                .forEach(player -> {
                    int level = StandUtils.getStandLevel(player);
                    world.getOtherEntities(player, player.getBoundingBox().expand(10.0 * MathHelper.sin(player.yaw), 10.0, (level == 0 ? 10.0f : 15.0f) * MathHelper.cos(player.yaw)))
                            .forEach(it -> {
                                double distanceX = player.getX() - it.getX();
                                double distanceZ = player.getZ() - it.getZ();
                                it.addVelocity(level == 0 ? -0.5f * distanceX : -1.0f * distanceX, 0, level == 0 ? -0.5f * distanceZ : -1.0f * distanceZ);
                            });
                });
        //Dark blue moons ability triggered by the scales status effect
        world.getPlayers().stream()
                .filter(it -> StandUtils.getStand(it) == Stand.DARK_BLUE_MOON && StandUtils.isStandActive(it) && it.hasStatusEffect(PhantomBlood.DEEP_BLUE_MOON_EFFECT)  && it.isTouchingWaterOrRain())
                .forEach(player -> {
                    int level = StandUtils.getStandLevel(player);
                    world.getOtherEntities(player, player.getBoundingBox().expand(10.0 * MathHelper.sin(player.yaw), 10.0, (level == 0 ? 10.0f : 15.0f) * MathHelper.cos(player.yaw))).stream()
                            .filter(Entity::isTouchingWaterOrRain)
                            .forEach(it -> {
                                it.damage(DamageSource.player(player), level == 0 ? 1.0f : 2.0f);
                            });
                });
        world.getPlayers().stream()
                .filter(it -> StandUtils.getStand(it) == Stand.CRAZY_DIAMOND && StandUtils.isStandActive(it) && StandUtils.getStandMode(it) == StandMode.HEALING)
                .forEach(player -> {
                    int level = StandUtils.getStandLevel(player);
                    world.getOtherEntities(player, player.getBoundingBox().expand(3.0 * MathHelper.sin(player.yaw), 1.0, 2.0 * MathHelper.cos(player.yaw))).stream()
                            .filter(it -> it instanceof LivingEntity)
                            .forEach(it -> {
                                if (ticksSinceSound > 8) {
                                    ticksSinceSound = 0;
                                    world.playSound(null, player.getBlockPos(), PBSoundEvents.PUNCH, SoundCategory.PLAYERS, 0.15F, 1);
                                }
                                int energy = StandUtils.getStandEnergy(player);
                                int energyForAbility = StandUtils.getStand(player).energyForAbility;
                                StandUtils.setStandEnergy(player, energy - energyForAbility);
                                ((LivingEntity) it).heal(1 + level);
                            });
                });
    }
}
