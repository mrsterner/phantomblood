package mrsterner.phantomblood.client.renderer.item;

import mrsterner.phantomblood.client.model.item.BloodStonemaskItemModel;
import mrsterner.phantomblood.common.item.BloodStonemaskItem;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

public class BloodStonemaskItemRenderer extends GeoItemRenderer<BloodStonemaskItem> {
    public BloodStonemaskItemRenderer() {
        super(new BloodStonemaskItemModel());
    }
}
