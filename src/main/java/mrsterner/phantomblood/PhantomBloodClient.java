package mrsterner.phantomblood;

import mrsterner.phantomblood.client.renderer.armor.*;
import mrsterner.phantomblood.common.item.*;
import mrsterner.phantomblood.client.renderer.item.BloodStonemaskItemRenderer;
import mrsterner.phantomblood.client.renderer.item.StonemaskItemRenderer;
import mrsterner.phantomblood.common.registry.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;


@Environment(EnvType.CLIENT)
public class PhantomBloodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        GeoItemRenderer.registerItemRenderer(PBObjects.STONE_MASK_ITEM, new StonemaskItemRenderer());
        GeoItemRenderer.registerItemRenderer(PBObjects.BLOODY_STONE_MASK_ITEM, new BloodStonemaskItemRenderer());
        StonemaskRenderer.registerArmorRenderer(StonemaskItem.class, new StonemaskRenderer());
        StonemaskRenderer.registerArmorRenderer(BloodStonemaskItem.class, new BloodStonemaskRenderer());
        GeoArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());
        VampireArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());

    }
}