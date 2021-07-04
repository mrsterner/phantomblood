package mrsterner.phantomblood.common.statuseffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;

public class DarkBlueMoonEffect extends StatusEffect {
    public DarkBlueMoonEffect() {
        super(
                StatusEffectType.BENEFICIAL, // whether beneficial or harmful for entities
                0x98D982); // color in RGB
    }

    // This method is called every tick to check weather it should apply the status effect or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
}