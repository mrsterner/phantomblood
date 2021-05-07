package phantomblood.common.stand;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class PBMathHelper {
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
