package mrsterner.phantomblood.client.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import mrsterner.phantomblood.PhantomBlood;
import mrsterner.phantomblood.common.entity.AngelEntity;
import mrsterner.phantomblood.common.entity.interfaces.AngelDealAccessor;

@SuppressWarnings("ConstantConditions")
public class AngelScreen extends HandledScreen<AngelScreenHandler> {
    private static final Identifier HEARTS = new Identifier("minecraft", "textures/gui/icons.png");

    public AngelScreen(AngelScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        for (Slot slot : getScreenHandler().slots) {
            if (slot instanceof AngelScreenHandler.AngelTradeSlot) {
                AngelEntity.AngelTradeOffer offer = ((AngelScreenHandler.AngelTradeSlot) slot).getOffer();
                if (offer != null) {
                    drawHearts(matrices, slot.x, slot.y, offer);
                }
            }
        }
        drawPortrait(matrices, mouseX, mouseY);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }

    private void drawPortrait(MatrixStack matrices, int mouseX, int mouseY) {
        client.getTextureManager().bindTexture(getBackground());
        int x = (width - backgroundWidth) / 2 + 56;
        int y = (height - backgroundHeight) / 2 + 16;
        Window window = client.getWindow();
        int scissorX = unscale(x, window.getScaledWidth(), window.getWidth());
        int scissorY = unscale(window.getScaledHeight() - (y + 68), window.getScaledHeight(), window.getHeight());
        int scissorWidth = unscale(64, window.getScaledWidth(), window.getWidth());
        int scissorHeight = unscale(64, window.getScaledHeight(), window.getHeight());
        RenderSystem.enableScissor(scissorX, scissorY, scissorWidth, scissorHeight);
        drawTexture(matrices, x, y, 176, 16, 64, 72);
        int height = (int) (handler.angelMerchant.getAngelTrader().getHeight() * 55);
        InventoryScreen.drawEntity(x + 32, y + height, 50, (float) (x + 32) - mouseX, (float) (y + 105 - 50) - mouseY, handler.angelMerchant.getAngelTrader());
        RenderSystem.disableScissor();
    }

    private static int unscale(int scaled, float windowScaled, int windowReal) {
        return (int) ((scaled / windowScaled) * windowReal);
    }

    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.color4f(1, 1, 1, 1);
        client.getTextureManager().bindTexture(getBackground());
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    protected void drawForeground(MatrixStack matrices, int mouseX, int mouseY) {
        this.textRenderer.draw(matrices, this.title, (float) this.titleX, (float) this.titleY, 4210752);
    }

    private void drawHearts(MatrixStack matrices, int x, int y, AngelEntity.AngelTradeOffer offer) {
        int cost = offer.getCost(handler.angelMerchant);
        int fullGroups = cost / 2;
        client.getTextureManager().bindTexture(HEARTS);
        int heartX = (this.x + x - 6 - ((cost - 1) / 2 * 4));
        int heartY = this.y + y + 18;
        matrices.push();
        for (int i = 0; i < cost; i++) {
            heartX += 9;
            drawTexture(matrices, heartX, heartY, 16, 0, 9, 9);
            if (!((AngelDealAccessor) client.player).hasAngelDeal(offer.getAngelDeal())) {
                if (fullGroups > 0) {
                    fullGroups--;
                    i++;
                    drawTexture(matrices, heartX, heartY, 160, 0, 9, 9);
                } else {
                    drawTexture(matrices, heartX, heartY, 169, 0, 9, 9);
                }
            } else if (fullGroups > 0) {
                fullGroups--;
                i++;
            }
        }
        matrices.pop();
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    private Identifier getBackground() {
        return new Identifier(PhantomBlood.MODID, String.format("textures/gui/angel_trade_%d.png", handler.getOfferCount()));
    }
}