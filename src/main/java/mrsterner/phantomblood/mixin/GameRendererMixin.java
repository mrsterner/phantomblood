package mrsterner.phantomblood.mixin;

import com.mojang.datafixers.util.Pair;
import mrsterner.phantomblood.client.renderer.block.SpaceTimeBlockEntityRenderer;
import net.minecraft.client.gl.Program;
import net.minecraft.client.gl.ShaderEffect;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.Shader;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

@Mixin(GameRenderer.class)
public class GameRendererMixin {

    @Unique
    private final HashMap<Identifier, ShaderEffect> shaderEffects = new HashMap<Identifier, ShaderEffect>();


    @Inject(method = "reload", at = @At("HEAD"))
    private void reloadSpaceTime(ResourceManager manager, CallbackInfo ci) {
        shaderEffects.forEach((id, shaderEffect) -> shaderEffect.close());
        shaderEffects.clear();
    }

    @Inject(method = "loadShaders", at = @At(value = "INVOKE", target = "Ljava/util/List;add(Ljava/lang/Object;)Z", ordinal = 53, shift = At.Shift.AFTER), locals = LocalCapture.CAPTURE_FAILHARD)
    private void loadSpaceTime(ResourceManager manager, CallbackInfo ci, List<Program> list, List<Pair<Shader, Consumer<Shader>>> list2) {
        try {
            list2.add(Pair.of(new Shader(manager, "spacetime_shader", VertexFormats.POSITION), (shader) -> {
                SpaceTimeBlockEntityRenderer.skyboxShader = shader;
            }));
        } catch (IOException e) {
            list2.forEach((pair) -> {
                pair.getFirst().close();
            });
            throw new RuntimeException("could not reload shaders", e);
        }
    }
}
