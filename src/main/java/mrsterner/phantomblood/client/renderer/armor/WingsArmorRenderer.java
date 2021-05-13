package mrsterner.phantomblood.client.renderer.armor;

import mrsterner.phantomblood.client.model.armor.VampireArmorModel;
import mrsterner.phantomblood.client.model.armor.WingsArmorModel;
import mrsterner.phantomblood.common.item.VampireArmorItem;
import mrsterner.phantomblood.common.item.WingsArmorItem;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class WingsArmorRenderer extends GeoArmorRenderer<WingsArmorItem> {
    public WingsArmorRenderer() {
        super(new WingsArmorModel());

        this.bodyBone = "armorBody";
    }
}
