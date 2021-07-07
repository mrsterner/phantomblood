package mrsterner.phantomblood.client.renderer;

import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3f;

public interface HamonAccessor {
    int getHamonTicks();
    void setHamonTicks(int ticks);

    Vec3d getHamonVelocity();
    void setHamonVelocity(Vec3d velocity);
}