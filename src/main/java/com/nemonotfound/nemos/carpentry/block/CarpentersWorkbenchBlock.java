package com.nemonotfound.nemos.carpentry.block;

import com.mojang.serialization.MapCodec;
import com.nemonotfound.nemos.carpentry.screen.CarpentryScreenHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;

public class CarpentersWorkbenchBlock extends Block {

    public static final MapCodec<CarpentersWorkbenchBlock> CODEC = createCodec(CarpentersWorkbenchBlock::new);
    private static final Text TITLE = Text.translatable(MOD_ID + ".container.carpenters_workbench");

    public CarpentersWorkbenchBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends Block> getCodec() {
        return CODEC;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) {
            player.openHandledScreen(createScreenHandlerFactory(state, world, pos));
            player.incrementStat(Stats.USED.getOrCreateStat(this.asItem()));
        }

        return ActionResult.SUCCESS;
    }

    @Nullable
    protected NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory(
                (syncId, playerInventory, player) ->
                        new CarpentryScreenHandler(syncId, playerInventory, ScreenHandlerContext.create(world, pos)), TITLE);
    }
}
