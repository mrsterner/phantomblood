package mrsterner.phantomblood.client.renderer.item;

import mrsterner.phantomblood.client.model.item.StonemaskItemModel;
import mrsterner.phantomblood.common.item.StonemaskItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class StonemaskItemRenderer extends GeoItemRenderer<StonemaskItem> {
    public StonemaskItemRenderer() {
        super(new StonemaskItemModel());
    }
}
