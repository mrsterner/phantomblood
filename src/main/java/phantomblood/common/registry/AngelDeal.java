package phantomblood.common.registry;

import net.minecraft.entity.player.PlayerEntity;

public class AngelDeal {
    public void tick(PlayerEntity player) {
    }

    public static class Instance {
        public final AngelDeal angelDeal;
        public int duration;

        public Instance(AngelDeal angelDeal, int duration) {
            this.angelDeal = angelDeal;
            this.duration = duration;
        }
    }
}