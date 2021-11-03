package mrsterner.phantomblood.common.entity;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.PhantomBloodClient;
import mrsterner.phantomblood.client.EntitySpawnPacket;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvironmentInterface;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.FlyingItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.Packet;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@EnvironmentInterface(value = EnvType.CLIENT, itf = FlyingItemEntity.class)
public class EmeraldSplashEntity extends PersistentProjectileEntity implements FlyingItemEntity {
    private static final TrackedData<Optional<UUID>> TARGET = DataTracker.registerData(EmeraldSplashEntity.class, TrackedDataHandlerRegistry.OPTIONAL_UUID);
    private @Nullable Entity target;

    public EmeraldSplashEntity(EntityType<? extends EmeraldSplashEntity> entityType, World world) {
        super(entityType, world);
        setNoGravity(true);
    }

    public EmeraldSplashEntity(LivingEntity owner, @Nullable Entity target, World world) {
        super(PhantomBlood.EMERALD_SPLASH_ENTITY_TYPE, owner, world);
        dataTracker.set(TARGET, Optional.ofNullable(target).map(Entity::getUuid));
        this.pickupType = PickupPermission.DISALLOWED;
        this.target = target;
        setNoGravity(true);
        setPos(getX()+world.random.nextGaussian(), getY()+world.random.nextDouble(), getZ()+world.random.nextGaussian());
        setSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP);
        if (target == null) {
            setVelocity(owner.getRotationVector().normalize());
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        if (entityHitResult.getEntity() == getOwner()) {
            return;
        }

        super.onEntityHit(entityHitResult);
    }

    @Override
    public void tick() {
        super.tick();
        if (target == null && getOwner() instanceof LivingEntity) {
            target = getTarget(world.random, findNearbyPotentialTargets(world, getOwner(), this), getTargetOf((LivingEntity) getOwner()));
        }

        if (target != null && target.isAlive()) {
            if (!inGround && age > 10) {
                Vec3d vel = getVelocity();
                Vec3d dir = new Vec3d(target.getX(), target.getRandomBodyY(), target.getZ()).subtract(getPos()).normalize().multiply(0.2+world.random.nextGaussian()*0.05);
                if (Math.acos(vel.dotProduct(dir)/(vel.length()*dir.length())) > 0.3) {
                    setVelocity(getVelocity().multiply(0.85));
                }
                setVelocity(getVelocity().add(dir));
            }
        }
        if (world.isClient) {
            world.addParticle(new DustParticleEffect(0.0f, 1.0f, 0.0f, 1.0f), getX(), getY(), getZ(), 0.0, 0.0, 0.0);
        } else if (inGround || (target != null && !target.isAlive())) {
            remove();
        }
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        dataTracker.startTracking(TARGET, Optional.empty());
    }

    @Override
    protected ItemStack asItemStack() {
        return ItemStack.EMPTY;
    }

    @Override
    public Packet<?> createSpawnPacket() {
        return EntitySpawnPacket.create(this, PhantomBloodClient.PacketID);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public ItemStack getStack() {
        return Items.EMERALD.getDefaultStack();
    }

    @Override
    protected SoundEvent getHitSound() {
        return SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP;
    }

    public static @Nullable Entity getTarget(Random random, List<Entity> nearbyPotentialTargets, @Nullable Entity playerTarget) {
        Entity target = null;

        if (random.nextDouble() > 0.5 || nearbyPotentialTargets.isEmpty()) {
            target = playerTarget;
        }

        if (target == null && !nearbyPotentialTargets.isEmpty()) {
            target = nearbyPotentialTargets.get(random.nextInt(nearbyPotentialTargets.size()));
        }

        return target;
    }

    public static @Nullable Entity getTargetOf(LivingEntity entity) {
        final Entity target = entity.getAttacking();
        if (target == null) {
            return entity.getAttacker();
        }

        return target;
    }

    public static List<Entity> findNearbyPotentialTargets(World world, Entity owner, Entity lookFrom) {
        return world.getOtherEntities(owner, lookFrom.getBoundingBox().expand(20.0), entity -> isValidTarget(entity, owner));
    }

    private static boolean isValidTarget(Entity entity, Entity owner) {
        if (!entity.isAlive()) {
            return false;
        }

        if (entity instanceof Monster) {
            return true;
        }

        if ((entity instanceof Angerable && ((Angerable) entity).hasAngerTime()) || entity instanceof PlayerEntity) {
            return !entity.isTeammate(owner) && entity != owner;
        }

        return false;
    }
}
