package mrsterner.phantomblood.mixin;


import mrsterner.phantomblood.common.timestop.TimeStopUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.map.MapState;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.tag.TagManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.world.ScheduledTick;
import net.minecraft.world.TickScheduler;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkManager;
import net.minecraft.world.entity.EntityLookup;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(ServerWorld.class)
public class ServerWorldMixin {

    @Inject(method = "tickEntity", at = @At("HEAD"), cancellable = true)
    void doNotTickEntityWhenTimeIsStopped(Entity entity, CallbackInfo ci) {
        if (TimeStopUtils.getTimeStoppedTicks(entity.world) > 0 && TimeStopUtils.isInRangeOfTimeStop(entity)) {
            entity.prevHorizontalSpeed = entity.horizontalSpeed;
            entity.prevPitch = entity.getPitch();
            entity.prevYaw = entity.getYaw();
            entity.prevX = entity.getX();
            entity.prevY = entity.getY();
            entity.prevZ = entity.getZ();
            entity.lastRenderX = entity.getX();
            entity.lastRenderY = entity.getY();
            entity.lastRenderZ = entity.getZ();
            if (entity instanceof LivingEntity) {
                LivingEntity lEntity = (LivingEntity) entity;
                lEntity.prevBodyYaw = lEntity.bodyYaw;
                lEntity.prevHeadYaw = lEntity.headYaw;
                lEntity.lastHandSwingProgress = lEntity.handSwingProgress;
                lEntity.lastLimbDistance = lEntity.limbDistance;
            }
            ci.cancel();
        }
    }
}
