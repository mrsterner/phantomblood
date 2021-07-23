package mrsterner.phantomblood.common.stand;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3;
import dev.onyxstudios.cca.api.v3.component.ComponentV3;
import dev.onyxstudios.cca.api.v3.component.tick.ServerTickingComponent;
import net.minecraft.util.Identifier;

public interface EmeraldBulletComponent extends ComponentV3, ServerTickingComponent {
    void rotation(float value);
    void rotationRandom(float value);
    void pitch(float value);
    void life(float value);
    void damage(float value);
    void stay(float value);
    void huge(boolean value);
    void type(String value);

    ComponentKey<EmeraldBulletComponent> entityKey = ComponentRegistryV3.INSTANCE.getOrCreate(new Identifier("phantomblood:emerald_bullet"), EmeraldBulletComponent.class);
}