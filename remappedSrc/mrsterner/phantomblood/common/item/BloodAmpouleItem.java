package mrsterner.phantomblood.common.item;

import com.williambl.haema.VampireBloodManager;
import mrsterner.phantomblood.common.registry.PBObjects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class BloodAmpouleItem extends Item {
    public BloodAmpouleItem(Settings settings) {
        super(settings);
    }
    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity playerEntity = user instanceof PlayerEntity ? (PlayerEntity) user : null;
        if (playerEntity != null) {
            playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!playerEntity.abilities.creativeMode) {
                HungerManager var4 = playerEntity.getHungerManager();
                ((VampireBloodManager) var4).addBlood(1.0D);
                stack.decrement(1);
            }
        }

        if (playerEntity == null || !playerEntity.abilities.creativeMode) {
            if (stack.isEmpty()) {
                return new ItemStack(PBObjects.AMPOULE);
            }

            if (playerEntity != null) {
                playerEntity.inventory.insertStack(new ItemStack(PBObjects.AMPOULE));
            }
        }

        return stack;
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }
}
