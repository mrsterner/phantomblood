package mrsterner.phantomblood.common.worldgen.generator;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import mrsterner.phantomblood.PhantomBlood;
import net.minecraft.structure.PoolStructurePiece;
import net.minecraft.structure.StructureManager;
import net.minecraft.structure.StructurePiece;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolBasedGenerator;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.world.gen.ChunkRandom;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

import java.util.List;

public class RuinGenerator {
    public static final StructurePool STARTING_POOL;
    private static final Identifier RUIN = new Identifier(PhantomBlood.MODID, "arrow_head/arrow");

    static {
        STARTING_POOL = StructurePools.register(
                new StructurePool(RUIN, new Identifier("empty"), ImmutableList.of(
                new Pair<>(StructurePoolElement.ofLegacySingle(PhantomBlood.MODID + ":arrow_head/arrow"), 1)), StructurePool.Projection.RIGID));
    }

}

