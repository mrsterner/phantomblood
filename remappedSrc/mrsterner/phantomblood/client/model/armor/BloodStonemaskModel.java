package mrsterner.phantomblood.client.model.armor;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.item.BloodStonemaskItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BloodStonemaskModel extends AnimatedGeoModel<BloodStonemaskItem> {
    @Override
    public Identifier getModelLocation(BloodStonemaskItem object) {
        return new Identifier(PhantomBlood.MODID, "geo/stonemask.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BloodStonemaskItem object) {
        return new Identifier(PhantomBlood.MODID, "textures/item/bloodstonemask.png");
    }

    @Override
    public Identifier getAnimationFileLocation(BloodStonemaskItem animatable) {
        return new Identifier(PhantomBlood.MODID, "animations/stonemask.animation.json");
    }
}