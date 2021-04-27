package phantomblood.common.registry;

import phantomblood.PhantomBlood;
import phantomblood.common.block.Chandelier;
import phantomblood.common.item.BloodStonemaskItem;
import phantomblood.common.item.DaggerItem;
import phantomblood.common.item.StonemaskItem;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.copyOf;

public class PhantomBloodObjects {
    private static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();
    private static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();
    //Armor
    public static final Item STONE_MASK_ITEM = create("stonemaskitem", new StonemaskItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Settings().group(PhantomBlood.DIO_GROUP)));
    public static final Item BLOODY_STONE_MASK_ITEM = create("bloodstonemaskitem", new BloodStonemaskItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Settings().group(PhantomBlood.DIO_GROUP)));
    //Items
    public static final Item AJA = create("aja", new Item(gen()));
    public static final Item DAGGER = create("dagger", new DaggerItem(ToolMaterials.IRON, 1, 1, new Item.Settings().group(PhantomBlood.DIO_GROUP)));

    //Blocks
    //public static final Block IRON_CANDELABRA = create("iron_chandelier", new Chandelier(copyOf(Blocks.IRON_BLOCK).luminance(blockState -> blockState.get(Properties.LIT) ? 15 : 0)), true);






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
        return new Item.Settings().group(PhantomBlood.DIO_GROUP);
    }

    public static void init() {
        BLOCKS.keySet().forEach(block -> Registry.register(Registry.BLOCK, BLOCKS.get(block), block));
        ITEMS.keySet().forEach(item -> Registry.register(Registry.ITEM, ITEMS.get(item), item));
    }
}
