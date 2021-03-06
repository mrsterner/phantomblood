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
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3f;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@EnvironmentInterface(value = EnvType.CLIENT, itf = FlyingItemEntity.class)
public class EmeraldSplashEntity extends PersistentProjectileEntity implements FlyingItemEntity {
    private static final TrackedData<Integer> TARGET = DataTracker.registerData(EmeraldSplashEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public EmeraldSplashEntity(EntityType<? extends EmeraldSplashEntity> entityType, World world) {
        super(entityType, world);
        setNoGravity(true);
    }

    public EmeraldSplashEntity(LivingEntity owner, @Nullable Entity target, World world) {
        super(PhantomBlood.EMERALD_SPLASH_ENTITY_TYPE, owner, world);
        this.pickupType = PickupPermission.DISALLOWED;
        this.setTarget(target);
        this.setNoGravity(true);
        this.setPos(getX()+world.random.nextGaussian(), getY()+world.random.nextDouble(), getZ()+world.random.nextGaussian());
        this.setSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP);
        if (target == null) {
            this.setVelocity(owner.getRotationVector().normalize());
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
        if (getTarget() == null && getOwner() instanceof LivingEntity) {
            setTarget(getTarget(world.random, findNearbyPotentialTargets(world, getOwner(), this), getTargetOf((LivingEntity) getOwner())));
        }

        if (getTarget() != null && getTarget().isAlive()) {
            if (!inGround && age > 10) {
                Vec3d vel = getVelocity();
                Vec3d dir = new Vec3d(getTarget().getX(), getTarget().getRandomBodyY(), getTarget().getZ()).subtract(getPos()).normalize().multiply(0.2+world.random.nextGaussian()*0.05);
                if (Math.acos(vel.dotProduct(dir)/(vel.length()*dir.length())) > 0.3) {
                    setVelocity(getVelocity().multiply(0.85));
                }
                setVelocity(getVelocity().add(dir));
            }
        }
        if (world.isClient) {
            world.addParticle(new DustParticleEffect(new Vec3f(0.0f, 1.0f, 0.0f), 1.0f), getX(), getY(), getZ(), 0.0, 0.0, 0.0);
        } else if (inGround || (getTarget() != null && !getTarget().isAlive()) || (getTarget() == null && getVelocity().lengthSquared() <= 0.04)) {
            remove(RemovalReason.DISCARDED);
        }
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        final @Nullable Entity tgt = getTarget();
        if (tgt != null) {
            nbt.putUuid("TargetUuid", tgt.getUuid());
        }
        return nbt;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains("TargetUuid", 11)) {
            if (world instanceof ServerWorld) {
                setTarget(((ServerWorld)world).getEntity(nbt.getUuid("TargetUuid")));
            }
        }
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        dataTracker.startTracking(TARGET, -1);
    }

    @Override
    protected ItemStack asItemStack() {
        return ItemStack.EMPTY;
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

    public @Nullable Entity getTarget() {
        return this.world.getEntityById(dataTracker.get(TARGET));
    }

    public void setTargetById(@Nullable Integer id) {
        if (id == null) {
            setTarget(null);
        } else {
            setTarget(this.world.getEntityById(id));
        }
    }

    public void setTarget(@Nullable Entity entity) {
        dataTracker.set(TARGET, Optional.ofNullable(entity).map(Entity::getId).orElse(-1));
    }

    /**
     * Gets a target for an emerald splash projectile entity.
     *
     * <p>There is a 50-50 chance that this method will go for the player target, or for a random nearby target. If there
     * are no nearby targets, it will always pick the player target. If there is no player target either, it returns null.</p>
     *
     * @param random a random instance
     * @param nearbyPotentialTargets a list of nearby potential target entities
     * @param playerTarget the player's target, or null
     *
     * @return a target, or null if there are no options
     */
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

    /**
     * Gets the target entity of an entity.
     *
     * @param entity the entity whose target we want
     *
     * @return the entity's current combat target, or null
     */
    public static @Nullable Entity getTargetOf(LivingEntity entity) {
        final Entity target = entity.getAttacking();
        if (target == null) {
            return entity.getAttacker();
        }

        return target;
    }


    /**
     * Gets a list of potential targets (as specified by {@link EmeraldSplashEntity#isValidTarget(Entity, Entity)})
     * within 20 blocks of an entity.
     *
     * @param world the world
     * @param owner the owner of the projectile
     * @param lookFrom the entity at the centre of the search radius
     *
     * @return a list of potential target entities
     */
    public static List<Entity> findNearbyPotentialTargets(World world, Entity owner, Entity lookFrom) {
        return world.getOtherEntities(owner, lookFrom.getBoundingBox().expand(20.0), entity -> isValidTarget(entity, owner));
    }

    /**
     * Whether an entity is a valid target. Valid targets are:
     *
     * <ul>
     *  <li>alive</li>
     *  <li>not our owner</li>
     *  <li>not on the same team as our owner</li>
     *  <li>monsters, players, or angered neutral mobs</li>
     * </ul>
     *
     * @param entity the entity to check
     * @param owner the projectile's owner
     *
     * @return true if the entity is a valid target, false otherwise
     */
    private static boolean isValidTarget(Entity entity, Entity owner) {
        if (!entity.isAlive()) {
            return false;
        }

        if (entity == owner || entity.isTeammate(owner)) {
            return false;
        }

        return entity instanceof Monster
                || (entity instanceof Angerable && ((Angerable) entity).hasAngerTime())
                || entity instanceof PlayerEntity;
    }
}
