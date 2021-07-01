package mrsterner.phantomblood.client.renderer.armor;

import mrsterner.phantomblood.client.model.armor.BloodStonemaskModel;
import mrsterner.phantomblood.common.item.BloodStonemaskItem;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class BloodStonemaskRenderer extends GeoArmorRenderer<BloodStonemaskItem> {
    public BloodStonemaskRenderer() {
        super(new BloodStonemaskModel());

        this.headBone = "armorHead";
    }
}