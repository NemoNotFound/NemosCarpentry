package com.nemonotfound.nemoscarpenting.screen;

import com.nemonotfound.nemoscarpenting.recipe.CarpentingRecipe;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

import java.util.List;

import static com.nemonotfound.NemosCarpenting.MOD_ID;

@Environment(value= EnvType.CLIENT)
public class CarpentingScreen extends HandledScreen<CarpentingScreenHandler> {

    private static final Identifier TEXTURE = new Identifier(MOD_ID, "textures/gui/container/carpenting_table.png");
    private float scrollAmount;
    private int scrollOffset;
    private boolean mouseClicked;
    private boolean hasAvailableRecipes;

    public CarpentingScreen(CarpentingScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        handler.setContentsChangedListener(this::onInventoryChange);
        --this.titleY;
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
        drawScroll(context);
        drawToolSlots(context);

        this.renderRecipeBackground(context, mouseX, mouseY, x + 52, y + 14, scrollOffset + 12);
        this.renderRecipeIcons(context, x + 52, y + 14, scrollOffset + 12);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(context, mouseX, mouseY);
    }

    //TODO: REFACTOR
    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        this.mouseClicked = false;
        if (hasAvailableRecipes) {
            int i = this.x + 52;
            int j = this.y + 14;
            int k = this.scrollOffset + 12;
            for (int l = this.scrollOffset; l < k; ++l) {
                int m = l - this.scrollOffset;
                double d = mouseX - (double) (i + m % 4 * 16);
                double e = mouseY - (double) (j + m / 4 * 18);
                if (!(d >= 0.0) || !(e >= 0.0) || !(d < 16.0) || !(e < 18.0) || !(this.handler).onButtonClick(this.client.player, l))
                    continue;

                if (this.handler.getAvailableRecipeCount() > l) {
                    if (!this.handler.canCraftSelectedRecipe()) {
                        MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance.master(SoundEvents.UI_STONECUTTER_SELECT_RECIPE, 4.0f));
                    } else {
                        MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance.master(SoundEvents.UI_STONECUTTER_SELECT_RECIPE, 1.0f));
                    }
                }
                this.client.interactionManager.clickButton((this.handler).syncId, l);
                return true;
            }
            i = this.x + 119;
            j = this.y + 9;
            if (mouseX >= (double) i && mouseX < (double) (i + 12) && mouseY >= (double) j && mouseY < (double) (j + 54)) {
                this.mouseClicked = true;
            }
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    protected boolean isClickOutsideBounds(double mouseX, double mouseY, int left, int top, int button) {
        return mouseX < (double) left - 22 ||
                mouseY < (double) top ||
                mouseX >= (double) (left + this.backgroundWidth) ||
                mouseY >= (double) (top + this.backgroundHeight);
    }

    //TODO: REFACTOR
    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
        if (this.mouseClicked && this.shouldScroll()) {
            int i = this.y + 14;
            int j = i + 54;
            this.scrollAmount = ((float) mouseY - (float) i - 7.5f) / ((float) (j - i) - 15.0f);
            this.scrollAmount = MathHelper.clamp(this.scrollAmount, 0.0f, 1.0f);
            this.scrollOffset = (int) ((double) (this.scrollAmount * (float) this.getMaxScroll()) + 0.5) * 4;
            return true;
        }
        return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
    }

    //TODO: REFACTOR
    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double amount) {
        if (this.shouldScroll()) {
            int i = this.getMaxScroll();
            float f = (float) amount / (float) i;
            this.scrollAmount = MathHelper.clamp(this.scrollAmount - f, 0.0f, 1.0f);
            this.scrollOffset = (int) ((double) (this.scrollAmount * (float) i) + 0.5) * 4;
        }
        return true;
    }

    //TODO: REFACTOR
    @Override
    protected void drawMouseoverTooltip(DrawContext context, int x, int y) {
        super.drawMouseoverTooltip(context, x, y);
        int i = this.x + 52;
        int j = this.y + 14;
        int k = this.scrollOffset + 12;
        List<CarpentingRecipe> list = this.handler.getAvailableRecipes();
        for (int l = this.scrollOffset; l < k && l < this.handler.getAvailableRecipeCount(); ++l) {
            int m = l - this.scrollOffset;
            int n = i + m % 4 * 16;
            int o = j + m / 4 * 18 + 2;
            if (x < n || x >= n + 16 || y < o || y >= o + 18) continue;
            context.drawItemTooltip(this.textRenderer, list.get(l).getOutput(this.client.world.getRegistryManager()), x, y);
        }
    }

    //TODO: REFACTOR
    private void renderRecipeBackground(DrawContext context, int mouseX, int mouseY, int x, int y, int scrollOffset) {
        for (int i = this.scrollOffset; i < scrollOffset && i < this.handler.getAvailableRecipeCount(); ++i) {
            int j = i - this.scrollOffset;
            int k = x + j % 4 * 16;
            int l = j / 4;
            int m = y + l * 18 + 2;
            int n = this.backgroundHeight;
            if (i == this.handler.getSelectedRecipe()) {
                n += 54;
            } else if (mouseX >= k && mouseY >= m && mouseX < k + 16 && mouseY < m + 18) {
                n += 36;
            }

            if (!this.handler.canCraftRecipe(i)) {
                n += 18;
            }

            context.drawTexture(TEXTURE, k, m - 1, 0, n, 16, 18);
        }
    }

    //TODO: REFACTOR
    private void renderRecipeIcons(DrawContext context, int x, int y, int scrollOffset) {
        List<CarpentingRecipe> list = this.handler.getAvailableRecipes();
        for (int i = this.scrollOffset; i < scrollOffset && i < this.handler.getAvailableRecipeCount(); ++i) {
            int j = i - this.scrollOffset;
            int k = x + j % 4 * 16;
            int l = j / 4;
            int m = y + l * 18 + 2;
            context.drawItem(list.get(i).getOutput(this.client.world.getRegistryManager()), k, m);
        }
    }

    private void drawScroll(DrawContext context) {
        int scrollOffset = (int) (41.0f * this.scrollAmount);
        context.drawTexture(TEXTURE, x + 119, y + 15 + scrollOffset, 176 + (this.shouldScroll() ? 0 : 12), 0, 12, 15);
    }

    private void drawToolSlots(DrawContext context) {
        context.drawTexture(TEXTURE, x - 21, y + 13, 176, 15, 18, 18);
        context.drawTexture(TEXTURE, x - 21, y + 36, 176, 15, 18, 18);
        context.drawTexture(TEXTURE, x - 21, y + 59, 176, 15, 18, 18);
        context.drawTexture(TEXTURE, x - 21, y + 82, 176, 15, 18, 18);
    }

    private boolean shouldScroll() {
        return false;
    }

    protected int getMaxScroll() {
        return 0;
    }

    private void onInventoryChange() {
        hasAvailableRecipes = this.handler.hasAvailableRecipes();
        if (!hasAvailableRecipes) {
            this.scrollAmount = 0.0f;
            this.scrollOffset = 0;
        }
    }
}
