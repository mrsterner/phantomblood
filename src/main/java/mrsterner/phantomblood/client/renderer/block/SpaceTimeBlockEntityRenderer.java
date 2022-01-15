package mrsterner.phantomblood.client.renderer.block;

import ladysnake.satin.api.managed.ManagedCoreShader;
import ladysnake.satin.api.managed.ShaderEffectManager;
import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.block.SpaceTimeBlockEntity;
import mrsterner.phantomblood.mixin.RenderLayerAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.*;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Matrix4f;

@Environment(EnvType.CLIENT)
public class SpaceTimeBlockEntityRenderer<T extends SpaceTimeBlockEntity> implements BlockEntityRenderer<T> {
    public static Shader skyboxShader;
    public static final RenderPhase.Shader SPACETIME_SHADER = new RenderPhase.Shader(() -> skyboxShader);
    public static final RenderLayer SPACETIME_RENDER_LAYER = ofSkybox("spacetime", new Identifier(PhantomBlood.MODID,"textures/sky/spacetime"));
    public static final ManagedCoreShader SPACETIME_CORE_SHADER = ShaderEffectManager.getInstance().manageCoreShader(new Identifier("spacetime_shader"), VertexFormats.POSITION_TEXTURE);

    @Override
    public void render(T entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        Matrix4f matrix = matrices.peek().getModel();
        Matrix4f inversion = matrix.copy();
        inversion.invert();
        SPACETIME_CORE_SHADER.findUniformMat4("InverseTransformMatrix").set(inversion);
        renderSides(entity, matrix, vertexConsumers.getBuffer(SPACETIME_CORE_SHADER.getRenderLayer(SPACETIME_RENDER_LAYER)));
    }
    private void renderSides(T entity, Matrix4f matrix, VertexConsumer vertexConsumer) {
        this.renderSide(entity, matrix, vertexConsumer, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, Direction.SOUTH);
        this.renderSide(entity, matrix, vertexConsumer, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, Direction.NORTH);
        this.renderSide(entity, matrix, vertexConsumer, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, Direction.EAST);
        this.renderSide(entity, matrix, vertexConsumer, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, Direction.WEST);
        this.renderSide(entity, matrix, vertexConsumer, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, Direction.DOWN);
        this.renderSide(entity, matrix, vertexConsumer, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, Direction.UP);
    }
    private void renderSide(T entity, Matrix4f model, VertexConsumer vertices, float x1, float x2, float y1, float y2, float z1, float z2, float z3, float z4, Direction side) {
            vertices.vertex(model, x1, y1, z1).next();
            vertices.vertex(model, x2, y1, z2).next();
            vertices.vertex(model, x2, y2, z3).next();
            vertices.vertex(model, x1, y2, z4).next();
    }

    public static RenderLayer ofSkybox(String name, Identifier skybox) {
        return RenderLayerAccessor.callOf("spacetime_shader_" + name, VertexFormats.POSITION, VertexFormat.DrawMode.QUADS, 256, false, false, RenderLayer.MultiPhaseParameters.builder().shader(SPACETIME_SHADER)
                .texture(RenderPhase.Textures.create()
                        .add(new Identifier(skybox.getNamespace(), skybox.getPath() + "_0.png"), false, false)
                        .add(new Identifier(skybox.getNamespace(), skybox.getPath() + "_1.png"), false, false)
                        .add(new Identifier(skybox.getNamespace(), skybox.getPath() + "_2.png"), false, false)
                        .add(new Identifier(skybox.getNamespace(), skybox.getPath() + "_3.png"), false, false)
                        .add(new Identifier(skybox.getNamespace(), skybox.getPath() + "_4.png"), false, false)
                        .add(new Identifier(skybox.getNamespace(), skybox.getPath() + "_5.png"), false, false)
                        .build()).build(false));

    }
}
