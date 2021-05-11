package phantomblood.common.registry;

import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import phantomblood.PhantomBlood;

public class PhantomBloodRegisters {
    public static final Registry<AngelDeal> ANGEL_DEALS = FabricRegistryBuilder.createSimple(AngelDeal.class, new Identifier(PhantomBlood.MODID, "angel_deal")).buildAndRegister();
}
