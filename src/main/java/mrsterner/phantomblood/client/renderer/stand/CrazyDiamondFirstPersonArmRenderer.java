package mrsterner.phantomblood.client.renderer.stand;


import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.client.model.stand.CrazyDiamondModel;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandMode;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ShoulderParrotFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.ParrotEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3f;

@Environment(EnvType.CLIENT)
public class CrazyDiamondFirstPersonArmRenderer implements WorldRenderEvents.Last {
    private final CrazyDiamondModel model;
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/stand/crazy_diamond.png");
    public static final EntityModelLayer CRAZY_DIAMOND_MODEL_LAYER = new EntityModelLayer(new Identifier(PhantomBlood.MODID, "crazy_diamond"), "main");

    public CrazyDiamondFirstPersonArmRenderer(EntityModelLoader loader) {
        model = new CrazyDiamondModel(loader.getModelPart(CRAZY_DIAMOND_MODEL_LAYER));
    }

    @Override
    public void onLast(WorldRenderContext context) {
        PlayerEntity player = MinecraftClient.getInstance().player;
        if (player == null || !StandUtils.isStandActive(player) || StandUtils.getStand(player) != Stand.CRAZY_DIAMOND || context.camera().isThirdPerson()) {
            return;
        }
        MatrixStack matrixStack = context.matrixStack();
        matrixStack.push();
        matrixStack.multiply(context.camera().getRotation());
        matrixStack.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(0.0f));
        matrixStack.scale(-1.0F, -1.0F, 1.0F);
        matrixStack.translate(0.0D, -0.2, 1.5D);
        VertexConsumerProvider.Immediate immediate = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
        VertexConsumer vertexConsumer2 = immediate.getBuffer(RenderLayer.getEntityTranslucent(texture));
        if(StandUtils.getStandMode(player) == StandMode.ATTACKING){
            model.setAttackAngles(player, player.limbAngle, player.limbDistance, player.age+context.tickDelta(), 0.0f, 0.0f);
            model.renderPunchyArms(matrixStack, vertexConsumer2, 15728880, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 0.5f);
        }else if(StandUtils.getStandMode(player) == StandMode.HEALING){
            model.setHealingAngles(player, player.limbAngle, player.limbDistance, player.age+context.tickDelta(), 0.0f, 0.0f);
            model.renderPunchyArmsHeal(matrixStack, vertexConsumer2, 15728880, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 0.5f);
        }
        matrixStack.pop();
    }
}
