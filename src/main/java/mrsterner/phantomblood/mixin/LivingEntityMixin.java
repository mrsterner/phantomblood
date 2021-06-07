package mrsterner.phantomblood.mixin;

import com.williambl.haema.Vampirable;
import mrsterner.phantomblood.common.registry.PBObjects;
import mrsterner.phantomblood.common.registry.PBSoundEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;



@SuppressWarnings("ConstantConditions")
@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {

    @Shadow
    protected abstract float getSoundVolume();

    @Shadow
    protected abstract float getSoundPitch();

    @Shadow public abstract boolean damage(DamageSource source, float amount);


    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "tick", at = @At("TAIL"))
    private void tick(CallbackInfo callbackInfo) {
        if (!world.isClient) {
            LivingEntity livingEntity = (LivingEntity) (Object) this;
            ItemStack head = livingEntity.getEquippedStack(EquipmentSlot.HEAD);
                if (head.getItem() == PBObjects.BLOODY_STONE_MASK_ITEM && !((Vampirable) this).isVampire()) {

                    Vampirable.Companion.convert(((PlayerEntity) (Object) this));
                    world.playSound(null, getBlockPos(), PBSoundEvents.VAMPIRE, getSoundCategory(), getSoundVolume(), getSoundPitch());
                }
                if(head.getItem() == PBObjects.STONE_MASK_ITEM){
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3,1));
                }

        }
    }



}