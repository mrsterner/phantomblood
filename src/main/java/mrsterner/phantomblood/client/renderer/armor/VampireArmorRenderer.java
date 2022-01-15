package mrsterner.phantomblood.client.renderer.armor;

import mrsterner.phantomblood.client.model.armor.VampireArmorModel;
import mrsterner.phantomblood.common.item.VampireArmorItem;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import software.bernie.geckolib3.util.GeoArmorRendererFactory;

public class VampireArmorRenderer extends GeoArmorRenderer<VampireArmorItem> {
    public VampireArmorRenderer(AnimatedGeoModel<VampireArmorItem> modelProvider, GeoArmorRendererFactory.Context ctx, EntityModelLayer layer) {
        super(modelProvider);
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
    /*
    public VampireArmorRenderer() {
        super(new VampireArmorModel());

        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }

     */
}
