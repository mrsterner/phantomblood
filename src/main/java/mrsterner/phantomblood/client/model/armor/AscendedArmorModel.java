package mrsterner.phantomblood.client.model.armor;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.item.AscendedArmorItem;
import mrsterner.phantomblood.common.item.WingsArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AscendedArmorModel extends AnimatedGeoModel<AscendedArmorItem> {
    @Override
    public Identifier getModelLocation(AscendedArmorItem object) {
        return new Identifier(PhantomBlood.MODID, "geo/ascended.geo.json");
    }

    @Override
    public Identifier getTextureLocation(AscendedArmorItem object) {
        return new Identifier(PhantomBlood.MODID, "textures/entity/living/angel/male_1.png");
    }

    @Override
    public Identifier getAnimationFileLocation(AscendedArmorItem animatable) {
        return new Identifier(PhantomBlood.MODID, "animations/ascended.animation.json");
    }
}