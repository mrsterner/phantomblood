package diosworld.client.model.armor;

import diosworld.Dio;
import diosworld.common.item.StonemaskArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StonemaskArmorModel extends AnimatedGeoModel<StonemaskArmorItem> {
    @Override
    public Identifier getModelLocation(StonemaskArmorItem object) {
        return new Identifier(Dio.MODID, "geo/stonemaskb.geo.json");
    }

    @Override
    public Identifier getTextureLocation(StonemaskArmorItem object) {
        return new Identifier(Dio.MODID, "textures/item/stonemask.png");
    }

    @Override
    public Identifier getAnimationFileLocation(StonemaskArmorItem animatable) {
        return new Identifier(Dio.MODID, "animations/stonemask.animation.json");
    }
}