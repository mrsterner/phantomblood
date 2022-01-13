package mrsterner.phantomblood.common.worldgen.generator;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import mrsterner.phantomblood.PhantomBlood;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.util.Identifier;

public class RuinGenerator {
    public static final StructurePool STARTING_POOL;
    private static final Identifier RUIN = new Identifier(PhantomBlood.MODID, "arrow_head/arrow");

    static {
        STARTING_POOL = StructurePools.register(
                new StructurePool(RUIN, new Identifier("empty"), ImmutableList.of(
                new Pair<>(StructurePoolElement.ofLegacySingle(PhantomBlood.MODID + ":arrow_head/arrow"), 1)), StructurePool.Projection.RIGID));
    }

}

