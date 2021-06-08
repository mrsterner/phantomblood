package mrsterner.phantomblood.mixin;


import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
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
    @Shadow
    protected abstract PlayerEntity getCameraPlayer();

    @Shadow
    private int scaledHeight;

    @Shadow
    private int scaledWidth;

    @Shadow
    @Final
    private MinecraftClient client;

    @Inject(method = "renderStatusBars", at = @At(value = "HEAD"))
    private void renderPre(MatrixStack matrices, CallbackInfo callbackInfo) {
        PlayerEntity player = getCameraPlayer();
        if (StandUtils.getStand(player) == Stand.THE_WORLD && StandUtils.isStandActive(player)) {
            client.getTextureManager().bindTexture(PHANTOMBLOOD_GUI_ICONS_TEXTURE);
            if(StandUtils.getStandLevel(player) == 0){
                drawTexture(matrices, scaledWidth / 2 - 27, (scaledHeight - 50) , 27, 0, 53, 26);
                //drawTexture(matrices, scaledWidth / 2 - 27, (scaledHeight - 66) , 27, 0, 53, 38);
            }else{
                drawTexture(matrices, scaledWidth / 2 - 27, (scaledHeight - 50) , 27+53, 0, 53, 26);
                //drawTexture(matrices, scaledWidth / 2 - 27, (scaledHeight - 66) , 27+53, 0, 53, 38);
            }
            //drawTexture(matrices, scaledWidth / 2 - 27, (scaledHeight - 66) , 27, 53, 53, 38);
            //drawTexture(matrices, scaledWidth / 2 + 100, (scaledHeight - 30) , 27, 53, 53, 38);
            client.getTextureManager().bindTexture(GUI_ICONS_TEXTURE);

        }
        if(StandUtils.getStand(player) == Stand.STAR_PLATINUM && StandUtils.isStandActive(player)){
            client.getTextureManager().bindTexture(PHANTOMBLOOD_GUI_ICONS_TEXTURE);
            if(StandUtils.getStandLevel(player) == 0){
                drawTexture(matrices, scaledWidth / 2 - 27, (scaledHeight - 50) , 27, 0, 53, 26);
            }else{
                drawTexture(matrices, scaledWidth / 2 - 27, (scaledHeight - 50) , 27+53, 0, 53, 26);
            }
            //drawTexture(matrices, scaledWidth / 2 + 100, (scaledHeight - 30) , 83, 53, 53, 38);
            client.getTextureManager().bindTexture(GUI_ICONS_TEXTURE);
        }
        if(StandUtils.getStand(player) == Stand.KILLER_QUEEN && StandUtils.isStandActive(player)){
            client.getTextureManager().bindTexture(PHANTOMBLOOD_GUI_ICONS_TEXTURE);
            if(StandUtils.getStandLevel(player) == 0){
                drawTexture(matrices, scaledWidth / 2 - 27, (scaledHeight - 50) , 27, 0, 53, 26);
            }else{
                drawTexture(matrices, scaledWidth / 2 - 27, (scaledHeight - 50) , 27+53, 0, 53, 26);
            }
            //drawTexture(matrices, scaledWidth / 2 + 100, (scaledHeight - 30) , 83, 53, 53, 38);
            client.getTextureManager().bindTexture(GUI_ICONS_TEXTURE);
        }
    }

    @Inject(method = "renderStatusBars", at = @At(value = "TAIL"))
    private void renderPost(MatrixStack matrices, CallbackInfo callbackInfo) {
        PlayerEntity player = getCameraPlayer();
        if (StandUtils.getStand(player) != Stand.NONE) {
            switch (StandUtils.getStand(player)) {
                case THE_WORLD:
                    client.getTextureManager().bindTexture(PHANTOMBLOOD_GUI_ICONS_TEXTURE);
                    drawTexture(matrices, scaledWidth / 2 + 95, (scaledHeight - 26) , 0, 0, 6, 24);
                    drawTexture(matrices, scaledWidth / 2 + 94, (scaledHeight - 27) , 6, 0, 8, (int) (26 - StandUtils.getStandEnergy(player) * 26f / 100000));
                    drawTexture(matrices, scaledWidth / 2 + 94, (scaledHeight - 27) , 14, 0, 8, 26);
                    drawTexture(matrices, scaledWidth / 2 + 93, (scaledHeight - (int) (4 + StandUtils.getStand(player).energyForAbility * 26f / 100000)) , 23, 0, 4, 3);
                    break;
                case KILLER_QUEEN:
                case CRAZY_DIAMOND:
                    client.getTextureManager().bindTexture(PHANTOMBLOOD_GUI_ICONS_TEXTURE);
                    drawTexture(matrices, scaledWidth / 2 + 95, (scaledHeight - 26), 0, 48, 6, 24);
                    drawTexture(matrices, scaledWidth / 2 + 94, (scaledHeight - 27), 6, 0, 8, (int) (26 - StandUtils.getStandEnergy(player) * 26f / 100000));
                    drawTexture(matrices, scaledWidth / 2 + 94, (scaledHeight - 27), 14, 0, 8, 26);
                    drawTexture(matrices, scaledWidth / 2 + 93, (scaledHeight - (int) (4 + StandUtils.getStand(player).energyForAbility * 26f / 100000)), 23, 0, 4, 3);
                    break;

                case STAR_PLATINUM:
                    client.getTextureManager().bindTexture(PHANTOMBLOOD_GUI_ICONS_TEXTURE);
                    drawTexture(matrices, scaledWidth / 2 + 95, (scaledHeight - 26) , 0, 24, 6, 24);
                    drawTexture(matrices, scaledWidth / 2 + 94, (scaledHeight - 27) , 6, 0, 8, (int) (26 - StandUtils.getStandEnergy(player) * 26f / 100000));
                    drawTexture(matrices, scaledWidth / 2 + 94, (scaledHeight - 27) , 14, 0, 8, 26);
                    drawTexture(matrices, scaledWidth / 2 + 93, (scaledHeight - (int) (4 + StandUtils.getStand(player).energyForAbility * 26f / 100000)) , 23, 0, 4, 3);
                    break;
                default:
                    break;
            }
        }

    }
}