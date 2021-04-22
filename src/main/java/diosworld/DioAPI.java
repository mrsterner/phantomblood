package diosworld;

import diosworld.common.item.StonemaskItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

public class DioAPI {
    public static boolean isSourceFromStonemask(DamageSource source) {
        if (((LivingEntity) source.getSource()).getMainHandStack().getItem() instanceof StonemaskItem) {
            return true;
        }

        return false;
    }
}
