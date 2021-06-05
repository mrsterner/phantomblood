package mrsterner.phantomblood.stand;

import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;
import dev.onyxstudios.cca.api.v3.entity.PlayerComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;

public final class StandUserComponentImpl implements StandUserComponent, AutoSyncedComponent, PlayerComponent<StandUserComponentImpl> {
    private PlayerEntity owner;
    private Stand stand = Stand.NONE;
    private boolean standActive = false;
    private StandMode standMode = StandMode.IDLE;
    private int standEnergy = 100000;
    private int standLevel = 0;

    public StandUserComponentImpl(PlayerEntity owner) {
        this.owner = owner;
    }

    @Override
    public Stand getStand() {
        return stand;
    }

    @Override
    public boolean getStandActive() {
        return standActive;
    }

    @Override
    public StandMode getStandMode() {
        return standMode;
    }

    @Override
    public int getStandEnergy() {
        return standEnergy;
    }

    @Override
    public int getStandLevel() {
        return standLevel;
    }

    @Override
    public void setStand(Stand stand) {
        this.stand = stand;
        StandUserComponent.entityKey.sync(owner);
    }

    @Override
    public void setStandActive(boolean standActive) {
        this.standActive = standActive;
        StandUserComponent.entityKey.sync(owner);
    }

    @Override
    public void setStandMode(StandMode standMode) {
        this.standMode = standMode;
        StandUserComponent.entityKey.sync(owner);
    }

    @Override
    public void setStandEnergy(int standEnergy) {
        this.standEnergy = standEnergy;
        StandUserComponent.entityKey.sync(owner);
    }

    @Override
    public void setStandLevel(int standLevel) {
        this.standLevel = standLevel;
        StandUserComponent.entityKey.sync(owner);
    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        try {
            stand = Stand.valueOf(tag.getString("StandType"));
        } catch (IllegalArgumentException e) {
            stand = Stand.NONE;
        }
        standActive = tag.getBoolean("StandActive");
        standMode = StandMode.values()[tag.getByte("StandMode")];
        standEnergy = tag.getInt("StandEnergy");
        standLevel = tag.getInt("StandLevel");
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        tag.putString("StandType", stand.name());
        tag.putBoolean("StandActive", standActive);
        tag.putByte("StandMode", (byte) standMode.ordinal());
        tag.putInt("StandEnergy", standEnergy);
        tag.putInt("StandLevel", standLevel);
    }

    @Override
    public void copyForRespawn(StandUserComponentImpl original, boolean lossless, boolean keepInventory) {
        if (lossless) {
            copyFrom(original);
        } else {
            stand = original.stand;
            standLevel = original.standLevel;
            StandUserComponent.entityKey.sync(owner);
        }
    }

    @Override
    public void copyFrom(StandUserComponentImpl other) {
        stand = other.stand;
        standActive = other.standActive;
        standMode = other.standMode;
        standEnergy = other.standEnergy;
        standLevel = other.standLevel;
        StandUserComponent.entityKey.sync(owner);
    }

    @Override
    public void serverTick() {
        standEnergy = Math.min(standEnergy+100, 100000);
        if (standActive && standMode.equals(StandMode.IDLE)) {
            owner.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 40));
        }
        if(standActive &&  standMode.equals(StandMode.ATTACKING)){
            owner.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 40, 2));
        }
        StandUserComponent.entityKey.sync(owner);
    }
}