package mrsterner.phantomblood.mixin;


import mrsterner.phantomblood.common.timestop.TimeStopUtils;
import net.minecraft.block.Block;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ScheduledTick;
import net.minecraft.world.World;
import net.minecraft.world.chunk.WorldChunk;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WorldChunk.class)
public class WorldChunkMixin {

    @Final private World world;

    @Inject(method = "canTickBlockEntity", at = @At("HEAD"), cancellable = true)
    void doNotTickBlockWhenTimeIsStopped(BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (TimeStopUtils.getTimeStoppedTicks(world) > 0 && TimeStopUtils.isInRangeOfTimeStop(pos, world)) {
            cir.cancel();
        }
    }
}
