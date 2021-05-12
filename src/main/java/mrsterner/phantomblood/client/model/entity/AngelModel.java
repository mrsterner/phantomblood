package mrsterner.phantomblood.client.model.entity;

import net.minecraft.client.util.math.Vector3f;
import net.minecraft.util.Identifier;
import mrsterner.phantomblood.PhantomBlood;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class AngelModel extends AnimatedGeoModel {
    @Override
    public Identifier getAnimationFileLocation(Object entity) {
        return new Identifier(PhantomBlood.MODID, "animations/angel.animation.json");
    }

    @Override
    public Identifier getModelLocation(Object entity) {
        return new Identifier(PhantomBlood.MODID, "geo/angel.geo.json");
    }

    @Override
    public Identifier getTextureLocation(Object entity) {
        return new Identifier(PhantomBlood.MODID, "textures/models/entity/male_0.png");
    }

    @Override
    public void setLivingAnimations(IAnimatable entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(
                    Vector3f.POSITIVE_X.getRadialQuaternion(extraData.headPitch * ((float) Math.PI / 180F)).getX());
            head.setRotationY(
                    Vector3f.POSITIVE_Y.getRadialQuaternion(extraData.netHeadYaw * ((float) Math.PI / 180F)).getY());
        }
    }
}