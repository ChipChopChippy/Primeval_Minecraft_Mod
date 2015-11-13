package com.wizcomdata.squifferbear.mob.deinonoychus;

import com.wizcomdata.squifferbear.Main;
import com.wizcomdata.squifferbear.mob.EntityMoaMob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDeinonychusMob extends RenderLiving {
private static final ResourceLocation mobTextures = new ResourceLocation(Main.MODID + ":textures/entity/deinonychus.png");
	
	
	public RenderDeinonychusMob(ModelBase modelBase, float shadowSize) {
		super(modelBase, shadowSize);
	}

	protected ResourceLocation getEntityTexture(EntityDeinonychusMob entity) {
		return mobTextures;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityDeinonychusMob)entity);
	}
}
