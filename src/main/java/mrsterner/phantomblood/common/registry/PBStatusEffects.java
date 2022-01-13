package mrsterner.phantomblood.common.registry;

import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.statuseffect.BaseStatusEffect;
import mrsterner.phantomblood.common.statuseffect.PurpleHazeEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class PBStatusEffects {
    private static final Map<StatusEffect, Identifier> STATUS_EFFECTS = new LinkedHashMap<>();

    public static final StatusEffect DARK_BLUE_MOON = create("dark_blue_moon_effect", new BaseStatusEffect(StatusEffectCategory.BENEFICIAL, 0x75c1ff));
    public static final StatusEffect KILLER_INFECTION = create("killer_infection_effect", new PurpleHazeEffect());



    private static <T extends StatusEffect> T create(String name, T effect) {
        STATUS_EFFECTS.put(effect, new Identifier(PhantomBlood.MODID, name));
        return effect;
    }

    public static void init() {
        STATUS_EFFECTS.keySet().forEach(effect -> Registry.register(Registry.STATUS_EFFECT, STATUS_EFFECTS.get(effect), effect));
    }
}
