package mrsterner.phantomblood.client.model.item;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.item.AnubisSwordItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AnubisSwordModel extends AnimatedGeoModel<AnubisSwordItem> {
    @Override
    public Identifier getModelLocation(AnubisSwordItem object) {
        return new Identifier(PhantomBlood.MODID, "geo/anubis_sword.geo.json");
    }

    @Override
    public Identifier getTextureLocation(AnubisSwordItem object) {
        return new Identifier(PhantomBlood.MODID, "textures/item/anubis_sword.png");
    }

    @Override
    public Identifier getAnimationFileLocation(AnubisSwordItem animatable) {
        return new Identifier(PhantomBlood.MODID, "animations/anubis_sword.animation.json");
    }
}