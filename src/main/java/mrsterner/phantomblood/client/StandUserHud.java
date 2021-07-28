package mrsterner.phantomblood.client;


import mrsterner.phantomblood.common.hamon.Hamon;
import mrsterner.phantomblood.common.hamon.HamonUtils;
import mrsterner.phantomblood.common.stand.Stand;
import mrsterner.phantomblood.common.stand.StandUtils;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

public class StandUserHud extends DrawableHelper implements HudRenderCallback {
    @Override
    public void onHudRender(MatrixStack matrixStack, float tickDelta) {

        matrixStack.push();
        MinecraftClient mc = MinecraftClient.getInstance();
        PlayerEntity player = mc.player;
        TextRenderer textRenderer = mc.textRenderer;
        int height = mc.getWindow().getScaledHeight();
        if (player == null) return;
        Stand stand = StandUtils.getStand(player);
        Hamon hamon = HamonUtils.getHamon(player);
        if (stand == Stand.NONE) return;

        if(stand == Stand.KILLER_QUEEN){
            renderText(matrixStack, textRenderer, new TranslatableText("hud.phantomblood.stand", new TranslatableText(stand.toString()).formatted(Formatting.BOLD, Formatting.LIGHT_PURPLE)).formatted(Formatting.BOLD), height, 5);
        }else if(stand == Stand.THE_WORLD || stand == Stand.THE_SUN){
            renderText(matrixStack, textRenderer, new TranslatableText("hud.phantomblood.stand", new TranslatableText(stand.toString()).formatted(Formatting.BOLD, Formatting.YELLOW)).formatted(Formatting.BOLD), height, 5);
        }else if(stand == Stand.STAR_PLATINUM){
            renderText(matrixStack, textRenderer, new TranslatableText("hud.phantomblood.stand", new TranslatableText(stand.toString()).formatted(Formatting.BOLD, Formatting.DARK_PURPLE)).formatted(Formatting.BOLD), height, 5);
        }else if(stand == Stand.DARK_BLUE_MOON){
            renderText(matrixStack, textRenderer, new TranslatableText("hud.phantomblood.stand", new TranslatableText(stand.toString()).formatted(Formatting.BOLD, Formatting.DARK_BLUE)).formatted(Formatting.BOLD), height, 5);
        }else if(stand == Stand.WEATHER_REPORT){
            renderText(matrixStack, textRenderer, new TranslatableText("hud.phantomblood.stand", new TranslatableText(stand.toString()).formatted(Formatting.BOLD, Formatting.WHITE)).formatted(Formatting.BOLD), height, 5);
        }else if(stand == Stand.CRAZY_DIAMOND){
            renderText(matrixStack, textRenderer, new TranslatableText("hud.phantomblood.stand", new TranslatableText(stand.toString()).formatted(Formatting.BOLD, Formatting.AQUA)).formatted(Formatting.BOLD), height, 5);
        } else{
            renderText(matrixStack, textRenderer, new TranslatableText("hud.phantomblood.stand", new TranslatableText(stand.toString()).formatted(Formatting.BOLD, Formatting.WHITE)).formatted(Formatting.BOLD), height, 5);
        }
        if(hamon == Hamon.HAMON){
            renderText(matrixStack, textRenderer, new TranslatableText("hud.phantomblood.hamon", new TranslatableText(stand.toString()).formatted(Formatting.BOLD, Formatting.GOLD)).formatted(Formatting.BOLD), height, 6);
        }

        renderText(matrixStack, textRenderer, new TranslatableText("hud.phantomblood.stage", StandUtils.getStandLevel(player)).formatted(Formatting.BOLD), height, 4);
        //renderText(matrixStack, textRenderer, new TranslatableText("hud.phantomblood.energy", StandUtils.getStandEnergy(player)).formatted(Formatting.BOLD), height, 2);
        //renderText(matrixStack, textRenderer, new TranslatableText("hud.phantomblood.skill_cost", stand.energyForAbility).formatted(Formatting.BOLD), height, 1);

        matrixStack.pop();
    }

    void renderText(MatrixStack stack, TextRenderer renderer, Text text, int height, int offset) {
        int textWidth = renderer.getWidth(text);
        drawCenteredText(stack, renderer, text, textWidth/2 + 10, height + 18 - offset*9, 0xffffff);

    }
}
