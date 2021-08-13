package mrsterner.phantomblood.mixin;


import mrsterner.phantomblood.common.timestop.TimeStopUtils;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerChunkManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerChunkManager.class)
public class ServerChunkManagerMixin {
/*
    @Shadow @Final private ServerWorld world;

    @Inject(method = "shouldTickEntity", at = @At("HEAD"), cancellable = true)
    void doNotTickEntityWhenTimeIsStopped(Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (TimeStopUtils.getTimeStoppedTicks(world) > 0 && TimeStopUtils.isInRangeOfTimeStop(entity)) {
            cir.setReturnValue(false);
        }
    }

    @Inject(method = "shouldTickBlock", at = @At("HEAD"), cancellable = true)
    void doNotTickBlockWhenTimeIsStopped(BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (TimeStopUtils.getTimeStoppedTicks(world) > 0 && TimeStopUtils.isInRangeOfTimeStop(pos, world)) {
            cir.setReturnValue(false);
        }
    }

 */
}
