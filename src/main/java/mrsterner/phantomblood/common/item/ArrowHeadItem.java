package mrsterner.phantomblood.common.item;

import com.chocohead.mm.api.ClassTinkerers;
import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.registry.PBSoundEvents;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class ArrowHeadItem extends Item {
    public ArrowHeadItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    @Override
    public int getEnchantability() {
        return 1;
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            if (StandUtils.getStand(user) == Stand.NONE && !user.getStackInHand(hand).hasEnchantments()) {
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
            } else if(StandUtils.getStandLevel(user) == 0 && !user.getStackInHand(hand).hasEnchantments()){
                StandUtils.setStandLevel(user, 1);
            } else {

            String enchant = user.getStackInHand(hand).getEnchantments().getString(0);
            switch (enchant) {
                case "{lvl:1s,id:\"phantomblood:star_platinum_enchantment\"}":
                    StandUtils.setStandLevel(user, StandUtils.getStand(user) == Stand.STAR_PLATINUM ? 1 : 0);
                    StandUtils.setStand(user, Stand.STAR_PLATINUM);
                    break;
                case "{lvl:1s,id:\"phantomblood:the_world_enchantment\"}":
                    StandUtils.setStandLevel(user, StandUtils.getStand(user) == Stand.THE_WORLD ? 1 : 0);
                    StandUtils.setStand(user, Stand.THE_WORLD);
                    break;
                case "{lvl:1s,id:\"phantomblood:the_sun_enchantment\"}":
                    StandUtils.setStandLevel(user, StandUtils.getStand(user) == Stand.THE_SUN ? 1 : 0);
                    StandUtils.setStand(user, Stand.THE_SUN);
                    break;
                case "{lvl:1s,id:\"phantomblood:dark_blue_moon_enchantment\"}":
                    StandUtils.setStandLevel(user, StandUtils.getStand(user) == Stand.DARK_BLUE_MOON ? 1 : 0);
                    StandUtils.setStand(user, Stand.DARK_BLUE_MOON);
                    break;
                case "{lvl:1s,id:\"phantomblood:killer_queen_enchantment\"}":
                    StandUtils.setStandLevel(user, StandUtils.getStand(user) == Stand.KILLER_QUEEN ? 1 : 0);
                    StandUtils.setStand(user, Stand.KILLER_QUEEN);
                    break;
                case "{lvl:1s,id:\"phantomblood:weather_report_enchantment\"}":
                    StandUtils.setStandLevel(user, StandUtils.getStand(user) == Stand.WEATHER_REPORT ? 1 : 0);
                    StandUtils.setStand(user, Stand.WEATHER_REPORT);
                    break;
                case "{lvl:1s,id:\"phantomblood:crazy_diamond_enchantment\"}":
                    StandUtils.setStandLevel(user, StandUtils.getStand(user) == Stand.CRAZY_DIAMOND ? 1 : 0);
                    StandUtils.setStand(user, Stand.CRAZY_DIAMOND);
                    break;
                default:
                    break;
                }
            }
        }
            world.playSound(null,user.getBlockPos(), SoundEvents.ITEM_SHIELD_BREAK, SoundCategory.PLAYERS,1F,1);
            user.damage(DamageSource.GENERIC,user.getMaxHealth() + 4); //Kills you even if you have 2 absorption hearts
            return TypedActionResult.consume(ItemStack.EMPTY);

    }
}
