package mrsterner.phantomblood.mixin;


import mrsterner.phantomblood.common.timestop.TimeStopUtils;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ScheduledTick;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerWorld.class)
public class ServerWorldMixin {


    @Final
    private ServerWorld world;

    @Inject(method = "tickEntity", at = @At("HEAD"), cancellable = true)
    void doNotTickEntityWhenTimeIsStopped(Entity entity, CallbackInfo ci) {
        if (TimeStopUtils.getTimeStoppedTicks(world) > 0 && TimeStopUtils.isInRangeOfTimeStop(entity)) {
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
    @Inject(method = "tickBlock", at = @At("HEAD"), cancellable = true)
    void doNotTickBlockWhenTimeIsStopped(ScheduledTick<Block> tick, CallbackInfo ci) {
        if (TimeStopUtils.getTimeStoppedTicks(world) > 0 && TimeStopUtils.isInRangeOfTimeStop(tick.pos, world)) {
            ci.cancel();
        }
    }
}
