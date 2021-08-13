package mrsterner.phantomblood.common.stand;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public final class StandUtils {
    public static StandMode getStandMode(PlayerEntity playerEntity) {
        return StandUserComponent.entityKey.get(playerEntity).getStandMode();
    }
    public static boolean isStandActive(PlayerEntity playerEntity) {
        return StandUserComponent.entityKey.get(playerEntity).getStandActive();
    }
    public static Stand getStand(PlayerEntity playerEntity) {
        return StandUserComponent.entityKey.get(playerEntity).getStand();
    }
    public static int getStandLevel(PlayerEntity playerEntity) {
        return StandUserComponent.entityKey.get(playerEntity).getStandLevel();
    }
    public static int getStandEnergy(PlayerEntity playerEntity) {
        return StandUserComponent.entityKey.get(playerEntity).getStandEnergy();
    }
    public static void setStandMode(PlayerEntity playerEntity, StandMode mode) {
        StandUserComponent.entityKey.get(playerEntity).setStandMode(mode);
    }
    public static void setToNextStandMode(PlayerEntity playerEntity) {
        StandUserComponent component = StandUserComponent.entityKey.get(playerEntity);
        StandMode mode = component.getStandMode();
        StandMode[] modes = StandMode.values();
        StandMode result = modes[(mode.ordinal()+1) % modes.length];
        component.setStandMode(result);
    }
    public static void setStandActive(PlayerEntity playerEntity, boolean value) {
        StandUserComponent.entityKey.get(playerEntity).setStandActive(value);
    }
    public static void toggleStandActive(PlayerEntity playerEntity) {
        StandUserComponent component = StandUserComponent.entityKey.get(playerEntity);
        component.setStandActive(!component.getStandActive());
    }
    public static void setStand(PlayerEntity playerEntity, Stand stand) {
        StandUserComponent.entityKey.get(playerEntity).setStand(stand);
    }
    public static void setStandLevel(PlayerEntity playerEntity, int level) {
        StandUserComponent.entityKey.get(playerEntity).setStandLevel(level);
    }
    public static void setStandEnergy(PlayerEntity playerEntity, int energy) {
        StandUserComponent.entityKey.get(playerEntity).setStandEnergy(energy);
    }

    //Uniques
    public static void repairItem(ItemStack stack, int duration){
        if (!stack.isEmpty()&&stack.getDamage()>0) {
            int result = stack.getDamage()-duration;
            stack.setDamage(Math.max(result, 0));
        }
    }
}