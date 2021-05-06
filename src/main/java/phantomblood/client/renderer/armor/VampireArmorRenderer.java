package phantomblood.client.renderer.armor;

import phantomblood.client.model.armor.VampireArmorModel;
import phantomblood.common.item.VampireArmorItem;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;

public class VampireArmorRenderer extends GeoArmorRenderer<VampireArmorItem> {
    public VampireArmorRenderer() {
        super(new VampireArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
