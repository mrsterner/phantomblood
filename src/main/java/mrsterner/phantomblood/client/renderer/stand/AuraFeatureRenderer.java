package mrsterner.phantomblood.client.renderer.stand;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.PhantomBloodClient;
import mrsterner.phantomblood.client.model.HamonModel;
import mrsterner.phantomblood.client.model.stand.DarkBlueMoonModel;
import mrsterner.phantomblood.common.hamon.Hamon;
import mrsterner.phantomblood.common.hamon.HamonUtils;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class AuraFeatureRenderer extends FeatureRenderer<LivingEntity, EntityModel<LivingEntity>> {
    private EntityModel<LivingEntity> model;

    public AuraFeatureRenderer(FeatureRendererContext<LivingEntity, EntityModel<LivingEntity>> context) {
        super(context);
        this.model = context.getModel();
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        float f = ((float)entity.age + tickDelta) * 0.01F % 1;
        if ((entity instanceof PlayerEntity) && HamonUtils.isHamonActive((PlayerEntity) entity) && HamonUtils.getHamon((PlayerEntity) entity) == Hamon.HAMON) {
            matrices.push();
            model.animateModel(entity, limbAngle, limbDistance, tickDelta);
            this.getContextModel().copyStateTo(model);
            model.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEnergySwirl(new Identifier(PhantomBlood.MODID, "textures/entity/hamon/aura_yellow.png"), f, f));
            model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 1 , 1 , 1, 1.0F);
            matrices.pop();
            return;
        }
        if (!(entity instanceof PlayerEntity) || !StandUtils.isStandActive((PlayerEntity) entity) || StandUtils.getStand((PlayerEntity) entity) == Stand.NONE && StandUtils.getStandLevel((PlayerEntity) entity)!=0) {
            return;
        }

        matrices.push();
        model.animateModel(entity, limbAngle, limbDistance, tickDelta);
        this.getContextModel().copyStateTo(model);
        model.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
        Stand stand = StandUtils.getStand((PlayerEntity) entity);
        VertexConsumer vertexConsumer;
        switch (stand){
            case KILLER_QUEEN:
            case STAR_PLATINUM:
            case CRAZY_DIAMOND:
            case PURPLE_HAZE:
                vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEnergySwirl(new Identifier(PhantomBlood.MODID, "textures/entity/hamon/aura_purple.png"), f, f));
                break;
            case TWENTY_CENTURY_BOY:
            case DARK_BLUE_MOON:
            case WEATHER_REPORT:
                vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEnergySwirl(new Identifier(PhantomBlood.MODID, "textures/entity/hamon/aura_blue.png"), f, f));
                break;
            case HIEROPHANT_GREEN:
                vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEnergySwirl(new Identifier(PhantomBlood.MODID, "textures/entity/hamon/aura_green.png"), f, f));
                break;
            case KING_CRIMSON:
                vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEnergySwirl(new Identifier(PhantomBlood.MODID, "textures/entity/hamon/aura_red.png"), f, f));
                break;
            default:
                vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEnergySwirl(new Identifier(PhantomBlood.MODID, "textures/entity/hamon/aura_yellow.png"), f, f));
                break;

        }
        model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 1 , 1 , 1, 1.0F);
        matrices.pop();

    }
}