package mrsterner.phantomblood.mixin;

import mrsterner.phantomblood.client.model.HamonModel;
import mrsterner.phantomblood.client.model.stand.StarPlatinumModel;
import mrsterner.phantomblood.client.renderer.stand.HamonFeatureRenderer;
import mrsterner.phantomblood.common.block.CoffinBlock;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandMode;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Optional;

@Environment(EnvType.CLIENT)
@Mixin(PlayerEntityRenderer.class)
public abstract class PlayerEntityRendererMixin extends LivingEntityRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {
    private final HamonModel model = new HamonModel();
    private static final Identifier texture = new Identifier("phantomblood:textures/entity/hamon/hamon1.png");


    public PlayerEntityRendererMixin(EntityRenderDispatcher dispatcher, PlayerEntityModel<AbstractClientPlayerEntity> model, float shadowRadius) {
        super(dispatcher, model, shadowRadius);
    }

    @Inject(method = "<init>(Lnet/minecraft/client/render/entity/EntityRenderDispatcher;Z)V", at = @At("TAIL"))
    private void PlayerEntityRenderer(EntityRenderDispatcher dispatcher, boolean bl, CallbackInfo callbackInfo) {
        addFeature(new HamonFeatureRenderer(this));
    }

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void render(AbstractClientPlayerEntity player, float yaw, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light, CallbackInfo callbackInfo) {
        Optional<BlockPos> pos = player.getSleepingPosition();
        if (pos.isPresent() && player.world.getBlockState(pos.get()).getBlock() instanceof CoffinBlock) {
            callbackInfo.cancel();
            return;
        }
    }

    @Inject(method = "renderRightArm", at = @At("HEAD"), cancellable = true)
    private void renderRightArm(MatrixStack matrices, VertexConsumerProvider vertices, int lightmap, AbstractClientPlayerEntity renderedPlayer, CallbackInfo ci) {
        PlayerEntity player = MinecraftClient.getInstance().player;
        if(StandUtils.getStand(player) == Stand.HAMON){
            matrices.push();
            PlayerEntityModel<AbstractClientPlayerEntity> playerEntityModel = (PlayerEntityModel)this.getModel();
            playerEntityModel.copyStateTo(model);
            matrices.translate(-0.3F,0.1F,-0.01F);
            matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(7.5f));
            model.render(matrices, vertices.getBuffer(RenderLayer.getEntityTranslucent(texture)), lightmap, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 0.6f);
            model.renderHeat(matrices, vertices.getBuffer(RenderLayer.getEntityTranslucent(texture)), lightmap, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 0.3f);
            matrices.pop();
        }
    }
}
