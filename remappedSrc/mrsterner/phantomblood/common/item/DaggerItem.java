package mrsterner.phantomblood.common.item;

import mrsterner.phantomblood.common.registry.PBObjects;
import mrsterner.phantomblood.common.registry.PBSoundEvents;
import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;

import static net.minecraft.item.ArmorItem.DISPENSER_BEHAVIOR;

public class DaggerItem extends SwordItem {
    public DaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        DispenserBlock.registerBehavior(this, DISPENSER_BEHAVIOR);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        PlayerEntity player = (PlayerEntity) attacker;
        boolean client = player.world.isClient;
        ItemStack stonemask = attacker.getEquippedStack(EquipmentSlot.HEAD);
        if (target instanceof VillagerEntity) {
            if (!client && stonemask.getItem() == PBObjects.STONE_MASK_ITEM) {
                stonemask.setCount(0);
                attacker.equipStack(EquipmentSlot.HEAD, new ItemStack(PBObjects.BLOODY_STONE_MASK_ITEM));
                player.world.playSoundFromEntity(null, target, PBSoundEvents.VAMPIRE, SoundCategory.PLAYERS, 1, 1);
            }
        }
        return super.postHit(stack, target, attacker);
    }
}
