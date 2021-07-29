package mrsterner.phantomblood.client.patricle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteBillboardParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.world.World;

@Environment(EnvType.CLIENT)
class WindTornadoParticle extends SpriteBillboardParticle {

    public WindTornadoParticle(ParticleEffect effect, ClientWorld world, double x, double y, double z, double velX, double velY, double velZ) {
        super(world, x, y, z, velX, velY, velZ);
    }

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }
}