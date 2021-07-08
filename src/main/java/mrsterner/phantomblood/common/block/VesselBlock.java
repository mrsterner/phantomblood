package mrsterner.phantomblood.common.block;

import mrsterner.phantomblood.common.registry.PBObjects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class VesselBlock extends Block {

    public static IntProperty VESSELS;
    static {
        VESSELS = IntProperty.of("vessels", 0, 3);
    }

    protected static final VoxelShape ONE_VESSEL_SHAPE;
    protected static final VoxelShape TWO_VESSEL_SHAPE;
    protected static final VoxelShape THREE_VESSEL_SHAPE;
    public VesselBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(VESSELS, 1)));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos());
        if (blockState.isOf(this)) {
            return (BlockState)blockState.with(VESSELS, Math.min(5, (Integer)blockState.get(VESSELS) + 1));
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
        if(context.getStack().getItem() == (PBObjects.VESSEL.asItem())){
            return (Integer) state.get(VESSELS) < 3;
        }
        return super.canReplace(state, context);

    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch((Integer)state.get(VESSELS)) {
            case 1:
            default:
                return ONE_VESSEL_SHAPE;
            case 2:
                return TWO_VESSEL_SHAPE;
            case 3:
                return THREE_VESSEL_SHAPE;
        }
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(VESSELS);
    }
    static {
        ONE_VESSEL_SHAPE = Block.createCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 12.0D, 10.0D);
        TWO_VESSEL_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 3.0D, 12.0D, 12.0D, 13.0D);
        THREE_VESSEL_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 3.0D, 12.0D, 12.0D, 13.0D);
    }
}
