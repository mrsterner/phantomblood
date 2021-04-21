package diosworld.client.model.armor;

import diosworld.Dio;
import diosworld.common.item.StonemaskItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StonemaskModel extends AnimatedGeoModel<StonemaskItem> {
    @Override
    public Identifier getModelLocation(StonemaskItem object) {
        return new Identifier(Dio.MODID, "geo/stonemaskb.geo.json");
    }

    @Override
    public Identifier getTextureLocation(StonemaskItem object) {
        return new Identifier(Dio.MODID, "textures/item/stonemask.png");
    }

    @Override
    public Identifier getAnimationFileLocation(StonemaskItem animatable) {
        return new Identifier(Dio.MODID, "animations/stonemask.animation.json");
    }
}