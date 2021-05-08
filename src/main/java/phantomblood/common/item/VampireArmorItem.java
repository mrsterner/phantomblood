package phantomblood.common.item;

import net.minecraft.client.render.entity.feature.CapeFeatureRenderer;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import phantomblood.PhantomBlood;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

public class VampireArmorItem extends GeoArmorItem implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    public VampireArmorItem(ArmorMaterial materialIn, EquipmentSlot slot) {
        super(materialIn, slot, new Item.Settings().group(PhantomBlood.PHANTOMBLOOD_GROUP).maxCount(1));
    }

    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        LivingEntity livingEntity = event.getExtraDataOfType(LivingEntity.class).get(0);
        if (livingEntity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) livingEntity;
            if (!(player.lastLimbDistance > -0.15F && player.lastLimbDistance < 0.15F)) {
                event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.model.walk", true));
                return PlayState.CONTINUE;
            }

        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.model.idle", true));
        return PlayState.CONTINUE;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller", 20, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public void appendStacks(ItemGroup group, DefaultedList<ItemStack> stacks) {
        ItemStack stack = new ItemStack(this);
        stack.hasTag();
        stack.addEnchantment(Enchantments.FIRE_PROTECTION, 1);
        if ((group == PhantomBlood.PHANTOMBLOOD_GROUP) || (group == ItemGroup.SEARCH)) {
            stacks.add(stack);
        }
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        stack.hasTag();
        stack.addEnchantment(Enchantments.FIRE_PROTECTION, 1);
    }
}