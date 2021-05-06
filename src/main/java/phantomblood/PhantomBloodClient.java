package phantomblood;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderingRegistry;
import net.minecraft.util.Identifier;
import phantomblood.client.renderer.armor.BloodStonemaskRenderer;
import phantomblood.client.renderer.armor.StonemaskRenderer;
import phantomblood.client.renderer.armor.VampireArmorRenderer;
import phantomblood.client.renderer.entity.TheWorldRenderer;
import phantomblood.client.renderer.item.BloodStonemaskItemRenderer;
import phantomblood.client.renderer.item.StonemaskItemRenderer;
import phantomblood.common.item.BloodStonemaskItem;
import phantomblood.common.item.StonemaskItem;
import phantomblood.common.item.VampireArmorItem;
import phantomblood.common.registry.PhantomBloodObjects;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;
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
        EntityRendererRegistry.INSTANCE.register(PhantomBloodObjects.THE_WORLD_ENTITY, (entityRenderDispatcher, context) -> new TheWorldRenderer(entityRenderDispatcher));
        GeoArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());
        VampireArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());
        //ArmorRenderingRegistry.registerTexture((livingEntity, itemStack, equipmentSlot, b, s, identifier) -> new Identifier(PhantomBlood.MODID, "textures/entity/armor/vamp.png"), PhantomBloodObjects.VAMPIRE_JACKET, PhantomBloodObjects.VAMPIRE_PANTS, PhantomBloodObjects.VAMPIRE_BOOTS);

    }
}