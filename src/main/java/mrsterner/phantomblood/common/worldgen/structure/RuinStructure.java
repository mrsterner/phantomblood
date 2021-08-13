package mrsterner.phantomblood.common.worldgen.structure;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.worldgen.generator.RuinGenerator;
import net.minecraft.structure.MarginedStructureStart;
import net.minecraft.structure.PoolStructurePiece;
import net.minecraft.structure.StructureManager;
import net.minecraft.structure.pool.StructurePoolBasedGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.world.HeightLimitView;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

public class RuinStructure extends StructureFeature<StructurePoolFeatureConfig> {
    public static final Identifier ID = new Identifier(PhantomBlood.MODID,"arrow");

    public RuinStructure() {
        super(StructurePoolFeatureConfig.CODEC);
    }

    @Override
    public StructureStartFactory<StructurePoolFeatureConfig> getStructureStartFactory() {
        return RuinStructure.Start::new;
    }

    public static class Start extends MarginedStructureStart<StructurePoolFeatureConfig> {
        public Start(StructureFeature<StructurePoolFeatureConfig> structureFeature, ChunkPos chunkPos, int i, long l) {
            super(structureFeature, chunkPos, i, l);
        }

        @Override
        public void init(DynamicRegistryManager registryManager, ChunkGenerator chunkGenerator, StructureManager manager, ChunkPos pos, Biome biome, StructurePoolFeatureConfig config, HeightLimitView world) {
            int yToAdd = Math.max(random.nextInt(100), 45);
            StructurePoolBasedGenerator.generate(registryManager, config, PoolStructurePiece::new, chunkGenerator, manager, new BlockPos(pos.x << 4, yToAdd, pos.z << 4), this, this.random, true, true, world);

            this.setBoundingBoxFromChildren();
        }
    }
}