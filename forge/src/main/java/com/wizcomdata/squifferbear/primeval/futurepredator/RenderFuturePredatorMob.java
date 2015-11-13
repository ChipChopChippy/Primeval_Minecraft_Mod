package com.wizcomdata.squifferbear.primeval.futurepredator;

import com.wizcomdata.squifferbear.Main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderFuturePredatorMob extends RenderLiving {
private static final ResourceLocation mobTextures = new ResourceLocation(Main.MODID + ":textures/entity/futurePredator.png");

	public RenderFuturePredatorMob(ModelBase modelBase, float shadowSize) {
		super(modelBase, shadowSize);
	}

	protected ResourceLocation getEntityTexture(EntityFuturePredatorMob entity) {
		return mobTextures;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityFuturePredatorMob)entity);
	}
}
