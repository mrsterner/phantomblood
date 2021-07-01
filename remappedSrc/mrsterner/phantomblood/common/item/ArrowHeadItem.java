package mrsterner.phantomblood.common.item;

import mrsterner.phantomblood.common.registry.PBSoundEvents;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ArrowHeadItem extends Item {
    public ArrowHeadItem(Settings settings) {
        super(settings);
    }



    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            if (StandUtils.getStand(user) == Stand.NONE) {
                int t = MathHelper.nextInt(world.random, 1, 7);
                switch (t){
                    case 1:
                        StandUtils.setStand(user, Stand.STAR_PLATINUM);
                        StandUtils.setStandLevel(user, 0);
                        break;
                    case 2:
                        StandUtils.setStand(user, Stand.THE_WORLD);
                        StandUtils.setStandLevel(user, 0);
                        break;
                    case 3:
                        StandUtils.setStand(user, Stand.KILLER_QUEEN);
                        StandUtils.setStandLevel(user, 0);
                        break;
                    case 4:
                        StandUtils.setStand(user, Stand.CRAZY_DIAMOND);
                        StandUtils.setStandLevel(user, 0);
                        break;
                    case 5:
                        StandUtils.setStand(user, Stand.WEATHER_REPORT);
                        StandUtils.setStandLevel(user, 0);
                        break;
                    case 6:
                        StandUtils.setStand(user, Stand.DARK_BLUE_MOON);
                        StandUtils.setStandLevel(user, 0);
                        break;
                    case 7:
                        StandUtils.setStand(user, Stand.THE_SUN);
                        StandUtils.setStandLevel(user, 0);
                        break;
                    default:
                        break;
                }
            } else if(StandUtils.getStandLevel(user) == 0){
                StandUtils.setStandLevel(user, 1);
            }
        }
        int t2 = MathHelper.nextInt(world.random, 1, 10);
        if(t2 == 1){
            user.damage(DamageSource.GENERIC,user.getMaxHealth() + 4);
            return super.use(world, user, hand);
        }else{
            world.playSound(null,user.getBlockPos(), SoundEvents.ITEM_SHIELD_BREAK, SoundCategory.PLAYERS,1F,1);
            user.damage(DamageSource.GENERIC,user.getMaxHealth() + 4); //Kills you even if you have 2 absorption hearts
            return TypedActionResult.consume(ItemStack.EMPTY);
        }
    }
}
