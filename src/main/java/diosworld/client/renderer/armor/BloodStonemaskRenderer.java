package diosworld.client.renderer.armor;

import diosworld.client.model.armor.BloodStonemaskModel;
import diosworld.client.model.armor.StonemaskModel;
import diosworld.common.item.BloodStonemaskItem;
import diosworld.common.item.StonemaskItem;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class BloodStonemaskRenderer extends GeoArmorRenderer<BloodStonemaskItem> {
    public BloodStonemaskRenderer() {
        super(new BloodStonemaskModel());

        this.headBone = "armorHead";
    }
}