package mrsterner.phantomblood.mixin;


import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.stand.Stand;
import mrsterner.phantomblood.stand.StandUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(InGameHud.class)
public abstract class InGameHudMixin extends DrawableHelper {
    private static final Identifier PHANTOMBLOOD_GUI_ICONS_TEXTURE = new Identifier(PhantomBlood.MODID, "textures/gui/icons.png");
    private static final Identifier EMPTY_TEXTURE = new Identifier(PhantomBlood.MODID, "textures/gui/empty.png");

    @Shadow
    protected abstract PlayerEntity getCameraPlayer();

    @Shadow
    private int scaledHeight;

    @Shadow
    private int scaledWidth;

    @Shadow
    @Final
    private MinecraftClient client;

    @Inject(method = "renderStatusBars", at = @At(value = "TAIL"))
    private void renderPre(MatrixStack matrices, CallbackInfo callbackInfo) {
        PlayerEntity player = getCameraPlayer();
        if (StandUtils.getStand(player) == Stand.THE_WORLD) {
            client.getTextureManager().bindTexture(PHANTOMBLOOD_GUI_ICONS_TEXTURE);
            drawTexture(matrices, scaledWidth / 2 + 95, (scaledHeight - 26) , 0, 0, 6, 24);
            drawTexture(matrices, scaledWidth / 2 + 94, (scaledHeight - 27) , 6, 0, 8, (int) (26 - StandUtils.getStandEnergy(player) * 26f / 100000));
            drawTexture(matrices, scaledWidth / 2 + 94, (scaledHeight - 27) , 14, 0, 8, 26);
            drawTexture(matrices, scaledWidth / 2 + 93, (scaledHeight - (int) (4 + StandUtils.getStand(player).energyForAbility * 26f / 100000)) , 23, 0, 4, 3);
        }
    }
}