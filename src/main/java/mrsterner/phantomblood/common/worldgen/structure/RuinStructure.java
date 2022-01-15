package mrsterner.phantomblood.common.worldgen.structure;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.worldgen.RegistrationHelper;
import mrsterner.phantomblood.common.worldgen.generator.RuinGenerator;
import net.minecraft.structure.PoolStructurePiece;
import net.minecraft.structure.StructureGeneratorFactory;
import net.minecraft.structure.StructurePiecesGenerator;
import net.minecraft.structure.pool.StructurePoolBasedGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

import java.util.Optional;
import java.util.Random;

public class RuinStructure extends StructureFeature<StructurePoolFeatureConfig> {
    public static final Identifier ID = new Identifier(PhantomBlood.MODID,"arrow");

    public RuinStructure() {
        super(StructurePoolFeatureConfig.CODEC, RuinStructure::init);
    }

    public static Optional<StructurePiecesGenerator<StructurePoolFeatureConfig>> init(StructureGeneratorFactory.Context<StructurePoolFeatureConfig> context) {
        int yToAdd = Math.max(new Random(context.seed() & context.chunkPos().toLong()).nextInt(100), 45);

        final var config = new StructurePoolFeatureConfig(RegistrationHelper.pool(RuinGenerator.STARTING_POOL), 2);

        final var newContext = new StructureGeneratorFactory.Context<>(
                context.chunkGenerator(),
                context.biomeSource(),
                context.seed(),
                context.chunkPos(),
                config,
                context.world(),
                context.validBiome(),
                context.structureManager(),
                context.registryManager()
        );

        return StructurePoolBasedGenerator.generate(newContext, PoolStructurePiece::new, newContext.chunkPos().getCenterAtY(yToAdd), false, true);
    }
}