package mrsterner.phantomblood.client.renderer;

import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3f;

public interface StasisAccessor {
    int getStasisTicks();
    void setStasisTicks(int ticks);

    Vec3d getStasisVelocity();
    void setStasisVelocity(Vec3d velocity);
}