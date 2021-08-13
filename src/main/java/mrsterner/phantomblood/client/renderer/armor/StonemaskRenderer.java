package mrsterner.phantomblood.client.renderer.armor;

import mrsterner.phantomblood.client.model.armor.StonemaskModel;
import mrsterner.phantomblood.common.item.StonemaskItem;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import software.bernie.geckolib3.util.GeoArmorRendererFactory;

public class StonemaskRenderer extends GeoArmorRenderer<StonemaskItem> {
    public StonemaskRenderer(AnimatedGeoModel<StonemaskItem> modelProvider, GeoArmorRendererFactory.Context ctx, EntityModelLayer layer) {
        super(modelProvider, ctx, layer);
    }
    /*
    public StonemaskRenderer() {
        super(new StonemaskModel());

        this.headBone = "armorHead";
    }

     */


    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

}