package phantomblood.common.stand;

import net.minecraft.entity.Entity;

import java.util.List;

public class TimeStopHelper {
    public static List<Entity> getTagetsInRange(Entity entity, double distance) {
        List<Entity> entities = entity.getEntityWorld().getEntitiesByClass(Entity.class, entity.getBoundingBox().expand(distance), null);
        return entities;
    }

}
