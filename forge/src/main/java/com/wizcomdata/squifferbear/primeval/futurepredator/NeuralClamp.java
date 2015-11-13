package com.wizcomdata.squifferbear.primeval.futurepredator;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class NeuralClamp extends ModelBase {
	// fields
	ModelRenderer transmitter;
	ModelRenderer wire1;
	ModelRenderer wire2;
	ModelRenderer clamp1;
	ModelRenderer clamp2;

	public NeuralClamp() {
		textureWidth = 64;
		textureHeight = 32;

		transmitter = new ModelRenderer(this, 0, 0);
		transmitter.addBox(0F, 0F, 0F, 3, 2, 3);
		transmitter.setRotationPoint(-1F, 19F, -2F);
		transmitter.setTextureSize(64, 32);
		transmitter.mirror = true;
		setRotation(transmitter, 0F, 0F, 0F);
		wire1 = new ModelRenderer(this, 0, 21);
		wire1.addBox(0F, 0F, 0F, 1, 1, 2);
		wire1.setRotationPoint(0.6F, 19.3F, 0.7F);
		wire1.setTextureSize(64, 32);
		wire1.mirror = true;
		setRotation(wire1, 0F, 0.3839724F, 0F);
		wire2 = new ModelRenderer(this, 0, 21);
		wire2.addBox(0F, 0F, 0F, 1, 1, 2);
		wire2.setRotationPoint(-0.5F, 19.3F, 0.3F);
		wire2.setTextureSize(64, 32);
		wire2.mirror = true;
		setRotation(wire2, 0F, -0.3839724F, 0F);
		clamp1 = new ModelRenderer(this, 0, 13);
		clamp1.addBox(0F, 0F, 0F, 1, 1, 1);
		clamp1.setRotationPoint(1.25F, 20.25F, 2.3F);
		clamp1.setTextureSize(64, 32);
		clamp1.mirror = true;
		setRotation(clamp1, 1.291544F, 0.3839724F, 0F);
		clamp2 = new ModelRenderer(this, 0, 13);
		clamp2.addBox(0F, 0F, 0F, 1, 1, 1);
		clamp2.setRotationPoint(-1.15F, 20.25F, 1.9F);
		clamp2.setTextureSize(64, 32);
		clamp2.mirror = true;
		setRotation(clamp2, 1.291544F, -0.3839724F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		transmitter.render(f5);
		wire1.render(f5);
		wire2.render(f5);
		clamp1.render(f5);
		clamp2.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
