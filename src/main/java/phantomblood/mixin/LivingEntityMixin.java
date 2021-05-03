package phantomblood.mixin;

import moriyashiine.bewitchment.common.Bewitchment;
import phantomblood.common.registry.PhantomBloodObjects;
import moriyashiine.bewitchment.api.BewitchmentAPI;
import moriyashiine.bewitchment.api.interfaces.entity.CurseAccessor;
import moriyashiine.bewitchment.api.interfaces.entity.TransformationAccessor;
import moriyashiine.bewitchment.client.network.packet.SpawnSmokeParticlesPacket;
import moriyashiine.bewitchment.common.entity.living.VampireEntity;
import moriyashiine.bewitchment.common.registry.*;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@SuppressWarnings("ConstantConditions")
@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {

    @Shadow
    public abstract boolean addStatusEffect(StatusEffectInstance effect);

    @Shadow
    public abstract boolean clearStatusEffects();

    @Shadow
    public abstract void setHealth(float health);

    @Shadow
    protected abstract float getSoundVolume();

    @Shadow
    protected abstract float getSoundPitch();

    @Shadow public abstract boolean damage(DamageSource source, float amount);

    @Shadow public abstract Map<StatusEffect, StatusEffectInstance> getActiveStatusEffects();

    @Shadow public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "tryUseTotem", at = @At("TAIL"), cancellable = true)
    private void tryUseTotem(DamageSource source, CallbackInfoReturnable<Boolean> callbackInfo) {
        if (!callbackInfo.getReturnValue() && !world.isClient) {
            ItemStack poppet = BewitchmentAPI.getPoppet(world, BWObjects.DEATH_PROTECTION_POPPET, this, null);


            if (callbackInfo.getReturnValue() && (Object) this instanceof PlayerEntity && ((CurseAccessor) this).hasCurse(BWCurses.SUSCEPTIBILITY) && ((TransformationAccessor) this).getTransformation() == BWTransformations.HUMAN) {
                LivingEntity entity = (LivingEntity) (Object) this;
                ItemStack stonemask = entity.getEquippedStack(EquipmentSlot.HEAD);
                if (stonemask.getItem() == PhantomBloodObjects.STONE_MASK_ITEM || source.getSource() instanceof VampireEntity || (BewitchmentAPI.isVampire(source.getSource(), true))) {
                    ((TransformationAccessor) this).getTransformation().onRemoved((PlayerEntity) (Object) this);
                    ((TransformationAccessor) this).setTransformation(BWTransformations.VAMPIRE);
                    ((TransformationAccessor) this).getTransformation().onAdded((PlayerEntity) (Object) this);
                    PlayerLookup.tracking(this).forEach(foundPlayer -> SpawnSmokeParticlesPacket.send(foundPlayer, this));
                    SpawnSmokeParticlesPacket.send((PlayerEntity) (Object) this, this);
                    world.playSound(null, getBlockPos(), BWSoundEvents.ENTITY_GENERIC_CURSE, getSoundCategory(), getSoundVolume(), getSoundPitch());
                }
            }
        }
    }
    @Inject(method = "tick", at = @At("TAIL"))
    private void tick(CallbackInfo callbackInfo) {
        if (!world.isClient) {
            LivingEntity livingEntity = (LivingEntity) (Object) this;
            ItemStack stonemask = livingEntity.getEquippedStack(EquipmentSlot.HEAD);
            int damage = 0;
            if (stonemask.getItem() == PhantomBloodObjects.STONE_MASK_ITEM && !BewitchmentAPI.isVampire(this, true)) {
                damage++;
            }

            if (damage > 0) {
                // damage(BWDamageSources.VAMPIRE, damage);
            }
            if (stonemask.getItem() == PhantomBloodObjects.BLOODY_STONE_MASK_ITEM && ((CurseAccessor) this).hasCurse(BWCurses.SUSCEPTIBILITY) && ((TransformationAccessor) this).getTransformation() == BWTransformations.HUMAN) {
                ((TransformationAccessor) this).getTransformation().onRemoved((PlayerEntity) (Object) this);
                ((TransformationAccessor) this).setTransformation(BWTransformations.VAMPIRE);
                ((TransformationAccessor) this).getTransformation().onAdded((PlayerEntity) (Object) this);
                PlayerLookup.tracking(this).forEach(foundPlayer -> SpawnSmokeParticlesPacket.send(foundPlayer, this));
                SpawnSmokeParticlesPacket.send((PlayerEntity) (Object) this, this);
                world.playSound(null, getBlockPos(), BWSoundEvents.ENTITY_GENERIC_CURSE, getSoundCategory(), getSoundVolume(), getSoundPitch());
            }


        }
    }

}