package mrsterner.phantomblood.mixin;

import mrsterner.phantomblood.common.timestop.TimeStopUtils;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(HorseEntity.class)
public abstract class HorseEntityMixin {
    
    @Inject(method = "interactMob", at = @At("HEAD"), cancellable = true)
    private void NoHorseForYou(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        if(TimeStopUtils.getTimeStoppedTicks(player.world) > 0){
            cir.setReturnValue(ActionResult.PASS);
        }
    }
}