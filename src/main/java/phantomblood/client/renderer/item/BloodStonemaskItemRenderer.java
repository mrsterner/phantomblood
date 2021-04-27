package phantomblood.client.renderer.item;

import phantomblood.client.model.item.BloodStonemaskItemModel;
import phantomblood.common.item.BloodStonemaskItem;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

public class BloodStonemaskItemRenderer extends GeoItemRenderer<BloodStonemaskItem> {
    public BloodStonemaskItemRenderer() {
        super(new BloodStonemaskItemModel());
    }
}
