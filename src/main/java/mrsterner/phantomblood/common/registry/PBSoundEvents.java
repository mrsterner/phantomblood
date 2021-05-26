package mrsterner.phantomblood.common.registry;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class PBSoundEvents {
    private static final Map<SoundEvent, Identifier> SOUND_EVENTS = new LinkedHashMap();
    public static final SoundEvent VAMPIRE = create("entity.vampire");

    public PBSoundEvents() {
    }

    private static SoundEvent create(String name) {
        Identifier id = new Identifier("phantomblood", name);
        SoundEvent soundEvent = new SoundEvent(id);
        SOUND_EVENTS.put(soundEvent, id);
        return soundEvent;
    }

    public static void init() {
        SOUND_EVENTS.keySet().forEach((soundEvent) -> {
            Registry.register(Registry.SOUND_EVENT, (Identifier) SOUND_EVENTS.get(soundEvent), soundEvent);
        });
    }
}
