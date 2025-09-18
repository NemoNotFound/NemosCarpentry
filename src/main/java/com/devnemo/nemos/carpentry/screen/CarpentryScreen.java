package com.devnemo.nemos.carpentry.screen;

import com.devnemo.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.display.SlotDisplay;
import net.minecraft.recipe.display.SlotDisplayContexts;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.context.ContextParameterMap;
import net.minecraft.util.math.MathHelper;

import static com.devnemo.nemos.carpentry.NemosCarpentry.MOD_ID;

@Environment(value= EnvType.CLIENT)
public class CarpentryScreen extends HandledScreen<CarpentryScreenHandler> {

    private static final Identifier TEXTURE = Identifier.of(MOD_ID, "textures/gui/container/carpenters_workbench.png");
    private static final Identifier SCROLLER_TEXTURE = Identifier.of(MOD_ID, "container/carpenters_workbench/scroller");
    private static final Identifier SCROLLER_DISABLED_TEXTURE = Identifier.of(MOD_ID, "container/carpenters_workbench/scroller_disabled");
    private static final Identifier RECIPE_SELECTED_TEXTURE = Identifier.of(MOD_ID, "container/carpenters_workbench/recipe_selected");
    private static final Identifier RECIPE_HIGHLIGHTED_TEXTURE = Identifier.of(MOD_ID, "container/carpenters_workbench/recipe_highlighted");
    private static final Identifier RECIPE_DISABLED_TEXTURE = Identifier.of(MOD_ID, "container/carpenters_workbench/recipe_disabled");
    private static final Identifier RECIPE_TEXTURE = Identifier.of(MOD_ID, "container/carpenters_workbench/recipe");

    private static final int RECIPES_IMAGE_SIZE_WIDTH = 16;
    private static final int RECIPES_IMAGE_SIZE_HEIGHT = 18;
    private static final int RELATIVE_RECIPE_X = 52;
    private static final int RELATIVE_RECIPE_Y = 14;
    private float scrollAmount;
    private int firstVisibleRecipeIndex;
    private boolean mouseClicked;
    private boolean hasAvailableRecipes;

    public CarpentryScreen(CarpentryScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        handler.setContentsChangedListener(this::onInventoryChange);
        --this.titleY;
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        context.drawTexture(RenderPipelines.GUI_TEXTURED, TEXTURE, x, y, 0.0F, 0.0F, this.backgroundWidth, this.backgroundHeight, 256, 256);
        drawScroll(context);

        this.renderRecipeBackground(context, mouseX, mouseY, x + 52, y + 14, firstVisibleRecipeIndex + 12);
        this.renderRecipeIcons(context, x + 52, y + 14, firstVisibleRecipeIndex + 12);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(context, mouseX, mouseY);
    }

