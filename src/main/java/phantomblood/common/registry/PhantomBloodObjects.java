package phantomblood.common.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import phantomblood.PhantomBlood;
import phantomblood.common.entity.TheWorldEntity;
import phantomblood.common.item.*;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

import static phantomblood.PhantomBlood.PHANTOMBLOOD_GROUP;


public class PhantomBloodObjects {
    private static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();
    private static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();

    //Armor
    public static final Item STONE_MASK_ITEM = create("stonemaskitem", new StonemaskItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, gen()));
    public static final Item BLOODY_STONE_MASK_ITEM = create("bloodstonemaskitem", new BloodStonemaskItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, gen()));
    public static final Item VAMPIRE_HAT = create("vampire_hat", new VampireArmorItem(PhantomBloodMaterials.VAMPIRE_ARMOR, EquipmentSlot.HEAD));
    public static final Item VAMPIRE_JACKET = create("vampire_coat", new VampireArmorItem(PhantomBloodMaterials.VAMPIRE_ARMOR, EquipmentSlot.CHEST));
    public static final Item VAMPIRE_PANTS = create("vampire_pants", new VampireArmorItem(PhantomBloodMaterials.VAMPIRE_ARMOR, EquipmentSlot.LEGS));
    public static final Item VAMPIRE_BOOTS = create("vampire_boots", new VampireArmorItem(PhantomBloodMaterials.VAMPIRE_ARMOR, EquipmentSlot.FEET));
    //Entity
    public static final EntityType<TheWorldEntity> THE_WORLD_ENTITY = Registry.register(Registry.ENTITY_TYPE, new Identifier(PhantomBlood.MODID, "theworld"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, TheWorldEntity::new).dimensions(EntityDimensions.fixed(0.9f, 2.5F)).fireImmune().trackRangeBlocks(90).trackedUpdateRate(4).build());
    //Items
    public static final Item AJA = create("aja", new Item(gen()));
    public static final Item DAGGER = create("dagger", new DaggerItem(ToolMaterials.IRON, 1, 1, gen()));


    //Registry
    private static <T extends Block> T create(String name, T block, boolean createItem) {
        BLOCKS.put(block, new Identifier(PhantomBlood.MODID, name));
        if (createItem) {
            ITEMS.put(new BlockItem(block, gen()), BLOCKS.get(block));
        }
        return block;
    }

    private static <T extends Item> T create(String name, T item) {
        ITEMS.put(item, new Identifier(PhantomBlood.MODID, name));
        return item;
    }

    private static Item.Settings gen() {
        return new Item.Settings().group(PHANTOMBLOOD_GROUP);
    }

    public static void init() {
        BLOCKS.keySet().forEach(block -> Registry.register(Registry.BLOCK, BLOCKS.get(block), block));
        ITEMS.keySet().forEach(item -> Registry.register(Registry.ITEM, ITEMS.get(item), item));
    }

}
