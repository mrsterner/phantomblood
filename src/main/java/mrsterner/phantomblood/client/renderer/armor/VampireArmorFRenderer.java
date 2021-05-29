package mrsterner.phantomblood.client.renderer.armor;

import mrsterner.phantomblood.client.model.armor.VampireArmorFModel;
import mrsterner.phantomblood.client.model.armor.VampireArmorModel;
import mrsterner.phantomblood.common.item.VampireArmorItem;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class VampireArmorFRenderer extends GeoArmorRenderer<VampireArmorItem> {
    public VampireArmorFRenderer() {
        super(new VampireArmorFModel());

        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
