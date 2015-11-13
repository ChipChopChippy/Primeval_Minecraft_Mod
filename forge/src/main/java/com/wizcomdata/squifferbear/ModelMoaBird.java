package com.wizcomdata.squifferbear;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelMoaBird extends ModelBase {
	// fields
	ModelRenderer tail;
	ModelRenderer toe2;
	ModelRenderer toe6;
	ModelRenderer toe5;
	ModelRenderer toe4;
	ModelRenderer neck2;
	ModelRenderer moaHead;
	ModelRenderer neck1;
	ModelRenderer beak;
	ModelRenderer body;
	ModelRenderer thigh1;
	ModelRenderer thigh2;
	ModelRenderer leg2;
	ModelRenderer leg1;
	ModelRenderer neck3;
	ModelRenderer foot1;
	ModelRenderer foot2;
	ModelRenderer toe3;
	ModelRenderer toe1;


	public ModelMoaBird() {
		textureWidth = 128;
		textureHeight = 64;

		beak = new ModelRenderer(this, 113, 46);
		beak.addBox(0F, 0F, 0F, 4, 2, 3);
		beak.setRotationPoint(0F, 1.5F, -3F);
		beak.setTextureSize(128, 64);
		beak.mirror = true;
		setRotation(beak, 0F, 0F, 0F);
		moaHead = new ModelRenderer(this, 96, 44);
		moaHead.addBox(0F, 0F, 0F, 4, 4, 4);
		moaHead.setRotationPoint(0F, 0.5F, -3.5F);
		moaHead.setTextureSize(128, 64);
		moaHead.mirror = true;
		setRotation(moaHead, 0.4F, 0.0017453F, 0F);
		neck1 = new ModelRenderer(this, 73, 44);
		neck1.addBox(0F, -1F, 0F, 4, 4, 5);
		neck1.setRotationPoint(0F, -0.5F, -3F);
		neck1.setTextureSize(128, 64);
		neck1.mirror = true;
		setRotation(neck1, -0.3089647F, 0.0017453F, 0F);
		neck2 = new ModelRenderer(this, 25, 43);
		neck2.addBox(0F, 0F, 0F, 4, 5, 8);
		neck2.setRotationPoint(-2.05F, -27F, 7F);
		neck2.setTextureSize(128, 64);
		neck2.mirror = true;
		setRotation(neck2, -1.75F, 0F, 0F);
		neck3 = new ModelRenderer(this, 46, 14);
		neck3.addBox(-2F, -21F, 0F, 4, 8, 6);
		neck3.setRotationPoint(-2.5F, 2F, 6F);
//		neck3.setRotationPoint(-2.5F, 10F, -10F);
		neck3.setTextureSize(128, 64);
		neck3.mirror = true;
		// setRotation(neck3, 1.65F, 0.0017453F, 0F);
		setRotation(neck3, 1.65F, 0.0017453F, 0F);
		body = new ModelRenderer(this, 84, 8);
		body.addBox(-6F, -10F, -7F, 9, 19, 10);
		body.setRotationPoint(-1F, -1F, 2F);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 1.561502F, 0F, 0F);
		thigh1 = new ModelRenderer(this, 0, 17);
		thigh1.addBox(-3F, 0F, -2F, 4, 12, 5);
		thigh1.setRotationPoint(-7F, 1F, 5F);
		thigh1.setTextureSize(128, 64);
		thigh1.mirror = true;
		setRotation(thigh1, -14.911F, 0F, 0F);
		thigh2 = new ModelRenderer(this, 24, 17);
		thigh2.addBox(-1F, 0F, -4F, 4, 12, 5);
		thigh2.setRotationPoint(2F, 1F, 7F);
		thigh2.setTextureSize(128, 64);
		thigh2.mirror = true;
		setRotation(thigh2, -14.911F, 0F, 0F);
		leg1 = new ModelRenderer(this, 25, -2);
		leg1.addBox(-4F, -5F, -4F, 3, 9, 2);
		leg1.setRotationPoint(2F, 15F, 4F); // working legs
		leg1.setTextureSize(128, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.2602503F, 0.0017453F, 0F);
		leg2 = new ModelRenderer(this, 25, -2);
		leg2.addBox(3F, -5F, -4F, 3, 9, 2);
		leg2.setRotationPoint(-4F, 15F, 2F); // working legs
		leg2.setTextureSize(128, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.260246F, -0.0017453F, 0F);
		foot1 = new ModelRenderer(this, 11, 51);
		foot1.addBox(0F, 0F, 0F, 3, 4, 2);
		foot1.setRotationPoint(3F, 3F, -4F);
		foot1.setTextureSize(128, 64);
		foot1.mirror = true;
		setRotation(foot1, -0.5F, 0F, 0F);
		foot2 = new ModelRenderer(this, 11, 51);
		foot2.addBox(-1F, 0F, 0F, 3, 4, 2);
		foot2.setRotationPoint(-3F, 3F, -4F);
		foot2.setTextureSize(128, 64);
		foot2.mirror = true;
		setRotation(foot2, -0.5F, 0F, 0F);
		toe1 = new ModelRenderer(this, 63, 5);
		toe1.addBox(0F, 0F, 0F, 1, 1, 4);
		toe1.setRotationPoint(4F, 3.5F, -3F);
		toe1.setTextureSize(128, 64);
		toe1.mirror = true;
		setRotation(toe1, 0.4461433F, -0.4833219F, 0F);
		toe2 = new ModelRenderer(this, 49, 0);
		toe2.addBox(0F, 0F, 0F, 1, 1, 5);
		toe2.setRotationPoint(1F, 3.5F, -4F);
		toe2.setTextureSize(128, 64);
		toe2.mirror = true;
		setRotation(toe2, 0.3346075F, 0F, 0F);
		toe3 = new ModelRenderer(this, 63, 5);
		toe3.addBox(0F, 0F, 0F, 1, 1, 4);
		toe3.setRotationPoint(-2F, 3.5F, -3F);
		toe3.setTextureSize(128, 64);
		toe3.mirror = true;
		setRotation(toe3, 0.3346075F, 0.4833219F, 0F);
		toe4 = new ModelRenderer(this, 63, 5);
		toe4.addBox(0F, -1F, 0F, 1, 1, 4);
		toe4.setRotationPoint(2F, 4.5F, -2F);
		toe4.setTextureSize(128, 64);
		toe4.mirror = true;
		setRotation(toe4, 0.5948578F, -0.4485186F, 0F);
		toe5 = new ModelRenderer(this, 12, 0);
		toe5.addBox(-3F, 0F, 0F, 1, 1, 5);
		toe5.setRotationPoint(3F, 3.5F, -4F);
		toe5.setTextureSize(128, 64);
		toe5.mirror = true;
		setRotation(toe5, 0.4461411F, 0F, 0F);
		toe6 = new ModelRenderer(this, 63, 5);
		toe6.addBox(0F, 0F, 0F, 1, 1, 4);
		toe6.setRotationPoint(-3F, 3.5F, -2F);
		toe6.setTextureSize(128, 64);
		toe6.mirror = true;
		setRotation(toe6, 0.4833219F, 0.5576792F, 0F);
		tail = new ModelRenderer(this, 50, 28);
		tail.addBox(0F, 16F, 7F, 7, 9, 6);
		tail.setRotationPoint(-6F, -18F, 0F);
		tail.setTextureSize(128, 64);
		tail.mirror = true;
		setRotation(tail, 0F, 0F, 0F);

		// add children
		thigh1.addChild(leg1);
		thigh2.addChild(leg2);
		leg1.addChild(foot2);
		leg2.addChild(foot1);
		foot1.addChild(toe1);
		foot1.addChild(toe2);
		foot1.addChild(toe3);
		foot2.addChild(toe4);
		foot2.addChild(toe5);
		foot2.addChild(toe6);
		neck3.addChild(neck2);
		neck2.addChild(neck1);
		neck1.addChild(moaHead);
		moaHead.addChild(beak);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		neck3.render(f5);
		body.render(f5);
		thigh1.render(f5);
		thigh2.render(f5);
		tail.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	/**
	 * This code governs the movement of the limbs in the animation Sets the
	 * model's various rotation angles. For bipeds, par1 and par2 are used for
	 * animating the movement of arms and legs, where par1 represents the
	 * time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float time, float distance, float f2, float f3, float f4, float f5, Entity entity) {
		// super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		// this.thigh1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f2;
		// this.thigh2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)
		// Math.PI) * 1.4F * f2;
		// this.thigh1.rotateAngleX = MathHelper.cos(f * 0.01F) * 1.4F * f2;
		// this.thigh2.rotateAngleX = MathHelper.cos(f * 0.01F + (float)
		// Math.PI) * 1.4F * f2;
		// this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f2;
		// this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)
		// Math.PI) * 1.4F * f2;

		this.thigh1.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * distance * 0.5F;
		this.thigh2.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.4F * distance * 0.5F;
		this.thigh1.rotateAngleY = 0F;
		this.thigh2.rotateAngleY = 0F;
//		this.neck3.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * (distance * 0.3F) * 0.5F;
		// this.neck3.rotateAngleY = 0F;
		// this.neck3.rotateAngleY = 50F;

	}

	/**
	 * Used for easily adding entity-dependent animations. The second and third
	 * float params here are the same second and third as in the
	 * setRotationAngles method.
	 */
	// @Override
	// public void setLivingAnimations(EntityLivingBase entityLivingBase, float
	// float1, float float2, float float3) {
	// super.setLivingAnimations(entityLivingBase, float1, float2, float3);
	// this.moaHead.rotationPointY = 6.0F + ((EntityMoaMob)
	// entityLivingBase).setMoaTimer(float3) * 9.0F;
	// this.headRotationAngle = ((EntityMoaMob)
	// entityLivingBase).setMoaTimerPitch(float3);
	// }

}
