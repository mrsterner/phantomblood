package mrsterner.phantomblood.mixin;

import com.mojang.authlib.GameProfile;
import mrsterner.phantomblood.stand.Stand;
import mrsterner.phantomblood.stand.StandUtils;
import mrsterner.phantomblood.timestop.TimeStopUtils;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin extends AbstractClientPlayerEntity {
    public ClientPlayerEntityMixin(ClientWorld world, GameProfile profile) {
        super(world, profile);
    }

    @Inject(method = "tickMovement", at = @At("HEAD"), cancellable = true)
    protected void doNotLetPlayersMoveWhenTimeIsStopped(CallbackInfo ci) {
        if (TimeStopUtils.getTimeStoppedTicks(world) > 0 && StandUtils.getStand(this) != Stand.THE_WORLD && TimeStopUtils.isInRangeOfTimeStop(this)) {
            ci.cancel();
        }
    }
}