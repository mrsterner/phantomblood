package diosworld.client.renderer.item;

import diosworld.client.model.item.BloodStonemaskItemModel;
import diosworld.client.model.item.StonemaskItemModel;
import diosworld.common.item.BloodStonemaskItem;
import diosworld.common.item.StonemaskItem;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

public class BloodStonemaskItemRenderer extends GeoItemRenderer<BloodStonemaskItem> {
    public BloodStonemaskItemRenderer() {
        super(new BloodStonemaskItemModel());
    }
}
