package phantomblood.common.registry;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.jetbrains.annotations.Nullable;
import phantomblood.common.entity.AngelEntity;

import java.util.List;

public interface AngelMerchant {
    List<AngelEntity.AngelTradeOffer> getOffers();

    LivingEntity getAngelTrader();

    default void trade(AngelEntity.AngelTradeOffer offer) {
        if (!getAngelTrader().world.isClient) {
            offer.apply(this);
        }
    }

    void onSell(AngelEntity.AngelTradeOffer offer);

    void setCurrentCustomer(PlayerEntity customer);

    @Nullable
    PlayerEntity getCurrentCustomer();


    @Environment(EnvType.CLIENT)
    default void setOffersClientside(List<AngelEntity.AngelTradeOffer> offers) {
    }

    @Environment(EnvType.CLIENT)
    default void setAngelTraderClientside(LivingEntity trader) {
    }

    @Environment(EnvType.CLIENT)
    default void setDiscountClientside(boolean discount) {
    }
}