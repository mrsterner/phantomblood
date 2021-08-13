package mrsterner.phantomblood.common.statuseffect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class PurpleHazeEffect extends StatusEffect {
    public PurpleHazeEffect() {
        super(StatusEffectType.HARMFUL, 0x7500f2);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(DamageSource.STARVE,2);
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        entity.damage(DamageSource.STARVE,Integer.MAX_VALUE);
    }
}