package mrsterner.phantomblood.common.registry;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class PBUtil {
    public static void addItemToInventoryAndConsume(PlayerEntity player, Hand hand, ItemStack toAdd) {
        boolean shouldAdd = false;
        ItemStack stack = player.getStackInHand(hand);
        if (stack.getCount() == 1) {
            if (player.isCreative()) {
                shouldAdd = true;
            } else {
                player.setStackInHand(hand, toAdd);
            }
        } else {
            stack.decrement(1);
            shouldAdd = true;
        }
        if (shouldAdd) {
            if (!player.inventory.insertStack(toAdd)) {
                player.dropItem(toAdd, false, true);
            }
        }
    }
    public static void addItemToInventory(PlayerEntity player, Hand hand, ItemStack toAdd) {
        boolean shouldAdd = false;
        ItemStack stack = player.getStackInHand(hand);
        if (stack.getCount() == 1) {
            if (player.isCreative()) {
                shouldAdd = true;
            } else {
                player.setStackInHand(hand, toAdd);
            }
        }
        if (shouldAdd) {
            if (!player.inventory.insertStack(toAdd)) {
                player.dropItem(toAdd, false, true);
            }
        }
    }
    public static List<Entity> getTagetsInRange(Entity entity, double distance) {
        List<Entity> entities = entity.getEntityWorld().getEntitiesByClass(Entity.class, entity.getBoundingBox().expand(distance), null);
        return entities;
    }
    public static Vec3d getVectorEntity(Entity source, Entity target) {
        BlockPos user_pos = source.getBlockPos();
        BlockPos target_pos = target.getBlockPos();

        Vec3d vec = new Vec3d(target_pos.getX() - user_pos.getX(), target_pos.getY() - user_pos.getY(), target_pos.getZ() - user_pos.getZ()).normalize();
        return vec;
    }

    public static Vec3d getVectorEntityEye(Entity source, Entity target) {
        Vec3d vec = new Vec3d(target.getX() - source.getX(), target.getEyeY() - source.getEyeY(), target.getZ() - source.getZ()).normalize();
        return vec;
    }

    public static double getDegreeXZ(Vec3d v1, Vec3d v2) {
        Vec3d vec1 = v1.add(0, -v1.y, 0).normalize();
        Vec3d vec2 = v2.add(0, -v2.y, 0).normalize();
        double cos = (vec1.x * vec2.x + vec1.z * vec2.z) / (vec1.length() * vec2.length());
        double degree = Math.round(Math.toDegrees(Math.acos(cos)));

        return degree;
    }
}
