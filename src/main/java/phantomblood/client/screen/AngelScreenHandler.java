package phantomblood.client.screen;

import moriyashiine.bewitchment.common.registry.BWDamageSources;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.jetbrains.annotations.Nullable;
import phantomblood.client.network.SyncAngelDealPacket;
import phantomblood.client.network.SyncAngelTradesPacket;
import phantomblood.common.entity.AngelEntity;
import phantomblood.common.entity.interfaces.AngelDealAccessor;
import phantomblood.common.entity.interfaces.AngelMerchant;
import phantomblood.common.registry.PhantomBloodObjects;
import phantomblood.common.registry.PhantomBloodRegisters;
import phantomblood.common.registry.PhantomBloodScreenHandler;

import java.util.ArrayList;
import java.util.List;

public class AngelScreenHandler extends ScreenHandler {
    public AngelMerchant angelMerchant;
    public Inventory angelInventory = new SimpleInventory(getOfferCount());

    public AngelScreenHandler(int syncId) {
        this(syncId, new AngelMerchantImpl());
    }

    public AngelScreenHandler(int syncId, AngelMerchant angelMerchant) {
        this(PhantomBloodScreenHandler.ANGEL_SCREEN_HANDLER, syncId, angelMerchant);
    }

    protected AngelScreenHandler(ScreenHandlerType<?> type, int syncId, AngelMerchant angelMerchant) {
        super(type, syncId);
        this.angelMerchant = angelMerchant;
        addSlot(new AngelTradeSlot(angelInventory, 0, 41, 96));
        addSlot(new AngelTradeSlot(angelInventory, 1, 80, 104));
        addSlot(new AngelTradeSlot(angelInventory, 2, 119, 96));
    }

    public int getOfferCount() {
        return 3;
    }

    @Override
    public void close(PlayerEntity player) {
        super.close(player);
        angelMerchant.setCurrentCustomer(null);
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        return ItemStack.EMPTY;
    }

    @Override
    public ItemStack onSlotClick(int i, int j, SlotActionType actionType, PlayerEntity playerEntity) {
        if (i == -999) {
            return super.onSlotClick(i, j, actionType, playerEntity);
        }
        Slot slot = slots.get(i);
        if (slot instanceof AngelTradeSlot) {
            AngelEntity.AngelTradeOffer offer = ((AngelTradeSlot) slot).getOffer();
            if (!((AngelDealAccessor) playerEntity).hasAngelDeal(offer.getAngelDeal())) {
                angelMerchant.onSell(offer);
                angelMerchant.trade(offer);
                System.out.println("1");
                if (!angelMerchant.getAngelTrader().world.isClient) {
                    SyncAngelDealPacket.send(playerEntity);
                    SyncAngelTradesPacket.send(playerEntity, angelMerchant, syncId);
                    int cost = offer.getCost(angelMerchant);
                    System.out.println("2");
                    if (playerEntity.getAbsorptionAmount() - cost <= 0) {
                        ((AngelDealAccessor) playerEntity).getAngelDeals().clear();
                        playerEntity.damage(BWDamageSources.DEATH, Float.MAX_VALUE);
                    } else if (playerEntity.getAbsorptionAmount() > cost) {
                        playerEntity.setAbsorptionAmount(playerEntity.getAbsorptionAmount() - cost);
                        System.out.println("3");
                    }
                }
            }
            return ItemStack.EMPTY;
        }
        return super.onSlotClick(i, j, actionType, playerEntity);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void updateSlotStacks(List<ItemStack> stacks) {
        super.updateSlotStacks(stacks);
    }

    @Override
    public void onContentChanged(Inventory inventory) {
        super.onContentChanged(inventory);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return !player.isSpectator();
    }

    @SuppressWarnings("ConstantConditions")
    public class AngelTradeSlot extends Slot {
        private final int angelDealIndex;

        public AngelTradeSlot(Inventory inventory, int index, int x, int y) {
            super(inventory, index, x, y);
            angelDealIndex = index;
        }

        @Override
        public boolean doDrawHoveringEffect() {
            return getOffer() != null && super.doDrawHoveringEffect();
        }

        @Override
        public ItemStack getStack() {
            AngelEntity.AngelTradeOffer offer = getOffer();
            if (offer != null) {
                ItemStack angelDeal = new ItemStack(PhantomBloodObjects.ANGEL_DEAL);
                angelDeal.getOrCreateTag().putString("AngelDeal", PhantomBloodRegisters.ANGEL_DEALS.getId(getOffer().getAngelDeal()).toString());
                angelDeal.getOrCreateTag().putInt("Duration", getOffer().getDuration());
                return angelDeal;
            }
            return ItemStack.EMPTY;
        }

        public AngelEntity.AngelTradeOffer getOffer() {
            return angelMerchant.getOffers().size() > angelDealIndex ? angelMerchant.getOffers().get(angelDealIndex) : null;
        }
    }

    protected static class AngelMerchantImpl implements AngelMerchant {
        private List<AngelEntity.AngelTradeOffer> offers = new ArrayList<>();
        private PlayerEntity costumer;
        private LivingEntity trader;
        private boolean discount;

        @Override
        public List<AngelEntity.AngelTradeOffer> getOffers() {
            return offers;
        }

        @Override
        public void trade(AngelEntity.AngelTradeOffer offer) {
        }

        @Override
        public LivingEntity getAngelTrader() {
            return trader;
        }

        @Override
        public void onSell(AngelEntity.AngelTradeOffer offer) {
        }

        @Override
        public void setCurrentCustomer(PlayerEntity customer) {
            costumer = customer;
        }

        @Override
        public @Nullable PlayerEntity getCurrentCustomer() {
            return costumer;
        }

        @Override
        @Environment(EnvType.CLIENT)
        public void setOffersClientside(List<AngelEntity.AngelTradeOffer> offers) {
            this.offers = offers;
        }

        @Override
        @Environment(EnvType.CLIENT)
        public void setAngelTraderClientside(LivingEntity trader) {
            this.trader = trader;
        }


    }
}