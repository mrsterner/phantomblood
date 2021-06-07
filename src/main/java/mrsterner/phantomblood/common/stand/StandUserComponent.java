package mrsterner.phantomblood.common.stand;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3;
import dev.onyxstudios.cca.api.v3.component.ComponentV3;
import dev.onyxstudios.cca.api.v3.component.tick.ServerTickingComponent;
import net.minecraft.util.Identifier;

public interface StandUserComponent extends ComponentV3, ServerTickingComponent {
    Stand getStand();
    void setStand(Stand value);
    boolean getStandActive();
    void setStandActive(boolean value);
    StandMode getStandMode();
    void setStandMode(StandMode value);
    int getStandEnergy();
    void setStandEnergy(int value);
    int getStandLevel();
    void setStandLevel(int value);

    ComponentKey<StandUserComponent> entityKey = ComponentRegistryV3.INSTANCE.getOrCreate(new Identifier("phantomblood:stand_user"), StandUserComponent.class);
}