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

    }
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, AbstractClientPlayerEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        VertexConsumer vertexConsumer2 = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, this.model.getLayer(TridentEntityModel.TEXTURE), false, true);
    }
}