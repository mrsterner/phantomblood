package mrsterner.phantomblood.mixin;

import mrsterner.phantomblood.common.item.AnubisSwordItem;
import mrsterner.phantomblood.common.registry.PBObjects;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.UUID;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    private static final EntityAttributeModifier TWENTYCB_MOVEMENT_SPEED_MODIFIER = new EntityAttributeModifier(UUID.fromString("a782c03d-af7b-4eb7-b997-dd396bfdc7a0"), "20th Century Boy modifier", -1.0, EntityAttributeModifier.Operation.MULTIPLY_BASE);
    private static final EntityAttributeModifier ANUBIS_ARMOR_MODIFIER = new EntityAttributeModifier(UUID.fromString("f00b0b0f-8ad6-4a2f-bdf5-6c337ffee56c"), "Anubis modifier", 20.0, EntityAttributeModifier.Operation.ADDITION);


    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }


    @Inject(method = "tick", at = @At("TAIL"))
    private void stop20CB(CallbackInfo callbackInfo) {
        if (!world.isClient) {
            PlayerEntity player = (PlayerEntity) (Object) this;
            EntityAttributeInstance movementSpeedAttribute = getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED);
            if (!movementSpeedAttribute.hasModifier(TWENTYCB_MOVEMENT_SPEED_MODIFIER) && StandUtils.isStandActive(player) && StandUtils.getStand(player) == Stand.TWENTY_CENTURY_BOY) {
                movementSpeedAttribute.addPersistentModifier(TWENTYCB_MOVEMENT_SPEED_MODIFIER);
            }
            if (movementSpeedAttribute.hasModifier(TWENTYCB_MOVEMENT_SPEED_MODIFIER) && !(StandUtils.isStandActive(player) && StandUtils.getStand(player) == Stand.TWENTY_CENTURY_BOY)) {
                movementSpeedAttribute.removeModifier(TWENTYCB_MOVEMENT_SPEED_MODIFIER);
            }
            ItemStack itemStack = new ItemStack(PBObjects.ANUBIS_SWORD);
            if(player.getInventory().count(itemStack.getItem()) > 1){
                player.getInventory().remove(itemStack2 -> itemStack2.getItem() == PBObjects.ANUBIS_SWORD, 1, player.playerScreenHandler.getCraftingInput());
                player.dropItem(new ItemStack(PBObjects.ANUBIS_SWORD), false);
            }
            if (StandUtils.getStand(player) == Stand.ANUBIS && !player.getInventory().contains(itemStack)) {
                StandUtils.setStandActive(player, false);
                StandUtils.setStandLevel(player, 0);
                StandUtils.setStand(player, Stand.NONE);
            }
            if(StandUtils.getStand(player) != Stand.ANUBIS && StandUtils.getStand(player) != Stand.NONE && player.getInventory().contains(itemStack)){
                player.getInventory().remove(itemStack2 -> itemStack2.getItem() == PBObjects.ANUBIS_SWORD, 1, player.playerScreenHandler.getCraftingInput());
                player.dropItem(new ItemStack(PBObjects.ANUBIS_SWORD), false);
            }
            if (player.getInventory().contains(itemStack) && StandUtils.getStand(player) == Stand.NONE) {
                StandUtils.setStandActive(player, false);
                StandUtils.setStandLevel(player, 0);
                StandUtils.setStand(player, Stand.ANUBIS);
            }
            ItemStack itemStack3 = player.getStackInHand(Hand.MAIN_HAND);
            EntityAttributeInstance armorAttribute = getAttributeInstance(EntityAttributes.GENERIC_ARMOR);

            if (!armorAttribute.hasModifier(ANUBIS_ARMOR_MODIFIER) && itemStack3.getItem() instanceof AnubisSwordItem && player.isUsingItem()) {
                armorAttribute.addPersistentModifier(ANUBIS_ARMOR_MODIFIER);
            } else if(armorAttribute.hasModifier(ANUBIS_ARMOR_MODIFIER) && !player.isUsingItem()){
                armorAttribute.removeModifier(ANUBIS_ARMOR_MODIFIER);
            }
        }




    }

}
