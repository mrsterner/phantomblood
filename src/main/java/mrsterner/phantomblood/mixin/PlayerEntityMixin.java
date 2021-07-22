package mrsterner.phantomblood.mixin;

import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.UUID;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity{

    @Shadow @Final public PlayerInventory inventory;
    private static final EntityAttributeModifier TWENTYCB_MOVEMENT_SPEED_MODIFIER = new EntityAttributeModifier(UUID.fromString("a782c03d-af7b-4eb7-b997-dd396bfdc7a0"), "20th Century Boy modifier", -1.0, EntityAttributeModifier.Operation.MULTIPLY_BASE);


    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "tick", at = @At("TAIL"))
    private void stop20CB(CallbackInfo callbackInfo) {
        if (!world.isClient) {
            PlayerEntity player = (PlayerEntity) (Object) this;
            EntityAttributeInstance movementSpeedAttribute = getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED);
            if(!movementSpeedAttribute.hasModifier(TWENTYCB_MOVEMENT_SPEED_MODIFIER) && StandUtils.isStandActive(player) && StandUtils.getStand(player) == Stand.TWENTY_CENTURY_BOY) {
                System.out.println("Apply");
                movementSpeedAttribute.addPersistentModifier(TWENTYCB_MOVEMENT_SPEED_MODIFIER);
            }
            if(movementSpeedAttribute.hasModifier(TWENTYCB_MOVEMENT_SPEED_MODIFIER) && !(StandUtils.isStandActive(player) && StandUtils.getStand(player) == Stand.TWENTY_CENTURY_BOY)){
                System.out.println("Remove");
                movementSpeedAttribute.removeModifier(TWENTYCB_MOVEMENT_SPEED_MODIFIER);
            }
         }
    }

}