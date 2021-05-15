package mrsterner.phantomblood.client.renderer.armor;

import mrsterner.phantomblood.client.model.armor.AscendedArmorModel;
import mrsterner.phantomblood.client.model.armor.WingsArmorModel;
import mrsterner.phantomblood.common.item.AscendedArmorItem;
import mrsterner.phantomblood.common.item.WingsArmorItem;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class AscendedArmorRenderer extends GeoArmorRenderer<AscendedArmorItem> {
    public AscendedArmorRenderer() {
        super(new AscendedArmorModel());

        this.bodyBone = "armorBody";
    }
}
