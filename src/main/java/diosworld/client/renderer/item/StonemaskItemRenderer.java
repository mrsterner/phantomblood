package diosworld.client.renderer.item;

import diosworld.client.model.item.StonemaskItemModel;
import diosworld.common.item.StonemaskItem;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

public class StonemaskItemRenderer extends GeoItemRenderer<StonemaskItem> {
    public StonemaskItemRenderer() {
        super(new StonemaskItemModel());
    }
}
