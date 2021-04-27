package phantomblood.client.model.item;

import phantomblood.PhantomBlood;
import phantomblood.common.item.BloodStonemaskItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BloodStonemaskItemModel extends AnimatedGeoModel<BloodStonemaskItem> {
    @Override
    public Identifier getModelLocation(BloodStonemaskItem object) {
        return new Identifier(PhantomBlood.MODID, "geo/stonemaskitem.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BloodStonemaskItem object) {
        return new Identifier(PhantomBlood.MODID, "textures/item/bloodstonemask_backup.png");
    }

    @Override
    public Identifier getAnimationFileLocation(BloodStonemaskItem animatable) {
        return new Identifier(PhantomBlood.MODID, "animations/stonemask.animation.json");
    }

}
