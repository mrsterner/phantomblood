package phantomblood.common.item;

import moriyashiine.bewitchment.common.registry.BWSoundEvents;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.*;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import phantomblood.PhantomBlood;
import phantomblood.common.registry.AngelDeal;
import phantomblood.common.entity.interfaces.AngelDealAccessor;
import phantomblood.common.registry.PhantomBloodRegisters;

import java.util.List;

@SuppressWarnings("ConstantConditions")
public class AngelDealItem extends Item {
    public AngelDealItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient && stack.hasTag() && user instanceof PlayerEntity) {
            AngelDeal angelDeal = PhantomBloodRegisters.ANGEL_DEALS.get(new Identifier(stack.getOrCreateTag().getString("AngelDeal")));
            if (angelDeal != null) {
                ((AngelDealAccessor) user).addAngelDeal(new AngelDeal.Instance(angelDeal, stack.getTag().getInt("Duration")));
                world.playSound(null, user.getBlockPos(), BWSoundEvents.ITEM_CONTRACT_USE, SoundCategory.PLAYERS, 1, 1);
                if (!((PlayerEntity) user).isCreative()) {
                    stack.decrement(1);
                }
                return stack;
            }
        }
        return stack;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    @Override
    public void appendStacks(ItemGroup group, DefaultedList<ItemStack> stacks) {
        if (isIn(group)) {
            PhantomBloodRegisters.ANGEL_DEALS.forEach(contract -> {
                ItemStack stack = new ItemStack(this);
                stack.getOrCreateTag().putString("AngelDeal", PhantomBloodRegisters.ANGEL_DEALS.getId(contract).toString());
                stack.getOrCreateTag().putInt("Duration", 168000);
                stacks.add(stack);
            });
        }
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.hasTag() && stack.getOrCreateTag().contains("AngelDeal")) {
            tooltip.add(new TranslatableText("angeldeal." + stack.getOrCreateTag().getString("AngelDeal").replace(":", ".")).formatted(Formatting.DARK_RED));
            tooltip.add(new TranslatableText(PhantomBlood.MODID + ".tooltip.days", stack.getOrCreateTag().getInt("Duration") / 24000).formatted(Formatting.DARK_RED));
        }
    }
}