package mrsterner.phantomblood.client.renderer.stand;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;

public class TheSunRenderLayer extends RenderLayer {
    public TheSunRenderLayer(String name, VertexFormat vertexFormat, int drawMode, int expectedBufferSize, boolean hasCrumbling, boolean translucent, Runnable startAction, Runnable endAction) {
        super(name, vertexFormat, drawMode, expectedBufferSize, hasCrumbling, translucent, startAction, endAction);
    }
    public static RenderLayer getSun(Identifier texture) {
        RenderLayer.MultiPhaseParameters multiPhaseParameters = RenderLayer.MultiPhaseParameters.builder().texture(new RenderPhase.Texture(texture, false, false)).diffuseLighting(DISABLE_DIFFUSE_LIGHTING).alpha(HALF_ALPHA).cull(DISABLE_CULLING).lightmap(ENABLE_LIGHTMAP).overlay(DISABLE_OVERLAY_COLOR).layering(VIEW_OFFSET_Z_LAYERING).shadeModel(SMOOTH_SHADE_MODEL).build(true);
        return of("the_sun", VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, 7, 256, false, false, multiPhaseParameters);
    }
}
