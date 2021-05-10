package phantomblood.common.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import phantomblood.PhantomBlood;
import phantomblood.common.entity.AngelEntity;

import java.util.LinkedHashMap;
import java.util.Map;

public class PhantomBloodEntities {
    private static final Map<EntityType<?>, Identifier> ENTITY_TYPES = new LinkedHashMap<>();

    public static final EntityType<AngelEntity> ANGEL_ENTITY = create("angel", AngelEntity.createAttributes(), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, AngelEntity::new).dimensions(EntityDimensions.fixed(0.8f, 2.4f)).fireImmune().build());


    private static <T extends LivingEntity> EntityType<T> create(String name, DefaultAttributeContainer.Builder attributes, EntityType<T> type) {
        FabricDefaultAttributeRegistry.register(type, attributes);
        ENTITY_TYPES.put(type, new Identifier(PhantomBlood.MODID, name));
        return type;
    }

    private static <T extends Entity> EntityType<T> create(String name, EntityType<T> type) {
        ENTITY_TYPES.put(type, new Identifier(PhantomBlood.MODID, name));
        return type;
    }

    public static void init() {
        ENTITY_TYPES.keySet().forEach(entityType -> Registry.register(Registry.ENTITY_TYPE, ENTITY_TYPES.get(entityType), entityType));
    }
}
