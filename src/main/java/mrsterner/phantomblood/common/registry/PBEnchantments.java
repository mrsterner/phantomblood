package mrsterner.phantomblood.common.registry;

import com.chocohead.mm.api.ClassTinkerers;
import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.enchantment.StandEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

import static net.minecraft.enchantment.Enchantment.Rarity.COMMON;

public class PBEnchantments {

    public static final Map<Enchantment, Identifier> ENCHANTMENT = new LinkedHashMap<>();

    //public static final EnchantmentTarget ARROW_HEAD = ClassTinkerers.getEnum(EnchantmentTarget.class, "ARROW_HEAD");
/*
    public static final Enchantment THE_WORLD_ENCHANTMENT = create("the_world_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));
    public static final Enchantment STAR_PLATINUM_ENCHANTMENT = create("star_platinum_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));
    public static final Enchantment THE_SUN_ENCHANTMENT = create("the_sun_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));
    public static final Enchantment WEATHER_REPORT_ENCHANTMENT = create("weather_report_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));
    public static final Enchantment KING_CRIMSON_ENCHANTMENT = create("king_crimson_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));
    public static final Enchantment DARK_BLUE_MOON_ENCHANTMENT = create("dark_blue_moon_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));
    public static final Enchantment PURPLE_HAZE_ENCHANTMENT = create("purple_haze_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));
    public static final Enchantment TWENTY_CENTURY_BOY_ENCHANTMENT = create("twenty_century_boy_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));
    public static final Enchantment HIEROPHANT_GREEN_ENCHANTMENT = create("hierophant_green_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));
    public static final Enchantment KILLER_QUEEN_ENCHANTMENT = create("killer_queen_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));
    public static final Enchantment CRAZY_DIAMOND_ENCHANTMENT = create("crazy_diamond_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));
    public static final Enchantment ANUBIS_ENCHANTMENT = create("anubis_enchantment", new StandEnchantment(gen(), ARROW_HEAD, gen2()));


 */


    private static <T extends Enchantment> T create(String name, T enchant) {
        ENCHANTMENT.put(enchant, new Identifier(PhantomBlood.MODID, name));
        return enchant;
    }

    private static Enchantment.Rarity gen() { return COMMON; }
    private static EquipmentSlot[] gen2(){return new EquipmentSlot[] {EquipmentSlot.MAINHAND};}

    public static void init(){
        ENCHANTMENT.keySet().forEach(enchant -> Registry.register(Registry.ENCHANTMENT, ENCHANTMENT.get(enchant), enchant));
    }
}
