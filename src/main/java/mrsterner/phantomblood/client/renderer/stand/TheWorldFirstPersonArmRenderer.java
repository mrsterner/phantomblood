package mrsterner.phantomblood.client.renderer.stand;


import mrsterner.phantomblood.PhantomBloodClient;
import mrsterner.phantomblood.client.model.stand.KillerQueenModel;
import mrsterner.phantomblood.client.model.stand.TheWorldModel;
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
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3f;

@Environment(EnvType.CLIENT)
public class TheWorldFirstPersonArmRenderer implements WorldRenderEvents.Last {
    private final TheWorldModel model;
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/stand/the_world.png");

    public TheWorldFirstPersonArmRenderer(EntityModelLoader loader) {
        model = new TheWorldModel(loader.getModelPart(PhantomBloodClient.THE_WORLD_MODEL_LAYER));
    }

    @Override
    public void onLast(WorldRenderContext context) {
        PlayerEntity player = MinecraftClient.getInstance().player;
        if (player == null || !StandUtils.isStandActive(player) || StandUtils.getStand(player) != Stand.THE_WORLD || StandUtils.getStandMode(player) != StandMode.ATTACKING || context.camera().isThirdPerson()) {
            return;
        }
        MatrixStack matrixStack = context.matrixStack();
        matrixStack.push();
        matrixStack.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(0.0f));
        matrixStack.scale(-1.0F, -1.0F, 1.0F);
        matrixStack.translate(0.0D, -0.2, -0.8D);
        VertexConsumerProvider.Immediate immediate = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
        VertexConsumer vertexConsumer2 = immediate.getBuffer(RenderLayer.getEntityTranslucent(texture));
        model.setAnglesAttack(player, player.limbAngle, player.limbDistance, player.age+context.tickDelta(), 0.0f, 0.0f);
        model.renderPunchyArms(matrixStack, vertexConsumer2, 15728880, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 0.5f);
        matrixStack.pop();
    }
}
