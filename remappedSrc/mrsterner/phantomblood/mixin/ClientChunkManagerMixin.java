package mrsterner.phantomblood.mixin;


import mrsterner.phantomblood.common.timestop.TimeStopUtils;
import net.minecraft.client.world.ClientChunkManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientChunkManager.class)
public class ClientChunkManagerMixin {
    @Shadow @Final private ClientWorld world;

    @Inject(method = "shouldTickEntity", at = @At("HEAD"), cancellable = true)
    void doNotTickEntityWhenTimeIsStopped(Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (TimeStopUtils.getTimeStoppedTicks(world) > 0 && TimeStopUtils.isInRangeOfTimeStop(entity)) {
            entity.prevHorizontalSpeed = entity.horizontalSpeed;
            entity.prevPitch = entity.pitch;
            entity.prevYaw = entity.yaw;
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
            cir.setReturnValue(false);
        }
    }
    //Range of The World Time Stop squared
    @Inject(method = "shouldTickBlock", at = @At("HEAD"), cancellable = true)
    void doNotTickBlockWhenTimeIsStopped(BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (TimeStopUtils.getTimeStoppedTicks(world) > 0 && TimeStopUtils.getTimeStopper(world).squaredDistanceTo(Vec3d.ofCenter(pos)) < 8) {
            cir.setReturnValue(false);
        }
    }
}
