package mrsterner.phantomblood.client.renderer.stand;


import mrsterner.phantomblood.client.model.stand.CrazyDiamondHealingModel;
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
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3f;

@Environment(EnvType.CLIENT)
public class CrazyDiamondHealFirstPersonArmRenderer implements WorldRenderEvents.Last {
    private final CrazyDiamondHealingModel model = new CrazyDiamondHealingModel();
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/stand/crazy_diamond.png");

    @Override
    public void onLast(WorldRenderContext context) {
        PlayerEntity player = MinecraftClient.getInstance().player;
        if (player == null || !StandUtils.isStandActive(player) || StandUtils.getStand(player) != Stand.CRAZY_DIAMOND || StandUtils.getStandMode(player) != StandMode.HEALING || context.camera().isThirdPerson()) {
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
        model.setAngles(player, player.limbAngle, player.limbDistance, player.age+context.tickDelta(), 0.0f, 0.0f);
        model.renderPunchyArms(matrixStack, vertexConsumer2, 15728880, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 0.5f);
        matrixStack.pop();
    }
}
