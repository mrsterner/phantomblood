package mrsterner.phantomblood.common.hamon;

import net.minecraft.entity.player.PlayerEntity;

public final class HamonUtils {
    public static HamonMode getHamonMode(PlayerEntity playerEntity) {
        return HamonUserComponent.entityKey.get(playerEntity).getHamonMode();
    }
    public static boolean isHamonActive(PlayerEntity playerEntity) {
        return HamonUserComponent.entityKey.get(playerEntity).getHamonActive();
    }
    public static Hamon getHamon(PlayerEntity playerEntity) {
        return HamonUserComponent.entityKey.get(playerEntity).getHamon();
    }
    public static int getHamonLevel(PlayerEntity playerEntity) {
        return HamonUserComponent.entityKey.get(playerEntity).getHamonLevel();
    }
    public static int getHamonEnergy(PlayerEntity playerEntity) {
        return HamonUserComponent.entityKey.get(playerEntity).getHamonEnergy();
    }
    public static void setHamonMode(PlayerEntity playerEntity, HamonMode mode) {
        HamonUserComponent.entityKey.get(playerEntity).setHamonMode(mode);
    }
    public static void setToNextHamonMode(PlayerEntity playerEntity) {
        HamonUserComponent component = HamonUserComponent.entityKey.get(playerEntity);
        HamonMode mode = component.getHamonMode();
        HamonMode[] modes = HamonMode.values();
        HamonMode result = modes[(mode.ordinal()+1) % modes.length];
        component.setHamonMode(result);
    }
    public static void setHamonActive(PlayerEntity playerEntity, boolean value) {
        HamonUserComponent.entityKey.get(playerEntity).setHamonActive(value);
    }
    public static void toggleHamonActive(PlayerEntity playerEntity) {
        HamonUserComponent component = HamonUserComponent.entityKey.get(playerEntity);
        component.setHamonActive(!component.getHamonActive());
    }
    public static void setHamon(PlayerEntity playerEntity, Hamon hamon) {
        HamonUserComponent.entityKey.get(playerEntity).setHamon(hamon);
    }
    public static void setHamonLevel(PlayerEntity playerEntity, int level) {
        HamonUserComponent.entityKey.get(playerEntity).setHamonLevel(level);
    }
    public static void setHamonEnergy(PlayerEntity playerEntity, int energy) {
        HamonUserComponent.entityKey.get(playerEntity).setHamonEnergy(energy);
    }
}