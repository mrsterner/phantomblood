package diosworld.client.model.item;

import diosworld.Dio;
import diosworld.common.item.StonemaskItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StonemaskItemModel extends AnimatedGeoModel<StonemaskItem> {
    @Override
    public Identifier getModelLocation(StonemaskItem object) {
        return new Identifier(Dio.MODID, "geo/stonemaskitem.geo.json");
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
