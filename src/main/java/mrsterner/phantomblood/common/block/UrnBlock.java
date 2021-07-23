package mrsterner.phantomblood.common.block;

import mrsterner.phantomblood.common.registry.PBObjects;
import net.minecraft.block.*;
import net.minecraft.client.render.entity.model.IronGolemEntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.CallbackI;

import java.util.Objects;

public class UrnBlock extends Block {

    public static IntProperty URNS;
    static {
        URNS = IntProperty.of("urns", 0, 5);
    }

    protected static final VoxelShape ONE_URN_SHAPE;
    protected static final VoxelShape TWO_URN_SHAPE;
    protected static final VoxelShape THREE_URNS_SHAPE;
    protected static final VoxelShape FOUR_URN_SHAPE;
    protected static final VoxelShape FIVE_URN_SHAPE;
    public UrnBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(URNS, 1)));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos());
        if (blockState.isOf(this)) {
            return (BlockState)blockState.with(URNS, Math.min(5, (Integer)blockState.get(URNS) + 1));
        }
        return (BlockState)super.getPlacementState(ctx);
    }



    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return !floor.getCollisionShape(world, pos).getFace(Direction.UP).isEmpty() || floor.isSideSolidFullSquare(world, pos, Direction.UP);
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        return this.canPlantOnTop(world.getBlockState(blockPos), world, blockPos);
    }
    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        if(context.getStack().getItem() == (PBObjects.URNS.asItem())){
            return (Integer) state.get(URNS) < 5;
        }
        return super.canReplace(state, context);

    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch((Integer)state.get(URNS)) {
            case 1:
            default:
                return ONE_URN_SHAPE;
            case 2:
                return TWO_URN_SHAPE;
            case 3:
                return THREE_URNS_SHAPE;
            case 4:
                return FOUR_URN_SHAPE;
            case 5:
                return FIVE_URN_SHAPE;
        }
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(URNS);
    }
    static {
        ONE_URN_SHAPE = Block.createCuboidShape(6.0D, 0.0D, 6.0D, 9.0D, 6.0D, 9.0D);
        TWO_URN_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 6.0D, 11.0D);
        THREE_URNS_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 5.0D, 12.0D, 6.0D, 13.0D);
        FOUR_URN_SHAPE = Block.createCuboidShape(3.0D, 0.0D, 4.0D, 13.0D, 6.0D, 13.0D);
        FIVE_URN_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);
    }
}
