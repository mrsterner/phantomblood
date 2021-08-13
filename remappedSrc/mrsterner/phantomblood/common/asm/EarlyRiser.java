package mrsterner.phantomblood.common.asm;

import com.chocohead.mm.api.ClassTinkerers;
import net.fabricmc.loader.api.FabricLoader;

public class EarlyRiser implements Runnable{
    @Override
    public void run() {
        final String EnchantmentTarget = FabricLoader.getInstance().getMappingResolver().mapClassName("intermediary", "net.minecraft.class_1886");
        ClassTinkerers.enumBuilder(EnchantmentTarget, new Class[0]).addEnumSubclass("ARROW_HEAD", "mrsterner.phantomblood.common.asm.ArrowTarget").build();
    }
}
