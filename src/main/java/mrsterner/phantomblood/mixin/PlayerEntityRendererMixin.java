package mrsterner.phantomblood.mixin;

import mrsterner.phantomblood.PhantomBloodClient;
import mrsterner.phantomblood.client.model.HamonModel;
import mrsterner.phantomblood.client.model.stand.CrazyDiamondModel;
import mrsterner.phantomblood.client.model.stand.TheWorldModel;
import mrsterner.phantomblood.client.renderer.stand.*;
import mrsterner.phantomblood.common.block.CoffinBlock;
import mrsterner.phantomblood.common.hamon.Hamon;
import mrsterner.phantomblood.common.hamon.HamonUtils;
import mrsterner.phantomblood.common.item.AnubisSwordItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Environment(EnvType.CLIENT)
@Mixin(PlayerEntityRenderer.class)
public abstract class PlayerEntityRendererMixin extends LivingEntityRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {

    public PlayerEntityRendererMixin(EntityRendererFactory.Context ctx, PlayerEntityModel<AbstractClientPlayerEntity> model, float shadowRadius) {
        super(ctx, model, shadowRadius);
    }



    @Inject(method = "<init>(Lnet/minecraft/client/render/entity/EntityRendererFactory$Context;Z)V", at = @At("TAIL"))
    private void PlayerEntityRenderer(EntityRendererFactory.Context ctx, boolean slim, CallbackInfo ci) {
        addFeature(new TwentyCenturyBoyFeatureRenderer(this, ctx.getModelLoader()));
        addFeature(new TheWorldFeatureRenderer(this, ctx.getModelLoader()));
        addFeature(new TheSunFeatureRenderer(this, ctx.getModelLoader()));
        addFeature(new StarPlatinumFeatureRenderer(this, ctx.getModelLoader()));
        addFeature(new KillerQueenFeatureRenderer(this, ctx.getModelLoader()));
        addFeature(new HierophantGreenFeatureRenderer(this, ctx.getModelLoader()));
        addFeature(new CrazyDiamondFeatureRenderer(this, ctx.getModelLoader()));
        addFeature(new PurpleHazeFeatureRenderer(this, ctx.getModelLoader()));
        addFeature(new DarkBlueMoonFeatureRenderer(this, ctx.getModelLoader()));
        addFeature(new WeatherReportFeatureRenderer(this, ctx.getModelLoader()));
        addFeature(new KingCrimsonFeatureRenderer(this, ctx.getModelLoader()));

    }

    @Inject(at = @At("HEAD"), method = "getArmPose", cancellable = true)
    @Environment(EnvType.CLIENT)
    private static void getArmPose(AbstractClientPlayerEntity abstractClientPlayerEntity, Hand hand, CallbackInfoReturnable<BipedEntityModel.ArmPose> cir) {
        ItemStack itemStack = abstractClientPlayerEntity.getStackInHand(hand);
        if (itemStack.getItem() instanceof AnubisSwordItem && abstractClientPlayerEntity.isUsingItem()) {
            cir.setReturnValue(BipedEntityModel.ArmPose.BLOCK);
        }
    }

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void render(AbstractClientPlayerEntity player, float yaw, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light, CallbackInfo callbackInfo) {
        Optional<BlockPos> pos = player.getSleepingPosition();
        if (pos.isPresent() && player.world.getBlockState(pos.get()).getBlock() instanceof CoffinBlock) {
            callbackInfo.cancel();
            return;
        }
    }
}
