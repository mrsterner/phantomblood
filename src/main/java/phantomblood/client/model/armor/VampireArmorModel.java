package phantomblood.client.model.armor;

import net.minecraft.util.Identifier;
import phantomblood.PhantomBlood;
import phantomblood.common.item.VampireArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VampireArmorModel extends AnimatedGeoModel<VampireArmorItem> {
    @Override
    public Identifier getModelLocation(VampireArmorItem object) {
        return new Identifier(PhantomBlood.MODID, "geo/vampire_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(VampireArmorItem object) {
        return new Identifier(PhantomBlood.MODID, "textures/models/armor/vampire_armor.png");
    }

    @Override
    public Identifier getAnimationFileLocation(VampireArmorItem animatable) {
        return new Identifier(PhantomBlood.MODID, "animations/vampire_armor.animation.json");
    }
}