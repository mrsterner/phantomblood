package mrsterner.phantomblood.common.item;

import mrsterner.phantomblood.stand.Stand;
import mrsterner.phantomblood.stand.StandUtils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ArrowHeadItem extends Item {
    public ArrowHeadItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            if (StandUtils.getStand(user) == Stand.NONE) {
                StandUtils.setStand(user, Stand.THE_WORLD);
            } else {
                StandUtils.setStandLevel(user, 1);
            }
        }
        return TypedActionResult.success(ItemStack.EMPTY);
    }
}
