package mrsterner.phantomblood.common.statuseffect;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.registry.PhantomBloodDeals;
import mrsterner.phantomblood.common.registry.PhantomBloodObjects;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class UrielEffect extends StatusEffect {
    public UrielEffect() {
        super(StatusEffectType.NEUTRAL, 0x98D982);
    }

    boolean enable;


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {

        return false;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {


    }

    @Override
    public void onApplied(LivingEntity livingEntity, AttributeContainer abstractEntityAttributeContainer, int i) {


    }

    @Override
    public void onRemoved(LivingEntity livingEntity, AttributeContainer abstractEntityAttributeContainer, int i) {

    }
}