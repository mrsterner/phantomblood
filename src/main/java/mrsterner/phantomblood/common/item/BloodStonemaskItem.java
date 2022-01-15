package mrsterner.phantomblood.common.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;


public class BloodStonemaskItem extends ArmorItem implements IAnimatable {
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
        ItemStack stack = livingEntity.getEquippedStack(EquipmentSlot.HEAD);
        AnimationController controller = GeckoLibUtil.getControllerForStack(this.factory, stack, controllerName);

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.stonemask.tendril", true));
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