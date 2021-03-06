package mrsterner.phantomblood.client.renderer.stand;

import mrsterner.phantomblood.PhantomBloodClient;
import mrsterner.phantomblood.client.model.stand.KingCrimsonModel;
import mrsterner.phantomblood.client.model.stand.PurpleHazeModel;
import mrsterner.phantomblood.client.model.stand.StarPlatinumModel;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandMode;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class PurpleHazeFeatureRenderer extends FeatureRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {
    private static PurpleHazeModel model;
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/stand/purple_haze.png");

    public PurpleHazeFeatureRenderer(FeatureRendererContext<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> context, EntityModelLoader modelLoader) {
        super(context);
        model = new PurpleHazeModel(modelLoader.getModelPart(PhantomBloodClient.PURPLE_HAZE_MODEL_LAYER));
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, AbstractClientPlayerEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        if (!(entity instanceof PlayerEntity) || !StandUtils.isStandActive((PlayerEntity) entity) || StandUtils.getStand((PlayerEntity) entity) != Stand.PURPLE_HAZE) return;
        matrices.push();
        if (StandUtils.getStandMode((PlayerEntity) entity) == StandMode.ATTACKING) {
            //model.setAttackAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            //model.renderAttack(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
            //model.renderAttackGlass(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 0.2f);

        } else {
            model.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            model.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
            model.renderGlass(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 0.2f);

        }
        matrices.pop();
    }
}