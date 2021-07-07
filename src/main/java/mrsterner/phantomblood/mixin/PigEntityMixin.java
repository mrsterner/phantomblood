package mrsterner.phantomblood.mixin;

import mrsterner.phantomblood.common.timestop.TimeStopUtils;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(PigEntity.class)
public abstract class PigEntityMixin {
    
    @Inject(method = "interactMob", at = @At("HEAD"), cancellable = true)
    private void NoStriderForYou(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        if(TimeStopUtils.getTimeStoppedTicks(player.world) > 0){
            cir.setReturnValue(ActionResult.PASS);
        }
    }
}