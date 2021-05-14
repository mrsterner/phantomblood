package mrsterner.phantomblood.common.registry;

import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import mrsterner.phantomblood.PhantomBlood;

public class PBRegisters {
    public static final Registry<AngelDeal> ANGEL_DEALS = FabricRegistryBuilder.createSimple(AngelDeal.class, new Identifier(PhantomBlood.MODID, "angel_deal")).buildAndRegister();
}
