package mrsterner.phantomblood.client.renderer;

import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class StasisFeatureRenderer extends FeatureRenderer<LivingEntity, EntityModel<LivingEntity>> {
    private EntityModel<LivingEntity> model;
    public StasisFeatureRenderer(FeatureRendererContext<LivingEntity, EntityModel<LivingEntity>> context) {
        super(context);
        this.model = context.getModel();
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        if (StandUtils.getStand(player) == Stand.NONE) {
            float f = ((float)player.age + tickDelta) * 0.01F % 1;
            matrices.push();
            model.animateModel(player, limbAngle, limbDistance, tickDelta);
            this.getContextModel().copyStateTo(model);
            VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEnergySwirl(new Identifier("textures/entity/creeper/creeper_armor.png"), f, f));
            model.setAngles(player, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            float ratio = MathHelper.clamp(20 / 20F, 0F, 1F);
            model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 1 * ratio, 1 * ratio, 0F, 1.0F);
            matrices.pop();
        }
    }
}