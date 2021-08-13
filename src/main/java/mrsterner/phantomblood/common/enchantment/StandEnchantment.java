package mrsterner.phantomblood.common.enchantment;

import mrsterner.phantomblood.common.registry.PBEnchantments;
import net.minecraft.enchantment.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class StandEnchantment extends Enchantment {
    //public static String calc;

    public StandEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other);
                /*
                && other != PBEnchantments.CRAZY_DIAMOND_ENCHANTMENT
                && other != PBEnchantments.THE_SUN_ENCHANTMENT
                && other != PBEnchantments.STAR_PLATINUM_ENCHANTMENT
                && other != PBEnchantments.KILLER_QUEEN_ENCHANTMENT
                && other != PBEnchantments.DARK_BLUE_MOON_ENCHANTMENT
                && other != PBEnchantments.KING_CRIMSON_ENCHANTMENT
                && other != PBEnchantments.PURPLE_HAZE_ENCHANTMENT
                && other != PBEnchantments.THE_WORLD_ENCHANTMENT
                && other != PBEnchantments.TWENTY_CENTURY_BOY_ENCHANTMENT
                && other != PBEnchantments.WEATHER_REPORT_ENCHANTMENT
                && other != PBEnchantments.HIEROPHANT_GREEN_ENCHANTMENT
                && other != PBEnchantments.ANUBIS_ENCHANTMENT;

                 */
    }

    @Override
    public int getMinPower(int level) {
        return 20;
    }

    @Override
    public int getMaxPower(int level) {
        return 50;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return super.isAcceptableItem(stack);
    }
    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }


}