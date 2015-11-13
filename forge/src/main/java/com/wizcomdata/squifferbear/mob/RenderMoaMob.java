package com.wizcomdata.squifferbear.mob;

import com.wizcomdata.squifferbear.Main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMoaMob extends RenderLiving {


	private static final ResourceLocation mobTextures = new ResourceLocation(Main.MODID + ":textures/entity/moaBird.png");
	
	
	public RenderMoaMob(ModelBase modelBase, float shadowSize) {
		super(modelBase, shadowSize);
	}

	protected ResourceLocation getEntityTexture(EntityMoaMob entity) {
		return mobTextures;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityMoaMob)entity);
	}

}
