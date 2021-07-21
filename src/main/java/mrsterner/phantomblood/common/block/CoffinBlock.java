package mrsterner.phantomblood.common.block;


import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class CoffinBlock extends BedBlock {
    private static final VoxelShape SHAPE = createCuboidShape(0, 0, 0, 16, 10, 16);

    public CoffinBlock(DyeColor color, Settings settings) {
        super(color, settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }


    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public void onEntityLand(BlockView world, Entity entity) {
        Blocks.BLACKSTONE.onEntityLand(world, entity);
    }
}