package mrsterner.phantomblood.client.renderer.entity;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import mrsterner.phantomblood.client.model.entity.TheWorldModel;
import mrsterner.phantomblood.common.entity.TheWorldEntity;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class TheWorldRenderer extends GeoEntityRenderer<TheWorldEntity> {
    public TheWorldRenderer(EntityRenderDispatcher renderManager) {
        super(renderManager, new TheWorldModel());
        this.shadowRadius = 0.7F; //change 0.7 to the desired shadow size.
    }

    @Override
    public RenderLayer getRenderType(TheWorldEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
    }
}