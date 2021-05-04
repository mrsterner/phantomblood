package phantomblood.stand;

import net.minecraft.entity.Entity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Predicate;

public class TimeStopHelper {
    public static List<Entity> getTagetsInRange(Entity entity, double distance) {
        List<Entity> entities = entity.getEntityWorld().getEntitiesByClass(Entity.class, entity.getBoundingBox().expand(distance), null);
        return entities;
    }

}
