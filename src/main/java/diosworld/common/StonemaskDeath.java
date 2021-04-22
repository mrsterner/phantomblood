package diosworld.common;

import moriyashiine.bewitchment.common.registry.BWDamageSources;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class StonemaskDeath extends StatusEffect {
    public StonemaskDeath() {
        super(StatusEffectType.HARMFUL,0x98D982);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(BWDamageSources.DEATH, 40f);
    }
}
