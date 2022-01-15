package mrsterner.phantomblood.common.block;

import mrsterner.phantomblood.common.registry.PBObjects;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class SpaceTimeBlockEntity extends BlockEntity {
    protected SpaceTimeBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public SpaceTimeBlockEntity(BlockPos pos, BlockState state) {
        this(PBObjects.SPACE_TIME_BLOCK_ENTITY, pos, state);
    }
}