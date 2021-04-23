package diosworld;

import diosworld.client.renderer.armor.BloodStonemaskRenderer;
import diosworld.client.renderer.armor.StonemaskRenderer;
import diosworld.client.renderer.item.BloodStonemaskItemRenderer;
import diosworld.client.renderer.item.StonemaskItemRenderer;
import diosworld.common.item.BloodStonemaskItem;
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
        GeoItemRenderer.registerItemRenderer(DioObjects.BLOODY_STONE_MASK_ITEM, new BloodStonemaskItemRenderer());
        StonemaskRenderer.registerArmorRenderer(StonemaskItem.class, new StonemaskRenderer());
        StonemaskRenderer.registerArmorRenderer(BloodStonemaskItem.class, new BloodStonemaskRenderer());

    }
}