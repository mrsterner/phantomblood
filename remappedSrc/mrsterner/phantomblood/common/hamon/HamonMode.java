package mrsterner.phantomblood.common.hamon;

import java.util.Locale;

public enum HamonMode {
    IDLE;

    @Override
    public String toString() {
        return "status.theworld."+name().toLowerCase(Locale.ROOT);
    }
}