package mrsterner.phantomblood.client;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.Matrix4f;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexFormats;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import com.mojang.blaze3d.systems.RenderSystem;

import org.lwjgl.opengl.GL11;

import com.mojang.blaze3d.platform.GlStateManager;

@Environment(EnvType.CLIENT)
public class OverlayHandler {
    public static void render(MatrixStack matrices, float tickDelta) {
        int posX = (int) ((MinecraftClient.getInstance().getWindow().getScaledWidth()) * 8);
        int posY = (int) ((MinecraftClient.getInstance().getWindow().getScaledHeight()) * 8);
        int posXnominal = (int) ((MinecraftClient.getInstance().getWindow().getScaledWidth()));
        int posYnominal = (int) ((MinecraftClient.getInstance().getWindow().getScaledHeight()));
        PlayerEntity player = MinecraftClient.getInstance().player;

        Identifier psiContainer = new Identifier("rectulumbase:textures/graphical/psimeter.png");
        Identifier expandable = new Identifier("rectulumbase:textures/graphical/expandable.png");
        Identifier circleMask = new Identifier("rectulumbase:textures/graphical/psimaks.png");

        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        Matrix4f matrix = matrices.peek().getModel();



    }
}
