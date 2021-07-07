package mrsterner.phantomblood.common.statuseffects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class DarkBlueMoonEffect extends StatusEffect {
    public DarkBlueMoonEffect() {
        super(StatusEffectType.BENEFICIAL, 0x98D982);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}