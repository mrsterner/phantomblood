package mrsterner.phantomblood.client.renderer.stand;


import mrsterner.phantomblood.client.model.HamonModel;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.TridentEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class HamonFirstPersonArmRenderer implements WorldRenderEvents.Last {
    private final HamonModel model = new HamonModel();
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/hamon/hamon1.png");


    @Override
    public void onLast(WorldRenderContext context) {
        PlayerEntity player = MinecraftClient.getInstance().player;
        if (player == null || StandUtils.getStand(player) != Stand.NONE || context.camera().isThirdPerson()) {
            return;
        }
        /*
        MatrixStack matrixStack = context.matrixStack();
        matrixStack.push();
        matrixStack.multiply(context.camera().getRotation());
        matrixStack.scale(-1.0F, -1.0F, 1.0F);
        matrixStack.translate(0.6D, 0.9, 0.8D);
        matrixStack.multiply(Vector3f.POSITIVE_X.getDegreesQuaternion(140f));
        matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(120f));
        matrixStack.multiply(Vector3f.POSITIVE_Z.getDegreesQuaternion(-5f));
        VertexConsumerProvider.Immediate immediate = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
        VertexConsumer vertexConsumer2 = immediate.getBuffer(RenderLayer.getEntityTranslucent(texture));
        model.render(matrixStack, vertexConsumer2, 15728880, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 0.5f);
        matrixStack.pop();
         */
    }
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, AbstractClientPlayerEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        VertexConsumer vertexConsumer2 = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, this.model.getLayer(TridentEntityModel.TEXTURE), false, true);
    }

}
