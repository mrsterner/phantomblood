package mrsterner.phantomblood.common.registry;

import mrsterner.phantomblood.common.worldgen.RegistrationHelper;
import mrsterner.phantomblood.common.worldgen.generator.RuinGenerator;
import mrsterner.phantomblood.common.worldgen.structure.RuinStructure;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;


public class PBStructures {
    static StructureFeature<StructurePoolFeatureConfig> RUIN = new RuinStructure();
    public static final ConfiguredStructureFeature<StructurePoolFeatureConfig, ?> RUIN_REG = PBStructures.RUIN.configure(new StructurePoolFeatureConfig(RegistrationHelper.pool(RuinGenerator.STARTING_POOL), 2));


    public static void init(){
        RegistrationHelper.addToBiome(RuinStructure.ID,
                BiomeSelectors.categories(Biome.Category.DESERT).and(RegistrationHelper.booleanToPredicate(true)).and(BiomeSelectors.foundInOverworld()),
                (context) -> RegistrationHelper.addStructure(context, RUIN_REG));
        FabricStructureBuilder.create(RuinStructure.ID, RUIN).step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(50, 25, 165757306).superflatFeature(RUIN_REG).adjustsSurface().register();


        Registry.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, RuinStructure.ID, RUIN_REG);
    }
}
