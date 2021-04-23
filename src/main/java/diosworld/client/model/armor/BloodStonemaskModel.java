package diosworld.client.model.armor;

import diosworld.Dio;
import diosworld.common.item.BloodStonemaskItem;
import diosworld.common.item.StonemaskItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BloodStonemaskModel extends AnimatedGeoModel<BloodStonemaskItem> {
    @Override
    public Identifier getModelLocation(BloodStonemaskItem object) {
        return new Identifier(Dio.MODID, "geo/stonemaskb.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BloodStonemaskItem object) {
        return new Identifier(Dio.MODID, "textures/item/bloodstonemask.png");
    }

    @Override
    public Identifier getAnimationFileLocation(BloodStonemaskItem animatable) {
        return new Identifier(Dio.MODID, "animations/stonemask.animation.json");
    }
}