package mrsterner.phantomblood.client.renderer.stand;

import mrsterner.phantomblood.PhantomBloodClient;
import mrsterner.phantomblood.client.model.stand.*;
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

public class CrazyDiamondFeatureRenderer extends FeatureRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {
    private static CrazyDiamondModel idleModel;
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/stand/crazy_diamond.png");

    public CrazyDiamondFeatureRenderer(FeatureRendererContext<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> context, EntityModelLoader modelLoader) {
        super(context);
        idleModel = new CrazyDiamondModel(modelLoader.getModelPart(PhantomBloodClient.CRAZY_DIAMOND_MODEL_LAYER));
    }


    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, AbstractClientPlayerEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        if (!(entity instanceof PlayerEntity) || !StandUtils.isStandActive((PlayerEntity) entity) || StandUtils.getStand((PlayerEntity) entity) != Stand.CRAZY_DIAMOND) return;
        matrices.push();
        if (StandUtils.getStandMode((PlayerEntity) entity) == StandMode.ATTACKING) {
            idleModel.setAttackAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            idleModel.renderAttack(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
        }else if(StandUtils.getStandMode((PlayerEntity) entity) == StandMode.HEALING){
            idleModel.setHealingAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            idleModel.renderHeal(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
        }
        else {
            idleModel.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            idleModel.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
        }
        matrices.pop();
    }
}