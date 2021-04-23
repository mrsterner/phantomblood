package diosworld.common.item;

import diosworld.Dio;
import diosworld.common.registry.DioObjects;
import moriyashiine.bewitchment.api.BewitchmentAPI;
import moriyashiine.bewitchment.common.misc.BWUtil;
import moriyashiine.bewitchment.common.registry.BWDamageSources;
import moriyashiine.bewitchment.common.registry.BWObjects;
import moriyashiine.bewitchment.common.registry.BWSoundEvents;
import moriyashiine.bewitchment.common.registry.BWTags;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

import javax.swing.*;


public class StonemaskItem extends GeoArmorItem implements IAnimatable {
    private final AnimationFactory factory = new AnimationFactory(this);

    public StonemaskItem(ArmorMaterial materialIn, EquipmentSlot slot, Item.Settings builder) {
        super(materialIn, slot, builder);
    }


    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.stonemask.idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller", 20, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            ItemStack stonemask = player.getEquippedStack(EquipmentSlot.HEAD);

            if (stonemask.getItem() == DioObjects.STONE_MASK_ITEM && ((PlayerEntity) entity).getHealth() >= 10 && !BewitchmentAPI.isVampire(entity, true)) {
                player.addStatusEffect(new StatusEffectInstance(Dio.STONE_MASK_DEATH, 1, 0, false, false, true));
            }
            if (stonemask.getItem() == DioObjects.STONE_MASK_ITEM && ((PlayerEntity) entity).getHealth() == 4 && !BewitchmentAPI.isVampire(entity, true)) {
                player.addStatusEffect(new StatusEffectInstance(Dio.STONE_MASK_VAMP, 20*2, 0, false, false, true));
            }
        }
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if(BWTags.HAS_BLOOD.contains(entity.getType())){

        }
        boolean client = user.world.isClient;
        if (!client) {
            if (entity instanceof MobEntity) {
                ((MobEntity) entity).setPersistent();
            }
            BWUtil.addItemToInventoryAndConsume(user, hand, new ItemStack(DioObjects.AJA));
        }
        else {
            user.world.playSoundFromEntity(user, entity, BWSoundEvents.ENTITY_GENERIC_PLING, SoundCategory.PLAYERS, 1, 1);
        }
        return ActionResult.success(client);
    }
}