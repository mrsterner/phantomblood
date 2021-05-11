package phantomblood.mixin;


import moriyashiine.bewitchment.api.BewitchmentAPI;
import moriyashiine.bewitchment.api.interfaces.entity.BloodAccessor;
import moriyashiine.bewitchment.common.registry.BWStatusEffects;
import net.fabricmc.fabric.api.util.NbtType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import phantomblood.common.registry.AngelDeal;
import phantomblood.common.entity.interfaces.AngelDealAccessor;
import phantomblood.common.registry.PhantomBloodObjects;
import phantomblood.common.registry.PhantomBloodRegisters;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity implements AngelDealAccessor {
    private final List<AngelDeal.Instance> angelDeals = new ArrayList<>();


    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public List<AngelDeal.Instance> getAngelDeals() {
        return angelDeals;
    }

    @Inject(method = "tick", at = @At("TAIL"))
    private void tick(CallbackInfo callbackInfo) {
        if (!world.isClient) {
            int level = 0;
            for (int i = angelDeals.size() - 1; i >= 0; i--) {
                AngelDeal.Instance instance = angelDeals.get(i);
                instance.angelDeal.tick((PlayerEntity) (Object) this);
                instance.duration--;
                if (instance.duration <= 0) {
                    angelDeals.remove(i);
                }
            }
            if (level > 0) {
                addStatusEffect(new StatusEffectInstance(BWStatusEffects.PACT, 10, 1, true, false));
            }
        }
    }

    @Inject(method = "eatFood", at = @At("HEAD"))
    private void eat(World world, ItemStack stack, CallbackInfoReturnable<ItemStack> callbackInfo) {
        if (!world.isClient) {
            FoodComponent foodComponent = stack.getItem().getFoodComponent();
            BloodAccessor playerBlood = (BloodAccessor) this;
            if (foodComponent != null && PhantomBloodObjects.VAMPIRE_FOODS.contains(stack.getItem())) {
                if (BewitchmentAPI.isVampire(this, true)) {
                    playerBlood.fillBlood(10, false);
                }

            }
        }
    }

    @Inject(method = "readCustomDataFromTag", at = @At("TAIL"))
    private void readCustomDataFromTag(CompoundTag tag, CallbackInfo callbackInfo) {
        ListTag angelDeals = tag.getList("AngelDeals", NbtType.COMPOUND);
        for (int i = 0; i < angelDeals.size(); i++) {
            CompoundTag angelDeal = angelDeals.getCompound(i);
            addAngelDeal(new AngelDeal.Instance(PhantomBloodRegisters.ANGEL_DEALS.get(new Identifier(angelDeal.getString("AngelDeal"))), angelDeal.getInt("Duration"), angelDeal.getInt("Cost")));
        }
    }

    @Inject(method = "writeCustomDataToTag", at = @At("TAIL"))
    private void writeCustomDataToTag(CompoundTag tag, CallbackInfo callbackInfo) {
        tag.put("AngelDeals", toTagAngelDeal());
    }
}
