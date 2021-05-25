package mrsterner.phantomblood;

import mrsterner.phantomblood.client.renderer.armor.*;
import mrsterner.phantomblood.common.item.*;
import mrsterner.phantomblood.client.renderer.item.BloodStonemaskItemRenderer;
import mrsterner.phantomblood.client.renderer.item.StonemaskItemRenderer;
import mrsterner.phantomblood.common.registry.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
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
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> tintIndex == 1 ? ((BedBlock) state.getBlock()).getColor().getFireworkColor() : 0xffffff, PBObjects.RED_COFFIN);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> tintIndex == 1 ? ((BedBlock) Block.getBlockFromItem(stack.getItem())).getColor().getFireworkColor() : 0xffffff, PBObjects.RED_COFFIN);

    }
}