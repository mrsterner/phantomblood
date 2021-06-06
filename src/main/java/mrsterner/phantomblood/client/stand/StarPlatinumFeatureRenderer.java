package mrsterner.phantomblood.client.stand;

import mrsterner.phantomblood.client.model.stand.StarPlatinumAttackingModel;
import mrsterner.phantomblood.client.model.stand.StarPlatinumIdleModel;
import mrsterner.phantomblood.client.model.stand.TheWorldAttackingModel;
import mrsterner.phantomblood.client.model.stand.TheWorldIdleModel;
import mrsterner.phantomblood.stand.Stand;
import mrsterner.phantomblood.stand.StandMode;
import mrsterner.phantomblood.stand.StandUtils;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class StarPlatinumFeatureRenderer<T extends LivingEntity> extends FeatureRenderer<T, EntityModel<T>> {
    private final StarPlatinumAttackingModel attackingModel;
    private final StarPlatinumIdleModel idleModel;
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/stand/star_platinum.png");

    public StarPlatinumFeatureRenderer(FeatureRendererContext<T, EntityModel<T>> context, StarPlatinumAttackingModel attackingModel, StarPlatinumIdleModel idleModel) {
        super(context);
        this.attackingModel = attackingModel;
        this.idleModel = idleModel;
    }


    @Override public void render(
        MatrixStack matrices,
        VertexConsumerProvider vertexConsumers,
        int light,
        T entity,
        float limbAngle,
        float limbDistance,
        float tickDelta,
        float animationProgress,
        float headYaw,
        float headPitch
    ) {
        if (!(entity instanceof PlayerEntity) || !StandUtils.isStandActive((PlayerEntity) entity) || StandUtils.getStand((PlayerEntity) entity) != Stand.STAR_PLATINUM) return;

        matrices.push();
        if (StandUtils.getStandMode((PlayerEntity) entity) == StandMode.ATTACKING) {
            attackingModel.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            attackingModel.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
        } else {
            idleModel.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            idleModel.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(texture)), light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
        }
        matrices.pop();
    }
}