    //TODO: REFACTOR
    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        this.mouseClicked = false;
        if (hasAvailableRecipes) {
            int firstRecipeX = this.x + RELATIVE_RECIPE_X;
            int firstRecipeY = this.y + RELATIVE_RECIPE_Y;
            var maxVisibleRecipeCount = 12;
            int lastVisibleRecipeIndex = this.firstVisibleRecipeIndex + maxVisibleRecipeCount;

            for (int recipeIndex = this.firstVisibleRecipeIndex; recipeIndex < lastVisibleRecipeIndex; ++recipeIndex) {
                int visibleRecipeIndex = recipeIndex - this.firstVisibleRecipeIndex;
                double mouseDistanceToRecipeX = mouseX - (double) (firstRecipeX + visibleRecipeIndex % 4 * 16);
                double mouseDistanceToRecipeY = mouseY - (double) (firstRecipeY + visibleRecipeIndex / 4 * 18);

                if (mouseDistanceToRecipeX >= 0.0 && mouseDistanceToRecipeY >= 0.0 && mouseDistanceToRecipeX < RECIPES_IMAGE_SIZE_WIDTH && mouseDistanceToRecipeY < RECIPES_IMAGE_SIZE_HEIGHT && (this.handler).onButtonClick(this.client.player, recipeIndex)) {
                    if (this.handler.getAvailableRecipeCount() > recipeIndex) {
                        if (!this.handler.canCraftSelectedRecipe()) {
                            MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance.master(SoundEvents.UI_STONECUTTER_SELECT_RECIPE, 4.0f));
                        } else {
                            MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance.master(SoundEvents.UI_STONECUTTER_SELECT_RECIPE, 1.0f));
                        }
                    }
                    this.client.interactionManager.clickButton((this.handler).syncId, recipeIndex);
                    return true;
                }
            }
            firstRecipeX = this.x + 119;
            firstRecipeY = this.y + 9;

            if (mouseX >= (double) firstRecipeX && mouseX < (double) (firstRecipeX + 12) && mouseY >= (double) firstRecipeY && mouseY < (double) (firstRecipeY + 54)) {
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
            this.firstVisibleRecipeIndex = (int) ((double) (this.scrollAmount * (float) this.getMaxScroll()) + 0.5) * 4;
            return true;
        }
        return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
    }

    //TODO: REFACTOR
    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        if (this.shouldScroll()) {
            int i = this.getMaxScroll();
            float f = (float) verticalAmount / (float) i;
            this.scrollAmount = MathHelper.clamp(this.scrollAmount - f, 0.0f, 1.0f);
            this.firstVisibleRecipeIndex = (int) ((double) (this.scrollAmount * (float) i) + 0.5) * 4;
        }
        return true;
    }

    //TODO: REFACTOR
    @Override
    protected void drawMouseoverTooltip(DrawContext drawContext, int x, int y) {
        super.drawMouseoverTooltip(drawContext, x, y);

        int toolPosX = this.x + 52;
        int toolPosY = this.y + 14;
        int scrollOffset = this.firstVisibleRecipeIndex + 12;
        CarpentryRecipeDisplay.Grouping availableRecipes = this.handler.getAvailableRecipes();

        for (int l = this.firstVisibleRecipeIndex; l < scrollOffset && l < availableRecipes.size(); ++l) {
            int m = l - this.firstVisibleRecipeIndex;
            int n = toolPosX + m % 4 * 16;
            int o = toolPosY + m / 4 * 18 + 2;
            if (x >= n && x < n + 16 && y >= o && y < o + 18) {
                ContextParameterMap contextParameterMap = SlotDisplayContexts.createParameters(this.client.world);
                SlotDisplay slotDisplay = availableRecipes.entries().get(l).recipe().optionDisplay();
                drawContext.drawItemTooltip(this.textRenderer, slotDisplay.getFirst(contextParameterMap), x, y);
            }
        }
    }

    //TODO: REFACTOR
    private void renderRecipeBackground(DrawContext context, int mouseX, int mouseY, int x, int y, int scrollOffset) {
        for (int i = this.firstVisibleRecipeIndex; i < scrollOffset && i < this.handler.getAvailableRecipeCount(); ++i) {
            int j = i - this.firstVisibleRecipeIndex;
            int k = x + j % 4 * 16;
            int l = j / 4;
            int m = y + l * 18 + 2;

            if (!this.handler.canCraftRecipe(i)) {
                context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, RECIPE_DISABLED_TEXTURE, k, m - 1, 16, 18);
            } else {
                renderRecipeBackgroundForCraftableRecipe(context, i, mouseX, mouseY, k, m);
            }
        }
    }

    private void renderRecipeBackgroundForCraftableRecipe(DrawContext context, int i, int mouseX, int mouseY, int k, int m) {
        Identifier identifier = i == this.handler.getSelectedRecipeIndex() ? RECIPE_SELECTED_TEXTURE :
                (mouseX >= k && mouseY >= m && mouseX < k + 16 && mouseY < m + 18 ? RECIPE_HIGHLIGHTED_TEXTURE : RECIPE_TEXTURE);
        context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, identifier, k, m - 1, 16, 18);
    }

    //TODO: REFACTOR
    private void renderRecipeIcons(DrawContext context, int x, int y, int scrollOffset) {
        CarpentryRecipeDisplay.Grouping availableRecipes = this.handler.getAvailableRecipes();
        ContextParameterMap contextParameterMap = SlotDisplayContexts.createParameters(this.client.world);

        for (int i = this.firstVisibleRecipeIndex; i < scrollOffset && i < availableRecipes.size(); ++i) {
            int yPosWithoutScrollOffset = i - this.firstVisibleRecipeIndex;
            int k = x + yPosWithoutScrollOffset % 4 * 16;
            int l = yPosWithoutScrollOffset / 4;
            int m = y + l * 18 + 2;
            SlotDisplay slotDisplay = (availableRecipes.entries().get(i)).recipe().optionDisplay();
            context.drawItem(slotDisplay.getFirst(contextParameterMap), k, m);
        }
    }

    private void drawScroll(DrawContext context) {
        int yPosAfterScrolling = (int) (41.0f * this.scrollAmount);
        Identifier identifier = this.shouldScroll() ? SCROLLER_TEXTURE : SCROLLER_DISABLED_TEXTURE;
        context.drawGuiTexture(RenderPipelines.GUI_TEXTURED, identifier, x + 119, y + 15 + yPosAfterScrolling, 12, 15);
    }

    private boolean shouldScroll() {
        return (this.handler).getAvailableRecipeCount() > 12;
    }

    protected int getMaxScroll() {
        return ((this.handler).getAvailableRecipeCount() + 4 - 1) / 4 - 3;
    }

    private void onInventoryChange() {
        hasAvailableRecipes = this.handler.hasAvailableRecipes();
        if (!hasAvailableRecipes) {
            this.scrollAmount = 0.0f;
            this.firstVisibleRecipeIndex = 0;
        }
    }
}
