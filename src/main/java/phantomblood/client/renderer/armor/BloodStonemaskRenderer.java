package phantomblood.client.renderer.armor;

import phantomblood.client.model.armor.BloodStonemaskModel;
import phantomblood.common.item.BloodStonemaskItem;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class BloodStonemaskRenderer extends GeoArmorRenderer<BloodStonemaskItem> {
    public BloodStonemaskRenderer() {
        super(new BloodStonemaskModel());

        this.headBone = "armorHead";
    }
}