package phantomblood.common.item;

import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import phantomblood.common.registry.PhantomBloodObjects;
import moriyashiine.bewitchment.common.misc.BWUtil;
import moriyashiine.bewitchment.common.registry.BWSoundEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

import java.util.UUID;

public class DaggerItem extends SwordItem {
    private static final EntityAttributeModifier REACH_MODIFIER = new EntityAttributeModifier(UUID.fromString("1f362972-c5c5-4e9d-b69f-1fd13bd269e3"), "Weapon modifier", -1, EntityAttributeModifier.Operation.ADDITION);

    public DaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        boolean client = user.world.isClient;
        ItemStack itemStack = user.getStackInHand(hand);
        ItemStack stonemask = user.getEquippedStack(EquipmentSlot.HEAD);
        if (!client) {
            if (entity instanceof MobEntity) {
                ((MobEntity) entity).setPersistent();
            }
            BWUtil.addItemToInventoryAndConsume(user, hand, new ItemStack(PhantomBloodObjects.AJA));
            stonemask.setCount(0);
            user.equipStack(EquipmentSlot.HEAD, new ItemStack(PhantomBloodObjects.BLOODY_STONE_MASK_ITEM));
        }
        else {
            user.world.playSoundFromEntity(user, entity, BWSoundEvents.ENTITY_GENERIC_CURSE, SoundCategory.PLAYERS, 1, 1);
        }
        return ActionResult.success(client);
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

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.setHealth(user.getMaxHealth() - 4);
        return super.use(world, user, hand);
    }
}
