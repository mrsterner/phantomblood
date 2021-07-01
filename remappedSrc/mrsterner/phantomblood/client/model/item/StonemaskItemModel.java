package mrsterner.phantomblood.client.model.item;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.item.StonemaskItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StonemaskItemModel extends AnimatedGeoModel<StonemaskItem> {
    @Override
    public Identifier getModelLocation(StonemaskItem object) {
        return new Identifier(PhantomBlood.MODID, "geo/stonemaskitem.geo.json");
    }

    @Override
    public Identifier getTextureLocation(StonemaskItem object) {
        return new Identifier(PhantomBlood.MODID, "textures/item/stonemask.png");
    }

    @Override
    public Identifier getAnimationFileLocation(StonemaskItem animatable) {
        return new Identifier(PhantomBlood.MODID, "animations/stonemask.animation.json");
    }

}
