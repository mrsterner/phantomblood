package diosworld;

import diosworld.client.renderer.item.StonemaskItemRenderer;
import diosworld.common.registry.DioObjects;
import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

public class DioClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        GeoItemRenderer.registerItemRenderer(DioObjects.STONE_MASK_ITEM, new StonemaskItemRenderer());

    }
}