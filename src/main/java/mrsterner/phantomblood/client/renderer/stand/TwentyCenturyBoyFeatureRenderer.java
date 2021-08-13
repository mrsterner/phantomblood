package mrsterner.phantomblood.client.renderer.stand;

import mrsterner.phantomblood.client.model.HamonModel;
import mrsterner.phantomblood.client.model.stand.TwentyCenturyBoyModel;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class TwentyCenturyBoyFeatureRenderer extends FeatureRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {
    private static TwentyCenturyBoyModel model;
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/stand/20th_century_boy.png");
    double yOffset;

    public TwentyCenturyBoyFeatureRenderer(FeatureRendererContext<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> context, EntityModelLoader modelLoader) {
        super(context);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, AbstractClientPlayerEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        if (StandUtils.getStand((PlayerEntity) entity) == Stand.TWENTY_CENTURY_BOY && StandUtils.isStandActive((PlayerEntity) entity)) {
        matrices.push();
        getContextModel().body.rotate(matrices);
        model.renderBody(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
        matrices.pop();
        matrices.push();
        getContextModel().head.rotate(matrices);
        model.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
        matrices.pop();
        matrices.push();
        getContextModel().rightArm.rotate(matrices);
        model.renderRight(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
        matrices.pop();
        matrices.push();
        getContextModel().leftArm.rotate(matrices);
        model.renderLeft(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
        matrices.pop();
        }
    }
}