package mrsterner.phantomblood.common.item;

import mrsterner.phantomblood.common.registry.PBObjects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.render.block.entity.EndPortalBlockEntityRenderer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

import java.util.List;

public class VampireArmorItem extends GeoArmorItem implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    public VampireArmorItem(ArmorMaterial materialIn, EquipmentSlot slot, Item.Settings builder) {
        super(materialIn, slot, builder);
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
    public boolean hasGlint(ItemStack stack) {
        return false;
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        //stack.hasTag();
        //stack.addEnchantment(Enchantments.FIRE_PROTECTION, 1);
    }
    @Environment(EnvType.CLIENT)
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.getItem() == PBObjects.VAMPIRE_JACKET_F) {
            tooltip.add(new TranslatableText("tooltip.phantomblood.vampire_coat_f").formatted(Formatting.DARK_RED));
        }
    }


}