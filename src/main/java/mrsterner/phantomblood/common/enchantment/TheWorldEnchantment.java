package mrsterner.phantomblood.common.enchantment;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.item.ArrowHeadItem;
import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.block.entity.EnchantingTableBlockEntity;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.InfinityEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

public class TheWorldEnchantment extends Enchantment {
    public TheWorldEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }
    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other)
                && other.canCombine(PhantomBlood.STAR_PLATINUM_ENCHANTMENT)
                && other.canCombine(PhantomBlood.THE_SUN_ENCHANTMENT)
                && other.canCombine(PhantomBlood.CRAZY_DIAMOND_ENCHANTMENT)
                && other.canCombine(PhantomBlood.WEATHER_REPORT_ENCHANTMENT)
                && other.canCombine(PhantomBlood.KILLER_QUEEN_ENCHANTMENT)
                && other.canCombine(PhantomBlood.DARK_BLUE_MOON_ENCHANTMENT);
    }

    @Override
    public int getMinPower(int level) {
        return 20;
    }

    @Override
    public int getMaxPower(int level) { return 50; }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof ArrowHeadItem;
    }
}