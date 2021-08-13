package mrsterner.phantomblood.client.renderer.armor;

import mrsterner.phantomblood.client.model.armor.VampireArmorFModel;
import mrsterner.phantomblood.common.item.VampireArmorFItem;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import software.bernie.geckolib3.util.GeoArmorRendererFactory;

public class VampireArmorFRenderer extends GeoArmorRenderer<VampireArmorFItem> {
    public VampireArmorFRenderer(AnimatedGeoModel<VampireArmorFItem> modelProvider, GeoArmorRendererFactory.Context ctx, EntityModelLayer layer) {
        super(modelProvider, ctx, layer);
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
    /*
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

     */
}
