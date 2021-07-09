package mrsterner.phantomblood.client.renderer.stand.GeckoTest;

import mrsterner.phantomblood.client.renderer.stand.GeckoTest.SunEntity;
import mrsterner.phantomblood.client.renderer.stand.GeckoTest.SunEntityModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class SunEntityRenderer extends GeoEntityRenderer<SunEntity> {
    public SunEntityRenderer(EntityRenderDispatcher renderManager) {
        super(renderManager, new SunEntityModel());
    }
}
