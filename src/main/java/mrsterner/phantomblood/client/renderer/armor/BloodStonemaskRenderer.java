package mrsterner.phantomblood.client.renderer.armor;

import mrsterner.phantomblood.client.model.armor.BloodStonemaskModel;
import mrsterner.phantomblood.common.item.BloodStonemaskItem;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import software.bernie.geckolib3.util.GeoArmorRendererFactory;

public class BloodStonemaskRenderer extends GeoArmorRenderer<BloodStonemaskItem> {
    public BloodStonemaskRenderer(AnimatedGeoModel<BloodStonemaskItem> modelProvider, GeoArmorRendererFactory.Context ctx, EntityModelLayer layer) {
        super(modelProvider, ctx, layer);
    }
    /*
    public BloodStonemaskRenderer() {
        super(new BloodStonemaskModel());

        this.headBone = "armorHead";
    }

     */
}