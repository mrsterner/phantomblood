package mrsterner.phantomblood.common.registry;

import moriyashiine.bewitchment.common.statuseffect.EmptyStatusEffect;
import mrsterner.phantomblood.PhantomBlood;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class PBStatusEffects {
    private static final Map<StatusEffect, Identifier> STATUS_EFFECTS = new LinkedHashMap<>();

    public static final StatusEffect URIEL = create("urieleffect", new EmptyStatusEffect(StatusEffectType.NEUTRAL, 0x2f5e7b));
    public static final StatusEffect TIME_STOP = create("timestopeffect", new EmptyStatusEffect(StatusEffectType.NEUTRAL, 0x2f5e7b));
    public static final StatusEffect STONE_MASK_DEATH = create("stonemaskeffect", new EmptyStatusEffect(StatusEffectType.NEUTRAL, 0x2f5e7b));


    private static <T extends StatusEffect> T create(String name, T effect) {
        STATUS_EFFECTS.put(effect, new Identifier(PhantomBlood.MODID, name));
        return effect;
    }

    public static void init() {
        STATUS_EFFECTS.keySet().forEach(effect -> Registry.register(Registry.STATUS_EFFECT, STATUS_EFFECTS.get(effect), effect));
    }
}
