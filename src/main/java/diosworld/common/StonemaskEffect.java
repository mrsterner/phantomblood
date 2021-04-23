package diosworld.common;

import moriyashiine.bewitchment.api.interfaces.entity.TransformationAccessor;
import moriyashiine.bewitchment.common.registry.BWDamageSources;
import moriyashiine.bewitchment.common.registry.BWTransformations;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;

public class StonemaskEffect extends StatusEffect {
    public StonemaskEffect(){
        super(StatusEffectType.HARMFUL,0x98D982);
    }
    boolean enable;

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {

        return true;
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
/*
            ((TransformationAccessor) entity).getTransformation().onRemoved((PlayerEntity) (Object) entity);
            ((TransformationAccessor) entity).setTransformation(BWTransformations.VAMPIRE);
            ((TransformationAccessor) entity).getTransformation().onAdded((PlayerEntity) (Object) entity);*/
        }

    }
    @Override
    public void onApplied(LivingEntity livingEntity, AttributeContainer abstractEntityAttributeContainer, int i) {


    }
    @Override
    public void onRemoved(LivingEntity livingEntity, AttributeContainer abstractEntityAttributeContainer, int i) {

    }
}
