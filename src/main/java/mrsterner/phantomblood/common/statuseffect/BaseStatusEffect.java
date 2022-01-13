package mrsterner.phantomblood.common.statuseffect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BaseStatusEffect extends StatusEffect {

    public BaseStatusEffect(StatusEffectCategory type, int color) {
        super(type, color);
    }
}