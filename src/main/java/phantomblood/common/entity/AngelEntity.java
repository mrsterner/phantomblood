package phantomblood.common.entity;

import moriyashiine.bewitchment.api.BewitchmentAPI;
import moriyashiine.bewitchment.common.entity.living.util.BWHostileEntity;
import moriyashiine.bewitchment.common.registry.BWSoundEvents;
import net.fabricmc.fabric.api.util.NbtType;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import phantomblood.client.network.SyncAngelDealPacket;
import phantomblood.common.entity.interfaces.AngelDealAccessor;
import phantomblood.common.entity.interfaces.AngelMerchant;
import phantomblood.client.screen.AngelScreenHandler;
import phantomblood.client.network.SyncAngelTradesPacket;
import phantomblood.common.registry.*;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class AngelEntity extends BWHostileEntity implements AngelMerchant, IAnimatable {
    AnimationFactory factory = new AnimationFactory(this);
    public static final TrackedData<Boolean> MALE = DataTracker.registerData(AngelEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (!(lastLimbDistance > -0.15F && lastLimbDistance < 0.15F)) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.angel.walk", true));
            return PlayState.CONTINUE;
        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.angel.idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    private final List<AngelEntity.AngelTradeOffer> offers = new ArrayList<>();
    private PlayerEntity customer = null;
    private int tradeResetTimer = 0;

    public AngelEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        experiencePoints = 20;
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 200).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 6).add(EntityAttributes.GENERIC_ARMOR, 4).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25).add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.75);
    }

    @Override
    public void tick() {
        super.tick();
        if (!world.isClient) {
            tradeResetTimer++;
            if (tradeResetTimer >= 168000) {
                tradeResetTimer = 0;
                offers.clear();
            }

        }
    }

    @Override
    protected boolean hasShiny() {
        return true;
    }

    @Override
    public int getVariants() {
        return 1;
    }

    @Override
    public EntityGroup getGroup() {
        return BewitchmentAPI.DEMON;
    }


    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        if (!world.isClient && isAlive()) {
            if (getCurrentCustomer() == null) {
                setCurrentCustomer(player);
            }
            if (!getOffers().isEmpty()) {
                SyncAngelDealPacket.send(player);
                player.openHandledScreen(new SimpleNamedScreenHandlerFactory((id, playerInventory, customer) -> new AngelScreenHandler(id, this), getDisplayName())).ifPresent(syncId -> SyncAngelTradesPacket.send(player, this, syncId));
            } else {
                setCurrentCustomer(null);
            }
        }
        return ActionResult.success(world.isClient);
    }

    @Override
    public boolean canBeLeashedBy(PlayerEntity player) {
        return false;
    }

    @Override
    public boolean cannotDespawn() {
        return true;
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable CompoundTag entityTag) {
        dataTracker.set(MALE, random.nextBoolean());
        return super.initialize(world, difficulty, spawnReason, entityData, entityTag);
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);
        dataTracker.set(MALE, tag.getBoolean("Male"));
        if (tag.contains("Offers")) {
            offers.clear();
            ListTag offersTag = tag.getList("Offers", NbtType.COMPOUND);
            for (Tag offerTag : offersTag) {
                offers.add(new AngelTradeOffer((CompoundTag) offerTag));
            }
        }
        tradeResetTimer = tag.getInt("TradeResetTimer");
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);
        tag.putBoolean("Male", dataTracker.get(MALE));
        if (!offers.isEmpty()) {
            ListTag offersTag = new ListTag();
            for (AngelTradeOffer offer : offers) {
                offersTag.add(offer.toTag());
            }
            tag.put("Offers", offersTag);
        }
        tag.putInt("TradeResetTimer", tradeResetTimer);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        dataTracker.startTracking(MALE, true);
    }

    @Override
    protected void initGoals() {
        goalSelector.add(0, new SwimGoal(this));
        goalSelector.add(1, new LookAtCustomerGoal<>(this));
        goalSelector.add(2, new MeleeAttackGoal(this, 1, true));
        goalSelector.add(3, new WanderAroundFarGoal(this, 1));
        goalSelector.add(4, new LookAtEntityGoal(this, PlayerEntity.class, 8));
        goalSelector.add(5, new LookAroundGoal(this));
        targetSelector.add(0, new RevengeGoal(this));
    }

    @Override
    public void onDeath(DamageSource source) {
        super.onDeath(source);
        setCurrentCustomer(null);
    }

    @Override
    public void setTarget(@Nullable LivingEntity target) {
        super.setTarget(target);
        if (target != null) {
            setCurrentCustomer(null);
        }
    }

    @Override
    public List<AngelEntity.AngelTradeOffer> getOffers() {
        if (offers.isEmpty()) {
            List<AngelDeal> availableAngelDeal = PhantomBloodRegisters.ANGEL_DEALS.stream().collect(Collectors.toList());
            for (int i = 0; i < 3; i++) {
                AngelDeal angelDeal = availableAngelDeal.get(random.nextInt(availableAngelDeal.size()));
                //System.out.println(availableAngelDeal.size());
                offers.add(new AngelTradeOffer(angelDeal, 168000, MathHelper.nextInt(random, 3, 6)));
                availableAngelDeal.remove(angelDeal);
            }
        }
        return offers;
    }

    @Override
    public LivingEntity getAngelTrader() {
        return this;
    }

    @Override
    public void onSell(AngelEntity.AngelTradeOffer offer) {
        if (!world.isClient) {
            world.playSound(null, getBlockPos(), BWSoundEvents.ITEM_CONTRACT_USE, getSoundCategory(), getSoundVolume(), getSoundPitch());
            world.playSound(null, getBlockPos(), getAmbientSound(), getSoundCategory(), getSoundVolume(), getSoundPitch());
        }
    }

    @Override
    public void setCurrentCustomer(PlayerEntity customer) {
        this.customer = customer;
    }

    @Override
    public @Nullable PlayerEntity getCurrentCustomer() {
        return customer;
    }

    @SuppressWarnings("ConstantConditions")
    public static class AngelTradeOffer {
        private final AngelDeal angelDeal;
        private final int duration, cost;

        public AngelTradeOffer(CompoundTag tag) {
            this(PhantomBloodRegisters.ANGEL_DEALS.get(new Identifier(tag.getString("AngelDeal"))), tag.getInt("Duration"), tag.getInt("Cost"));
        }

        public AngelTradeOffer(AngelDeal angelDeal, int duration, int cost) {
            this.angelDeal = angelDeal;
            this.duration = duration;
            this.cost = cost;
        }

        public CompoundTag toTag() {
            CompoundTag tag = new CompoundTag();
            tag.putString("AngelDeal", PhantomBloodRegisters.ANGEL_DEALS.getId(angelDeal).toString());
            tag.putInt("Duration", duration);
            tag.putInt("Cost", cost);
            return tag;
        }

        public static void toPacket(List<AngelTradeOffer> offers, PacketByteBuf buf) {
            buf.writeInt(offers.size());
            for (AngelTradeOffer offer : offers) {
                buf.writeIdentifier(PhantomBloodRegisters.ANGEL_DEALS.getId(offer.getAngelDeal()));
                buf.writeInt(offer.duration);
                buf.writeInt(offer.cost);
            }
        }

        public static List<AngelTradeOffer> fromPacket(PacketByteBuf buf) {
            int count = buf.readInt();
            List<AngelTradeOffer> offers = new ArrayList<>(count);
            for (int i = 0; i < count; i++) {
                offers.add(new AngelTradeOffer(PhantomBloodRegisters.ANGEL_DEALS.get(buf.readIdentifier()), buf.readInt(), buf.readInt()));
            }
            return offers;
        }

        public void apply(AngelMerchant merchant) {
            if (merchant.getCurrentCustomer() != null) {
                PlayerEntity customer = merchant.getCurrentCustomer();
                ((AngelDealAccessor) customer).addAngelDeal(new AngelDeal.Instance(angelDeal, getDuration(), getCost(merchant)));
            }
        }

        public AngelDeal getAngelDeal() {
            return angelDeal;
        }

        public int getDuration() {
            return duration;
        }

        public int getCost(AngelMerchant merchant) {
            return cost;
        }


    }

    public static class LookAtCustomerGoal<T extends MobEntity & AngelMerchant> extends LookAtEntityGoal {
        private final T merchant;

        public LookAtCustomerGoal(T merchant) {
            super(merchant, PlayerEntity.class, 8);
            this.merchant = merchant;
            setControls(EnumSet.of(Control.MOVE, Control.LOOK));
        }

        public boolean canStart() {
            if (this.merchant.getCurrentCustomer() != null) {
                this.target = this.merchant.getCurrentCustomer();
                return true;
            } else {
                return false;
            }
        }
    }
}