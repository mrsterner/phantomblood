package mrsterner.phantomblood.common.item;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.registry.PBObjects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BloodStonemaskItem extends GeoArmorItem implements IAnimatable {
    private final AnimationFactory factory = new AnimationFactory(this);
    private String controllerName = "stonemaskController";

    public BloodStonemaskItem(ArmorMaterial materialIn, EquipmentSlot slot, Settings builder) {
        super(materialIn, slot, builder);
    }
    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, controllerName, 20, this::predicate));
    }


    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {

/*
        LivingEntity livingEntity = event.getExtraDataOfType(LivingEntity.class).get(0);
        //PlayerEntity player = (PlayerEntity) livingEntity;
        ItemStack stack = livingEntity.getEquippedStack(EquipmentSlot.HEAD);
        AnimationController controller = GeckoLibUtil.getControllerForStack(this.factory, stack, controllerName);



        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.stonemask.tendril", false));
        event.getController().markNeedsReload();


        if (livingEntity instanceof PlayerEntity) {

            PlayerEntity player = (PlayerEntity) livingEntity;
            List<Item> equipmentList = new ArrayList<>();
            player.getItemsEquipped().forEach((x) -> equipmentList.add(x.getItem()));

            List<Item> armorList = equipmentList.subList(2, 6);

            boolean isWearingAll = armorList.containsAll(Arrays.asList(PBObjects.BLOODY_STONE_MASK_ITEM));
            return isWearingAll ? PlayState.CONTINUE : PlayState.STOP;


        }
        */
        return PlayState.CONTINUE;


    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

    }
}