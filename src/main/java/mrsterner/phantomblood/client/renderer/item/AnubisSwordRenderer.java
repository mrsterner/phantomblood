package mrsterner.phantomblood.client.renderer.item;

import mrsterner.phantomblood.client.model.item.AnubisSwordModel;
import mrsterner.phantomblood.common.item.AnubisSwordItem;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

public class AnubisSwordRenderer extends GeoItemRenderer<AnubisSwordItem> {
    public AnubisSwordRenderer() {
        super(new AnubisSwordModel());
    }
}