package mrsterner.phantomblood.client.renderer.stand;

import mrsterner.phantomblood.client.model.stand.TheSunModel;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandMode;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class TheSunFeatureRenderer<T extends LivingEntity> extends FeatureRenderer<T, EntityModel<T>> {
    private final TheSunModel idleModel;
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/stand/the_sun.png");

    public TheSunFeatureRenderer(FeatureRendererContext<T, EntityModel<T>> context, TheSunModel idleModel) {
        super(context);
        this.idleModel = idleModel;
    }

    @Override public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        if (!(entity instanceof PlayerEntity) || !StandUtils.isStandActive((PlayerEntity) entity) || StandUtils.getStand((PlayerEntity) entity) != Stand.THE_SUN) return;
        matrices.push();
        if(StandUtils.getStandMode((PlayerEntity) entity) == StandMode.IDLE){
            idleModel.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            idleModel.render(matrices, vertexConsumers.getBuffer(TheSunRenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
            idleModel.renderHeat(matrices, vertexConsumers.getBuffer(TheSunRenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 0.4f);
            idleModel.renderHeat2(matrices, vertexConsumers.getBuffer(TheSunRenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 0.2f);
        }else {

            idleModel.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            idleModel.renderAttack(matrices, vertexConsumers.getBuffer(TheSunRenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
            idleModel.renderHeatAttack(matrices, vertexConsumers.getBuffer(TheSunRenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 0.4f);
            idleModel.renderHeat2Attack(matrices, vertexConsumers.getBuffer(TheSunRenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 0.2f);

        }
        matrices.pop();

    }
}