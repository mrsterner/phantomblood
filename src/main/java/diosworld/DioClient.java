package diosworld;

import diosworld.client.renderer.armor.StonemaskRenderer;
import diosworld.client.renderer.item.StonemaskItemRenderer;
import diosworld.common.item.StonemaskItem;
import diosworld.common.registry.DioObjects;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

@Environment(EnvType.CLIENT)
public class DioClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Dio.registerRenderLayers();



        GeoItemRenderer.registerItemRenderer(DioObjects.STONE_MASK_ITEM, new StonemaskItemRenderer());
        StonemaskRenderer.registerArmorRenderer(StonemaskItem.class, new StonemaskRenderer());

    }
}