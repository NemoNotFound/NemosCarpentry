package com.devnemo.nemos.carpentry.entity.renderer;


import com.devnemo.nemos.carpentry.entity.ChairEntity;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.state.EntityRenderState;

public class ChairEntityRenderer extends EntityRenderer<ChairEntity, EntityRenderState> {
    public ChairEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public EntityRenderState createRenderState() {
        return new EntityRenderState();
    }


}
