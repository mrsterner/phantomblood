package mrsterner.phantomblood.common.timestop;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3;
import dev.onyxstudios.cca.api.v3.component.ComponentV3;
import dev.onyxstudios.cca.api.v3.component.tick.ServerTickingComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public interface TimeStopComponent extends ComponentV3, ServerTickingComponent {
    long getTimeStoppedTicks();
    void setTimeStoppedTicks(long value);

    PlayerEntity getTimeStopper();
    void setTimeStopper(PlayerEntity value);

    ComponentKey<TimeStopComponent> worldKey = ComponentRegistryV3.INSTANCE.getOrCreate(new Identifier("phantomblood:time_stop"), TimeStopComponent.class);
}