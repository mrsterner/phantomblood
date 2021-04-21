package diosworld.client.renderer.armor;

import diosworld.client.model.armor.StonemaskModel;
import diosworld.common.item.StonemaskItem;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class StonemaskRenderer extends GeoArmorRenderer<StonemaskItem> {
    public StonemaskRenderer() {
        super(new StonemaskModel());

        this.headBone = "armorHead";
    }
}