package mrsterner.phantomblood.common.stand;

import java.util.Locale;

public enum StandMode {
    IDLE,
    ATTACKING;

    @Override
    public String toString() {
        return "status.theworld."+name().toLowerCase(Locale.ROOT);
    }
}