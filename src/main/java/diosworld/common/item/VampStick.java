package diosworld.common.item;

import moriyashiine.bewitchment.api.interfaces.entity.TransformationAccessor;
import moriyashiine.bewitchment.common.registry.BWTransformations;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class VampStick extends Item {
    public VampStick(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        ((TransformationAccessor) this).getTransformation().onRemoved((PlayerEntity) (Object) this);
        ((TransformationAccessor) this).setTransformation(BWTransformations.VAMPIRE);
        ((TransformationAccessor) this).getTransformation().onAdded((PlayerEntity) (Object) this);

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

}
