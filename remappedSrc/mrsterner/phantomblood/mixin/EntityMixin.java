package mrsterner.phantomblood.mixin;

import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Entity.class)
public class EntityMixin {

    @Redirect(method = "move", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;setVelocity(Lnet/minecraft/util/math/Vec3d;)V"))
    private void stop20CBMove(Entity entity, Vec3d velocity){
        if(entity instanceof PlayerEntity) {
            PlayerEntity playerEntity = (PlayerEntity) entity;
            if (StandUtils.isStandActive(playerEntity) && StandUtils.getStand(playerEntity) == Stand.TWENTY_CENTURY_BOY) {
                Vec3d vec3d = playerEntity.getVelocity();
                playerEntity.setVelocity(0, vec3d.y, 0);
            }
        }
    }
}
