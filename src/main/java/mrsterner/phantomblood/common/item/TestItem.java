package mrsterner.phantomblood.common.item;

import com.williambl.haema.Vampirable;
import com.williambl.haema.VampireBloodManager;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class TestItem extends Item {
    public TestItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (((Vampirable) user).isVampire()) {
            HungerManager var4 = user.getHungerManager();
            ((VampireBloodManager) var4).addBlood(6.0D);
        }
        return super.use(world, user, hand);
    }
}
