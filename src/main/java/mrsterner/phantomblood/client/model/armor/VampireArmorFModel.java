package mrsterner.phantomblood.client.model.armor;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.item.VampireArmorFItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VampireArmorFModel extends AnimatedGeoModel<VampireArmorFItem> {
    @Override
    public Identifier getModelLocation(VampireArmorFItem object) {
        return new Identifier(PhantomBlood.MODID, "geo/vampire_armor_female.geo.json");
    }

    @Override
    public Identifier getTextureLocation(VampireArmorFItem object) {
        return new Identifier(PhantomBlood.MODID, "textures/entity/armor/vampire_armor.png");
    }

    @Override
    public Identifier getAnimationFileLocation(VampireArmorFItem animatable) {
        return new Identifier(PhantomBlood.MODID, "animations/vampire_armor.animation.json");
    }
}