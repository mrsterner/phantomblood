package mrsterner.phantomblood.client.renderer.stand;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.client.model.HamonModel;
import mrsterner.phantomblood.common.hamon.Hamon;
import mrsterner.phantomblood.common.hamon.HamonUtils;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class HamonFeatureRenderer extends FeatureRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {
    private static HamonModel model;
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/hamon/hamon1.png");
    double yOffset;
    public static final EntityModelLayer HAMON_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "hamon"), "main");

    public HamonFeatureRenderer(FeatureRendererContext<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> context, EntityModelLoader loader) {
        super(context);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, AbstractClientPlayerEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        this.yOffset = 0.6F + MathHelper.cos((float)(0.1D * (double)animationProgress))/2.5;
         if (HamonUtils.getHamon((PlayerEntity) entity) == Hamon.HAMON) {
        matrices.push();
        getContextModel().rightArm.rotate(matrices);
        model.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 0.4f);
        model.renderHeat(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, (float) (0.8f * yOffset));
        matrices.pop();
         }
    }
}