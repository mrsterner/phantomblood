package diosworld.common.item;

import diosworld.common.registry.DioObjects;
import moriyashiine.bewitchment.common.misc.BWUtil;
import moriyashiine.bewitchment.common.registry.BWSoundEvents;
import moriyashiine.bewitchment.common.registry.BWTags;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;
import software.bernie.geckolib3.util.GeckoLibUtil;


public class BloodStonemaskItem extends GeoArmorItem implements IAnimatable {
    private final AnimationFactory factory = new AnimationFactory(this);
    private String controllerName = "popupController";

    public BloodStonemaskItem(ArmorMaterial materialIn, EquipmentSlot slot, Settings builder) {
        super(materialIn, slot, builder);
    }
    @Override
    public void registerControllers(AnimationData data) {
        AnimationController controller = new AnimationController(this, controllerName, 20, this::predicate);
        data.addAnimationController(controller);
    }


    private <P extends Item & IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.stonemask.tendril", true));
        return PlayState.CONTINUE;
    }



    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        AnimationController controller = GeckoLibUtil.getControllerForStack(this.factory, stack, controllerName);
        if (controller.getAnimationState() == AnimationState.Stopped) {
            controller.markNeedsReload();
            //controller.setAnimation(new AnimationBuilder().addAnimation("animation.stonemask.tendril", false));
        }

    }


    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        boolean client = player.world.isClient;
        ItemStack itemStack = player.getStackInHand(hand);
        ItemStack stonemask = player.getEquippedStack(EquipmentSlot.HEAD);


        if(BWTags.HAS_BLOOD.contains(entity.getType())){

        }

        if (!client) {
            if (entity instanceof MobEntity) {
                ((MobEntity) entity).setPersistent();
            }
            BWUtil.addItemToInventoryAndConsume(player, hand, new ItemStack(DioObjects.AJA));
        }
        else {
            player.world.playSoundFromEntity(player, entity, BWSoundEvents.ENTITY_GENERIC_PLING, SoundCategory.PLAYERS, 1, 1);
        }
        return ActionResult.success(client);
    }

}