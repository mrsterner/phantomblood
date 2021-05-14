package mrsterner.phantomblood.client.model.entity;

import mrsterner.phantomblood.PhantomBlood;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class WingsEntityModel extends AnimatedGeoModel {
    @Override
    public Identifier getAnimationFileLocation(Object entity) {
        return new Identifier(PhantomBlood.MODID, "animations/angel.animation.json");
    }

    @Override
    public Identifier getModelLocation(Object entity) {
        return new Identifier(PhantomBlood.MODID, "geo/wings.geo.json");
    }

    @Override
    public Identifier getTextureLocation(Object entity) {
        return new Identifier(PhantomBlood.MODID, "textures/models/entity/male_0.png");
    }
}