package mrsterner.phantomblood;

import mrsterner.phantomblood.client.renderer.armor.WingsArmorRenderer;
import mrsterner.phantomblood.common.item.WingsArmorItem;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.screen.ScreenHandler;
import mrsterner.phantomblood.client.network.SyncAngelDealPacket;
import mrsterner.phantomblood.client.network.SyncAngelTradesPacket;
import mrsterner.phantomblood.client.renderer.armor.BloodStonemaskRenderer;
import mrsterner.phantomblood.client.renderer.armor.StonemaskRenderer;
import mrsterner.phantomblood.client.renderer.armor.VampireArmorRenderer;
import mrsterner.phantomblood.client.renderer.entity.AngelRenderer;
import mrsterner.phantomblood.client.renderer.entity.TheWorldRenderer;
import mrsterner.phantomblood.client.renderer.item.BloodStonemaskItemRenderer;
import mrsterner.phantomblood.client.renderer.item.StonemaskItemRenderer;
import mrsterner.phantomblood.client.screen.AngelScreen;
import mrsterner.phantomblood.client.screen.AngelScreenHandler;
import mrsterner.phantomblood.common.entity.AngelEntity;
import mrsterner.phantomblood.common.item.BloodStonemaskItem;
import mrsterner.phantomblood.common.item.StonemaskItem;
import mrsterner.phantomblood.common.item.VampireArmorItem;
import mrsterner.phantomblood.common.registry.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import software.bernie.geckolib3.renderer.geo.GeoArmorRenderer;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

import java.util.List;

@Environment(EnvType.CLIENT)
public class PhantomBloodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ClientPlayNetworking.registerGlobalReceiver(SyncAngelDealPacket.ID, SyncAngelDealPacket::handle);
        ClientPlayNetworking.registerGlobalReceiver(SyncAngelTradesPacket.ID, (client, network, buf, sender) -> {
            int syncId = buf.readInt();
            List<AngelEntity.AngelTradeOffer> offers = AngelEntity.AngelTradeOffer.fromPacket(buf);
            int traderId = buf.readInt();
            client.execute(() -> {
                if (client.player != null) {
                    ScreenHandler screenHandler = client.player.currentScreenHandler;
                    if (syncId == screenHandler.syncId && screenHandler instanceof AngelScreenHandler) {
                        ((AngelScreenHandler) screenHandler).angelMerchant.setCurrentCustomer(client.player);
                        ((AngelScreenHandler) screenHandler).angelMerchant.setOffersClientside(offers);
                        ((AngelScreenHandler) screenHandler).angelMerchant.setAngelTraderClientside((LivingEntity) client.world.getEntityById(traderId));
                    }
                }
            });
        });
        ScreenRegistry.register(PBScreenHandler.ANGEL_SCREEN_HANDLER, AngelScreen::new);

        GeoItemRenderer.registerItemRenderer(PBObjects.STONE_MASK_ITEM, new StonemaskItemRenderer());
        GeoItemRenderer.registerItemRenderer(PBObjects.BLOODY_STONE_MASK_ITEM, new BloodStonemaskItemRenderer());
        StonemaskRenderer.registerArmorRenderer(StonemaskItem.class, new StonemaskRenderer());
        StonemaskRenderer.registerArmorRenderer(BloodStonemaskItem.class, new BloodStonemaskRenderer());
        EntityRendererRegistry.INSTANCE.register(PBObjects.THE_WORLD_ENTITY, (entityRenderDispatcher, context) -> new TheWorldRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(PBEntities.ANGEL_ENTITY, (entityRenderDispatcher, context) -> new AngelRenderer(entityRenderDispatcher));
        GeoArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());
        VampireArmorRenderer.registerArmorRenderer(VampireArmorItem.class, new VampireArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(WingsArmorItem.class, new WingsArmorRenderer());
        WingsArmorRenderer.registerArmorRenderer(WingsArmorItem.class, new WingsArmorRenderer());

    }
}