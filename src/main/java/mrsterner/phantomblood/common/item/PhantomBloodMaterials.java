package mrsterner.phantomblood.common.item;


import mrsterner.phantomblood.common.registry.PBObjects;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class PhantomBloodMaterials {
    public static final ArmorMaterial VAMPIRE_ARMOR = new ArmorMaterial() {
        @Override
        public int getDurability(EquipmentSlot slot) {
            return ArmorMaterials.CHAIN.getDurability(slot);
        }

        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
            return ArmorMaterials.CHAIN.getProtectionAmount(slot);
        }

        @Override
        public int getEnchantability() {
            return ArmorMaterials.GOLD.getEnchantability();
        }

        @Override
        public SoundEvent getEquipSound() {
            return ArmorMaterials.LEATHER.getEquipSound();
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(PBObjects.BLOOD_AMPOULE);
        }

        @Override
        public String getName() {
            return "vampire_armor";
        }

        @Override
        public float getToughness() {
            return ArmorMaterials.CHAIN.getToughness();
        }

        @Override
        public float getKnockbackResistance() {
            return ArmorMaterials.CHAIN.getKnockbackResistance();
        }
    };
}
