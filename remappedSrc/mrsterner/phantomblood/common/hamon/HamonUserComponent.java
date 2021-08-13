package mrsterner.phantomblood.common.hamon;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3;
import dev.onyxstudios.cca.api.v3.component.ComponentV3;
import dev.onyxstudios.cca.api.v3.component.tick.ServerTickingComponent;
import net.minecraft.util.Identifier;

public interface HamonUserComponent extends ComponentV3, ServerTickingComponent {
    Hamon getHamon();
    void setHamon(Hamon value);
    boolean getHamonActive();
    void setHamonActive(boolean value);
    HamonMode getHamonMode();
    void setHamonMode(HamonMode value);
    int getHamonEnergy();
    void setHamonEnergy(int value);
    int getHamonLevel();
    void setHamonLevel(int value);

    ComponentKey<HamonUserComponent> entityKey = ComponentRegistryV3.INSTANCE.getOrCreate(new Identifier("phantomblood:hamon_user"), HamonUserComponent.class);
}