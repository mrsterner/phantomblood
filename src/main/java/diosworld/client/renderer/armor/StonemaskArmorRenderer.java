package diosworld.client.renderer.armor;

import diosworld.client.model.armor.StonemaskArmorModel;
import diosworld.common.item.StonemaskArmorItem;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class StonemaskArmorRenderer extends GeoArmorRenderer<StonemaskArmorItem> {
    public StonemaskArmorRenderer() {
        super(new StonemaskArmorModel());

        this.headBone = "armorHead";
    }
}