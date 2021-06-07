package mrsterner.phantomblood.common.timestop;

import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

public final class TimeStopComponentImpl implements TimeStopComponent, AutoSyncedComponent {
    private World owner;
    private long timeStoppedTicks = -1;
    private PlayerEntity timeStopper = null;

    public TimeStopComponentImpl(World owner) {
        this.owner = owner;
    }

    @Override
    public long getTimeStoppedTicks() {
        return timeStoppedTicks;
    }

    @Override
    public void setTimeStoppedTicks(long timeStoppedTicks) {
        this.timeStoppedTicks = timeStoppedTicks;
        TimeStopComponent.worldKey.sync(owner);
    }

    @Override
    public PlayerEntity getTimeStopper() {
        return timeStopper;
    }

    @Override
    public void setTimeStopper(PlayerEntity value) {
        timeStopper = value;
        TimeStopComponent.worldKey.sync(owner);
    }

    @Override
    public void serverTick() {
        timeStoppedTicks--;
        if (timeStoppedTicks < 0) {
            timeStopper = null;
        }
        TimeStopComponent.worldKey.sync(owner);
    }

    @Override
    public void writeSyncPacket(PacketByteBuf buf, ServerPlayerEntity recipient) {
        buf.writeVarLong(timeStoppedTicks);
        if (timeStopper != null) {
            buf.writeUuid(timeStopper.getUuid());
        }
    }

    @Override
    public void applySyncPacket(PacketByteBuf buf) {
        timeStoppedTicks = buf.readVarLong();
        try {
            timeStopper = owner.getPlayerByUuid(buf.readUuid());
        } catch (IndexOutOfBoundsException e) {
            timeStopper = null;
        }
    }

    // We don't want to persist this
    @Override
    public void readFromNbt(CompoundTag tag) {}
    @Override
    public void writeToNbt(CompoundTag tag) {}
}