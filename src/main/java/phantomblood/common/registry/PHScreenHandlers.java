package phantomblood.common.registry;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import phantomblood.PhantomBlood;

public class PHScreenHandlers {
    public static ScreenHandlerType<AngelScreenHandler> ANGEL_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(PhantomBlood.MODID, "demon_screen"), (syncId, inventory) -> new AngelScreenHandler(syncId));
}
