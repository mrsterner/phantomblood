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
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.Packet;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.UUID;

@EnvironmentInterface(value = EnvType.CLIENT, itf = FlyingItemEntity.class)
public class EmeraldSplashEntity extends PersistentProjectileEntity implements FlyingItemEntity {
    private static final TrackedData<Optional<UUID>> TARGET = DataTracker.registerData(EmeraldSplashEntity.class, TrackedDataHandlerRegistry.OPTIONAL_UUID);

    public EmeraldSplashEntity(EntityType<? extends EmeraldSplashEntity> entityType, World world) {
        super(entityType, world);
    }

    public EmeraldSplashEntity(LivingEntity owner, Entity target, World world) {
        super(PhantomBlood.EMERALD_SPLASH_ENTITY_TYPE, owner, world);
        dataTracker.set(TARGET, Optional.of(target.getUuid()));
        this.pickupType = PickupPermission.DISALLOWED;
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
}
