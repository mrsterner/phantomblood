package mrsterner.phantomblood.client.model.armor;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.item.VampireArmorItem;
import mrsterner.phantomblood.common.item.WingsArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WingsArmorModel extends AnimatedGeoModel<WingsArmorItem> {
    @Override
    public Identifier getModelLocation(WingsArmorItem object) {
        return new Identifier(PhantomBlood.MODID, "geo/wings.geo.json");
    }

    @Override
    public Identifier getTextureLocation(WingsArmorItem object) {
        return new Identifier(PhantomBlood.MODID, "textures/entity/living/angel/male_1.png");
    }

    @Override
    public Identifier getAnimationFileLocation(WingsArmorItem animatable) {
        return new Identifier(PhantomBlood.MODID, "animations/angel.animation.json");
    }
}