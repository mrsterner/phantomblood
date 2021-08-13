package mrsterner.phantomblood.common.hamon;

import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;
import dev.onyxstudios.cca.api.v3.entity.PlayerComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;

public final class HamonUserComponentImpl implements HamonUserComponent, AutoSyncedComponent, PlayerComponent<HamonUserComponentImpl> {
    private PlayerEntity user;
    private Hamon hamon = Hamon.NONE;
    private boolean hamonActive = false;
    private HamonMode hamonMode = HamonMode.IDLE;
    private int hamonEnergy = 100000;
    private int hamonLevel = 0;

    public HamonUserComponentImpl(PlayerEntity user) {
        this.user = user;
    }

    @Override
    public Hamon getHamon() {
        return hamon;
    }

    @Override
    public boolean getHamonActive() {
        return hamonActive;
    }

    @Override
    public HamonMode getHamonMode() {
        return hamonMode;
    }

    @Override
    public int getHamonEnergy() {
        return hamonEnergy;
    }

    @Override
    public int getHamonLevel() {
        return hamonLevel;
    }

    @Override
    public void setHamon(Hamon hamon) {
        this.hamon = hamon;
        HamonUserComponent.entityKey.sync(user);
    }

    @Override
    public void setHamonActive(boolean hamonActive) {
        this.hamonActive = hamonActive;
        HamonUserComponent.entityKey.sync(user);
    }

    @Override
    public void setHamonMode(HamonMode hamonMode) {
        this.hamonMode = hamonMode;
        HamonUserComponent.entityKey.sync(user);
    }

    @Override
    public void setHamonEnergy(int hamonEnergy) {
        this.hamonEnergy = hamonEnergy;
        HamonUserComponent.entityKey.sync(user);
    }

    @Override
    public void setHamonLevel(int hamonLevel) {
        this.hamonLevel = hamonLevel;
        HamonUserComponent.entityKey.sync(user);
    }

    @Override
    public void readFromNbt(NbtCompound tag) {
        try {
            hamon = Hamon.valueOf(tag.getString("HamonType"));
        } catch (IllegalArgumentException e) {
            hamon = Hamon.NONE;
        }
        hamonActive = tag.getBoolean("HamonActive");
        hamonMode = HamonMode.values()[tag.getByte("HamonMode")];
        hamonEnergy = tag.getInt("HamonEnergy");
        hamonLevel = tag.getInt("HamonLevel");
    }

    @Override
    public void writeToNbt(NbtCompound tag) {
        tag.putString("HamonType", hamon.name());
        tag.putBoolean("HamonActive", hamonActive);
        tag.putByte("HamonMode", (byte) hamonMode.ordinal());
        tag.putInt("HamonEnergy", hamonEnergy);
        tag.putInt("HamonLevel", hamonLevel);
    }

    @Override
    public void copyForRespawn(HamonUserComponentImpl original, boolean lossless, boolean keepInventory) {
        if (lossless) {
            copyFrom(original);
        } else {
            hamon = original.hamon;
            hamonLevel = original.hamonLevel;
            HamonUserComponent.entityKey.sync(user);
        }
    }

    @Override
    public void copyFrom(HamonUserComponentImpl other) {
        hamon = other.hamon;
        hamonActive = other.hamonActive;
        hamonMode = other.hamonMode;
        hamonEnergy = other.hamonEnergy;
        hamonLevel = other.hamonLevel;
        HamonUserComponent.entityKey.sync(user);
    }

    @Override
    public void serverTick() {
        hamonEnergy = Math.min(hamonEnergy+100, 100000);
        HamonUserComponent.entityKey.sync(user);
    }
}