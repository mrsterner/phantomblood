package mrsterner.phantomblood.common.item;

import mrsterner.phantomblood.common.entity.KillerVirusEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class KillerVirusItem extends Item {
    public KillerVirusItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 1F); // plays a globalSoundEvent
        // user.getItemCooldownManager().set(this, 5);
        if (!world.isClient) {
            KillerVirusEntity killerVirusEntity = new KillerVirusEntity(world, user);
            killerVirusEntity.setItem(itemStack);
            killerVirusEntity.setProperties(user, user.pitch, user.yaw, 0.0F, 0.5F, 0F); //modifierZ is the power thrown, 1.5F is standard
            world.spawnEntity(killerVirusEntity); // spawns entity
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.abilities.creativeMode) {
            itemStack.decrement(1); // decrements itemStack if user is not in creative mode
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}
