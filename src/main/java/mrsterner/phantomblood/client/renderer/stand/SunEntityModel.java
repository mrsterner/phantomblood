package mrsterner.phantomblood.client.renderer.stand;

import mrsterner.phantomblood.PhantomBlood;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SunEntityModel extends AnimatedGeoModel<SunEntity> {
    @Override
    public Identifier getModelLocation(SunEntity object) {
        return new Identifier(PhantomBlood.MODID, "geo/entity/sun_model.geo.json");
    }

    @Override
    public Identifier getTextureLocation(SunEntity object) {
        return new Identifier(PhantomBlood.MODID, "textures/entity/stand/the_sun.png");
    }

    @Override
    public Identifier getAnimationFileLocation(SunEntity animatable) {
        return new Identifier(PhantomBlood.MODID, "animations/the_sun.animation.json");
    }
}
