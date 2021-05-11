package mrsterner.phantomblood.common.registry;

import net.minecraft.entity.player.PlayerEntity;

public class AngelDeal {
    public void tick(PlayerEntity player) {
    }

    public static class Instance {
        public final AngelDeal angelDeal;
        public int duration, cost;

        public Instance(AngelDeal angelDeal, int duration, int cost) {
            this.angelDeal = angelDeal;
            this.duration = duration;
            this.cost = cost;
        }
    }
}