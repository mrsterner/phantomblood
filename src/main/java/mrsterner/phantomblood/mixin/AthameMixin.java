package mrsterner.phantomblood.mixin;


import moriyashiine.bewitchment.common.item.AthameItem;
import moriyashiine.bewitchment.common.registry.BWSoundEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import org.spongepowered.asm.mixin.Mixin;
import mrsterner.phantomblood.common.registry.PhantomBloodObjects;

@Mixin(AthameItem.class)
public abstract class AthameMixin extends SwordItem {
    public AthameMixin(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        PlayerEntity player = (PlayerEntity) attacker;
        boolean client = player.world.isClient;
        ItemStack stonemask = attacker.getEquippedStack(EquipmentSlot.HEAD);
        if (target instanceof VillagerEntity) {
            if (!client && stonemask.getItem() == PhantomBloodObjects.STONE_MASK_ITEM) {
                stonemask.setCount(0);
                attacker.equipStack(EquipmentSlot.HEAD, new ItemStack(PhantomBloodObjects.BLOODY_STONE_MASK_ITEM));
                player.world.playSoundFromEntity(null, target, BWSoundEvents.ENTITY_GENERIC_CURSE, SoundCategory.PLAYERS, 1, 1);
            }
        }
        return super.postHit(stack, target, attacker);
    }
}
