package mrsterner.phantomblood.client.renderer.stand.GeckoTest;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.client.renderer.stand.GeckoTest.SunEntity;
import mrsterner.phantomblood.client.renderer.stand.GeckoTest.SunEntityRenderer;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.renderer.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;

public class TheSunGeoFeatureRenderer<T extends LivingEntity & IAnimatable> extends GeoLayerRenderer<T> {
    private final SunEntityRenderer sunEntityRenderer;
    Identifier sunLocation = null;

    public TheSunGeoFeatureRenderer(IGeoRenderer<T> entityRendererIn, SunEntityRenderer sunEntityRenderer) {
        super(entityRendererIn);
        this.sunEntityRenderer = sunEntityRenderer;
    }


    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if ((PlayerEntity) entity == null || !StandUtils.isStandActive((PlayerEntity) entity) || StandUtils.getStand((PlayerEntity) entity) != Stand.THE_SUN) return;
        this.sunLocation = new Identifier(PhantomBlood.MODID, "textures/entity/stand/the_sun.png");
        sunEntityRenderer.render(getEntityModel()
                        .getModel(new Identifier(PhantomBlood.MODID, "geo/sun_model.geo.json")), (SunEntity) entity, partialTicks, RenderLayer.getEntityCutout(sunLocation), matrixStackIn,
                vertexConsumers,
                vertexConsumers.getBuffer(RenderLayer.getEntityCutout(sunLocation)),
                light, OverlayTexture.DEFAULT_UV, 1, 1, 1, 1);
    }
}