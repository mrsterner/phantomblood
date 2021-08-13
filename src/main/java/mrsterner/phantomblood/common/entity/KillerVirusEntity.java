package mrsterner.phantomblood.common.entity;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.PhantomBloodClient;
import mrsterner.phantomblood.client.EntitySpawnPacket;
import mrsterner.phantomblood.common.registry.PBObjects;
import mrsterner.phantomblood.common.registry.PBStatusEffects;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class KillerVirusEntity extends ThrownItemEntity {
    public int count = 0;
    public KillerVirusEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public KillerVirusEntity(World world, LivingEntity owner) {
        super(PhantomBlood.KillerVirusEntityType, owner, world);
    }

    public KillerVirusEntity(World world, double x, double y, double z) {
        super(PhantomBlood.KillerVirusEntityType, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return PBObjects.KILLER_VIRUS;
    }

    @Environment(EnvType.CLIENT)
    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return (ParticleEffect)(itemStack.isEmpty() ? ParticleTypes.DRAGON_BREATH : new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack));
    }

    @Environment(EnvType.CLIENT)
    public void handleStatus(byte status) {
        if (status == 3) {
            ParticleEffect particleEffect = this.getParticleParameters();

            for(int i = 0; i < 8; ++i) {
                this.world.addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        PlayerEntity playerEntity = (PlayerEntity) getOwner();
        if(playerEntity != null && StandUtils.getStand(playerEntity) == Stand.PURPLE_HAZE){
            int level = StandUtils.getStandLevel(playerEntity);
            AreaEffectCloudEntity areaEffectCloudEntity = new AreaEffectCloudEntity(this.world, this.getX(), this.getY(), this.getZ());
            areaEffectCloudEntity.setWaitTime(40);
            areaEffectCloudEntity.setRadius(3.5F);
            areaEffectCloudEntity.setRadiusOnUse(-0.5F);
            areaEffectCloudEntity.setParticleType(ParticleTypes.DRAGON_BREATH);
            areaEffectCloudEntity.setDuration(level == 0 ? 600 : 1200);
            //areaEffectCloudEntity.setDuration(areaEffectCloudEntity.getDuration() / 2);
            areaEffectCloudEntity.setRadiusGrowth(-areaEffectCloudEntity.getRadius() / (float)areaEffectCloudEntity.getDuration());
            StatusEffectInstance statusEffectInstance = new StatusEffectInstance(PBStatusEffects.KILLER_INFECTION, 80);
            areaEffectCloudEntity.addEffect(new StatusEffectInstance(statusEffectInstance));
            this.world.spawnEntity(areaEffectCloudEntity);
        }

        /*

        KillerVirusCloudEntityTest test = new KillerVirusCloudEntityTest(this.world, this.getX(), this.getY(), this.getZ());
        this.setNoGravity(true);
        this.world.spawnEntity(test);

         */

/*
        Vec3d vec3d = blockHitResult.getPos();
        KillerVirusCloudEntity killerVirusCloudEntity = new KillerVirusCloudEntity(world, this.getX(), this.getY(), this.getZ());
        killerVirusCloudEntity.setNoGravity(true);
        world.spawnEntity(killerVirusCloudEntity);
        System.out.println(vec3d);

 */
    }

    protected void onEntityHit(EntityHitResult entityHitResult) { // called on entity hit.
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity(); // sets a new Entity instance as the EntityHitResult (victim)
        int i = entity instanceof PlayerEntity ? 1 : 4; // sets i to 3 if the Entity instance is an instance of BlazeEntity
        entity.damage(DamageSource.thrownProjectile(this, this.getOwner()), (float)i); // deals damage

        if (entity instanceof LivingEntity) { // checks if entity is an instance of LivingEntity (meaning it is not a boat or minecart)
            ((LivingEntity) entity).addStatusEffect((new StatusEffectInstance(PBStatusEffects.KILLER_INFECTION, 20 * 3, 0))); // applies a status effect
            entity.playSound(SoundEvents.AMBIENT_CAVE, 2F, 1F); // plays a sound for the entity hit only
        }
    }

    protected void onCollision(HitResult hitResult) { // called on collision with a block
        super.onCollision(hitResult);

        if (!this.world.isClient) { // checks if the world is client
            this.world.sendEntityStatus(this, (byte)3); // particle?
            this.kill(); // kills the projectile
        }

    }
    @Override
    public Packet createSpawnPacket() {
        return EntitySpawnPacket.create(this, PhantomBloodClient.PacketID);
    }
}
