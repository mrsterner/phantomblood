package mrsterner.phantomblood.client.stand;


import mrsterner.phantomblood.client.model.stand.TheWorldAttackingModel;
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
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class TheWorldFirstPersonArmRenderer implements WorldRenderEvents.Last {
    private final TheWorldAttackingModel model = new TheWorldAttackingModel();
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/stand/the_world.png");

    @Override
    public void onLast(WorldRenderContext context) {
        PlayerEntity player = MinecraftClient.getInstance().player;
        if (
                player == null
                || !StandUtils.isStandActive(player)
                || StandUtils.getStand(player) != Stand.THE_WORLD
                || StandUtils.getStandMode(player) != StandMode.ATTACKING
                || context.camera().isThirdPerson()
        ) {
            return;
        }
        MatrixStack matrixStack = context.matrixStack();
        matrixStack.push();
        matrixStack.multiply(context.camera().getRotation());
        matrixStack.multiply(Vector3f.POSITIVE_X.getDegreesQuaternion(0.0f));
        matrixStack.scale(-1.0F, -1.0F, 1.0F);
        matrixStack.translate(0.0D, -0.2, 1.5D);
        VertexConsumerProvider.Immediate immediate = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
        VertexConsumer vertexConsumer2 = immediate.getBuffer(RenderLayer.getEntityTranslucent(texture));
        model.setAngles(player, player.limbAngle, player.limbDistance, player.age+context.tickDelta(), 0.0f, 0.0f);
        model.renderPunchyArms(matrixStack, vertexConsumer2, 15728880, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 0.5f);
        matrixStack.pop();
    }
}
