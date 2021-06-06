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
                StandUtils.setStand(user, Stand.STAR_PLATINUM);
            } else if(StandUtils.getStandLevel(user) == 0){
                StandUtils.setStandLevel(user, 1);
            } else {
                return TypedActionResult.fail(ItemStack.EMPTY);
            }
        }
        return TypedActionResult.consume(ItemStack.EMPTY);
    }


//To do: to succeed in using the arrow, the user wither have to be a vampire or use a totem of undying to prevent death.
}
