package mrsterner.phantomblood.common.registry;

import mrsterner.phantomblood.PhantomBlood;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PBParticles {
    public static final DefaultParticleType WIND = FabricParticleTypes.simple(true);

    public static <T> T register(Registry<? super T> registry, String name, T entry) {
        return Registry.register(registry, new Identifier(PhantomBlood.MODID, name), entry);
    }

    public static void init() {
        register(Registry.PARTICLE_TYPE, "wind", WIND);
    }
}
