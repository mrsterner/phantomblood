package mrsterner.phantomblood.common.entity;

import mrsterner.phantomblood.PhantomBloodClient;
import mrsterner.phantomblood.client.EntitySpawnPacket;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.network.Packet;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class KillerVirusCloudEntity extends AreaEffectCloudEntity {
    public int count = 0;

    public KillerVirusCloudEntity(EntityType<? extends AreaEffectCloudEntity> entityType, World world) {
        super(entityType, world);
    }

    public KillerVirusCloudEntity(World world, double x, double y, double z) {
        super(world, x, y, z);
    }


    @Environment(EnvType.CLIENT)
    public void handleStatus(byte status) {
        if (status == 3) {

            for(int i = 0; i < 8; ++i) {
                double randX = MathHelper.nextDouble(random, -1, 1);
                double randY = MathHelper.nextDouble(random, -1, 1);
                double randZ = MathHelper.nextDouble(random, -1, 1);
                this.world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, this.getX(), this.getY(), this.getZ(), 0.0D + randX, 0.0D + randY, 0.0D + randZ);
            }
        }

    }

    @Override
    public Packet createSpawnPacket() {
        return EntitySpawnPacket.create(this, PhantomBloodClient.PacketID);
    }
}