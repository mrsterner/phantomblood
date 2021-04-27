package phantomblood.common;

import moriyashiine.bewitchment.api.BewitchmentAPI;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;

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
        if (entity instanceof PlayerEntity && !BewitchmentAPI.isVampire(entity, true)) {
            //entity.damage(BWDamageSources.DEATH, 40f);
        }
    }
}
