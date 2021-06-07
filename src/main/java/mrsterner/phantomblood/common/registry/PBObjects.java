package mrsterner.phantomblood.common.registry;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.block.CoffinBlock;
import mrsterner.phantomblood.common.worldgen.RegistrationHelper;
import mrsterner.phantomblood.common.worldgen.generator.RuinGenerator;
import mrsterner.phantomblood.common.worldgen.structure.RuinStructure;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.*;
import net.minecraft.util.DyeColor;
import net.minecraft.block.entity.BlockEntityType.Builder;
import mrsterner.phantomblood.common.item.*;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

import java.util.LinkedHashMap;
import java.util.Map;

import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.copyOf;


public class PBObjects {
    private static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();
    private static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();



    //Item

    public static final Item ARROW_HEAD = create("arrow_head", new ArrowHeadItem(gen().maxCount(1)));
    public static final Item DAGGER = create("dagger", new DaggerItem(ToolMaterials.IRON, 1, -2, gen()));
    public static final Item BLOOD_AMPOULE = create("blood_ampoule", new BloodAmpouleItem(gen()));
    public static final Item AMPOULE = create("ampoule", new Item(gen()));
    public static final Item STONE_OF_AJA = create("stone_of_aja", new Item(gen()));
    public static final Item KILLER_QUEEN_TRIGGER = create("killer_queen_trigger", new KillerQueenTriggerItem(gen()));


    public static final Item STAR_PLATINUM_DISC = create("star_platinum_disc", new StandDiscItem(gen().rarity(Rarity.RARE).maxCount(1)));
    public static final Item THE_WORLD_DISC = create("the_world_disc", new StandDiscItem(gen().rarity(Rarity.RARE).maxCount(1)));
    public static final Item KILLER_QUEEN_DISC = create("killer_queen_disc", new StandDiscItem(gen().rarity(Rarity.RARE).maxCount(1)));


    //Blocks
    public static final Block BLACK_COFFIN = create("black_coffin", new CoffinBlock(DyeColor.BLACK, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block RED_COFFIN = create("red_coffin", new CoffinBlock(DyeColor.RED, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block GREEN_COFFIN = create("green_coffin", new CoffinBlock(DyeColor.GREEN, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block BROWN_COFFIN = create("brown_coffin", new CoffinBlock(DyeColor.BROWN, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block BLUE_COFFIN = create("blue_coffin", new CoffinBlock(DyeColor.BLUE, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block PURPLE_COFFIN = create("purple_coffin", new CoffinBlock(DyeColor.PURPLE, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block CYAN_COFFIN = create("cyan_coffin", new CoffinBlock(DyeColor.CYAN, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block LIGHT_GRAY_COFFIN = create("light_gray_coffin", new CoffinBlock(DyeColor.LIGHT_GRAY, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block GRAY_COFFIN = create("gray_coffin", new CoffinBlock(DyeColor.GRAY, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block PINK_COFFIN = create("pink_coffin", new CoffinBlock(DyeColor.PINK, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block LIME_COFFIN = create("lime_coffin", new CoffinBlock(DyeColor.LIME, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block YELLOW_COFFIN = create("yellow_coffin", new CoffinBlock(DyeColor.YELLOW, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block LIGHT_BLUE_COFFIN = create("light_blue_coffin", new CoffinBlock(DyeColor.LIGHT_BLUE, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block MAGENTA_COFFIN = create("magenta_coffin", new CoffinBlock(DyeColor.MAGENTA, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block ORANGE_COFFIN = create("orange_coffin", new CoffinBlock(DyeColor.ORANGE, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);
    public static final Block WHITE_COFFIN = create("white_coffin", new CoffinBlock(DyeColor.WHITE, copyOf(Blocks.BLACKSTONE).nonOpaque()), true);

    //Armor
    public static final Item STONE_MASK_ITEM = create("stonemaskitem", new StonemaskItem(PBMaterials.VAMPIRE_ARMOR, EquipmentSlot.HEAD, gen()));
    public static final Item BLOODY_STONE_MASK_ITEM = create("bloodstonemaskitem", new BloodStonemaskItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, gen()));
    public static final Item VAMPIRE_HAT = create("vampire_hat", new VampireArmorItem(PBMaterials.VAMPIRE_ARMOR, EquipmentSlot.HEAD, gen().maxCount(1)));
    public static final Item VAMPIRE_JACKET = create("vampire_coat", new VampireArmorItem(PBMaterials.VAMPIRE_ARMOR, EquipmentSlot.CHEST, gen().maxCount(1)));
    public static final Item VAMPIRE_JACKET_F = create("vampire_coat_f", new VampireArmorItem(PBMaterials.VAMPIRE_ARMOR, EquipmentSlot.CHEST, gen().maxCount(1)));
    public static final Item VAMPIRE_PANTS = create("vampire_pants", new VampireArmorItem(PBMaterials.VAMPIRE_ARMOR, EquipmentSlot.LEGS, gen().maxCount(1)));
    public static final Item VAMPIRE_BOOTS = create("vampire_shoes", new VampireArmorItem(PBMaterials.VAMPIRE_ARMOR, EquipmentSlot.FEET, gen().maxCount(1)));

    //Book
    public static final Item LOST_BOOK = create("lost_book", new PBBookItem(gen().maxCount(1)));

    //Structure
    public static final ConfiguredStructureFeature<StructurePoolFeatureConfig, ?> RUIN = PhantomBlood.RUIN.configure(new StructurePoolFeatureConfig(RegistrationHelper.pool(RuinGenerator.STARTING_POOL), 2));




    //Register
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
        return new Item.Settings().group(PhantomBlood.PHANTOMBLOOD_GROUP);
    }

    public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(String name, Builder<T> builder) {
        if (FabricLoader.INSTANCE.isDevelopmentEnvironment()) {
            BlockEntityType<T> blockEntityType = builder.build(null);
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(PhantomBlood.MODID, name), blockEntityType);
            return blockEntityType;
        }
        return null;
    }

    public static void init() {
        BLOCKS.keySet().forEach(block -> Registry.register(Registry.BLOCK, BLOCKS.get(block), block));
        ITEMS.keySet().forEach(item -> Registry.register(Registry.ITEM, ITEMS.get(item), item));
        Registry.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, RuinStructure.ID, RUIN);
    }


}
