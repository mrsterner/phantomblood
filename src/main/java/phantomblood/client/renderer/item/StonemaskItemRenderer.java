package phantomblood.client.renderer.item;

import phantomblood.client.model.item.StonemaskItemModel;
import phantomblood.common.item.StonemaskItem;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

public class StonemaskItemRenderer extends GeoItemRenderer<StonemaskItem> {
    public StonemaskItemRenderer() {
        super(new StonemaskItemModel());
    }
}
