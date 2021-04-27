package phantomblood;

import phantomblood.client.renderer.armor.BloodStonemaskRenderer;
import phantomblood.client.renderer.armor.StonemaskRenderer;
import phantomblood.client.renderer.item.BloodStonemaskItemRenderer;
import phantomblood.client.renderer.item.StonemaskItemRenderer;
import phantomblood.common.item.BloodStonemaskItem;
import phantomblood.common.item.StonemaskItem;
import phantomblood.common.registry.PhantomBloodObjects;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

@Environment(EnvType.CLIENT)
public class PhantomBloodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        PhantomBlood.registerRenderLayers();



        GeoItemRenderer.registerItemRenderer(PhantomBloodObjects.STONE_MASK_ITEM, new StonemaskItemRenderer());
        GeoItemRenderer.registerItemRenderer(PhantomBloodObjects.BLOODY_STONE_MASK_ITEM, new BloodStonemaskItemRenderer());
        StonemaskRenderer.registerArmorRenderer(StonemaskItem.class, new StonemaskRenderer());
        StonemaskRenderer.registerArmorRenderer(BloodStonemaskItem.class, new BloodStonemaskRenderer());

    }
}