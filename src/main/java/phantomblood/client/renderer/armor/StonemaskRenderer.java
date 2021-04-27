package phantomblood.client.renderer.armor;

import phantomblood.client.model.armor.StonemaskModel;
import phantomblood.common.item.StonemaskItem;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class StonemaskRenderer extends GeoArmorRenderer<StonemaskItem> {
    public StonemaskRenderer() {
        super(new StonemaskModel());

        this.headBone = "armorHead";
    }
}