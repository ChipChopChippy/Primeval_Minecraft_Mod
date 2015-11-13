package com.wizcomdata.squifferbear.deinonychus;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDeinonychus extends ModelBase {

	// fields
	ModelRenderer nose1;
	ModelRenderer face;
	ModelRenderer head;
	ModelRenderer top;
	ModelRenderer noseTop;
	ModelRenderer jaw1;
	ModelRenderer jaw2;
	ModelRenderer eye1;
	ModelRenderer eye2;
	ModelRenderer brow1;
	ModelRenderer brow2;
	ModelRenderer tooth1;
	ModelRenderer neck1;
	ModelRenderer headTop;
	ModelRenderer neck2_1; // 1neck2
	ModelRenderer chest1;
	ModelRenderer body;
	ModelRenderer arm1;
	ModelRenderer forearm1;
	ModelRenderer claw1;
	ModelRenderer thigh1;
	ModelRenderer leg1;
	ModelRenderer shin1;
	ModelRenderer foot1;
	ModelRenderer tail1;
	ModelRenderer tail2_2; // 2tail2
	ModelRenderer tail3;
	ModelRenderer tail4;
	ModelRenderer chest2;
	ModelRenderer thigh2;
	ModelRenderer leg2;
	ModelRenderer shin2;
	ModelRenderer tail5;
	ModelRenderer foot2;
	ModelRenderer claw2;
	ModelRenderer claw3;
	ModelRenderer arm2;
	ModelRenderer forearm2;
	ModelRenderer claw4;
	ModelRenderer claw5;
	ModelRenderer claw6;
	ModelRenderer nose2;
	ModelRenderer neck2_2; // 2neck2
	ModelRenderer tail2_1; // 1tail2
	ModelRenderer toe2;
	ModelRenderer toe1;
	ModelRenderer bigClaw2;
	ModelRenderer bigClaw1;
	ModelRenderer tooth2;
	ModelRenderer tooth3;
	ModelRenderer tooth4;
	ModelRenderer tooth5;
	ModelRenderer tooth6;
	ModelRenderer feather1;
	ModelRenderer feather2;
	ModelRenderer feather3;
	ModelRenderer feather4;
	ModelRenderer feather5;
	ModelRenderer feather6;
	ModelRenderer feather7;
	ModelRenderer feather8;
	ModelRenderer feather9;
	ModelRenderer feather10;
	ModelRenderer feather11;
	ModelRenderer feather12;
	ModelRenderer feather13;
	ModelRenderer feather14;
	ModelRenderer feather15;
	ModelRenderer feather16;
	ModelRenderer feather17;
	ModelRenderer feather18;
	ModelRenderer feather19;
	ModelRenderer feather20;
	ModelRenderer feather21;
	ModelRenderer feather22;
	ModelRenderer feather23;
	ModelRenderer srfeather1;
	ModelRenderer slfeather1;
	ModelRenderer srfeather2;
	ModelRenderer srfeather3;
	ModelRenderer srfeather4;
	ModelRenderer srfeather5;
	ModelRenderer srfeather6;
	ModelRenderer slfeather2;
	ModelRenderer slfeather3;
	ModelRenderer slfeather4;
	ModelRenderer slfeather5;
	ModelRenderer slfeather6;

	public ModelDeinonychus() {
		textureWidth = 256;
		textureHeight = 128;
		nose1 = new ModelRenderer(this, 50, 36);
		nose1.addBox(0F, 0F, 0F, 1, 1, 1);
		nose1.setRotationPoint(0F, 1F, -25.8F);
		nose1.setTextureSize(256, 128);
		nose1.mirror = true;
		setRotation(nose1, 0F, 0F, 0F);
		face = new ModelRenderer(this, 51, 50);
		face.addBox(0F, 0F, 0F, 2, 3, 5);
		face.setRotationPoint(-0.5F, -1F, -25F);
		face.setTextureSize(256, 128);
		face.mirror = true;
		setRotation(face, 0F, 0F, 0F);
		head = new ModelRenderer(this, 74, 36);
		head.addBox(0F, 0F, 0F, 3, 3, 1);
		head.setRotationPoint(-1F, -1F, -20F);
		head.setTextureSize(256, 128);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		top = new ModelRenderer(this, 14, 14);
		top.addBox(0F, 0F, 0F, 1, 1, 5);
		top.setRotationPoint(0F, -1.3F, -24F);
		top.setTextureSize(256, 128);
		top.mirror = true;
		setRotation(top, 0F, 0F, 0F);
		noseTop = new ModelRenderer(this, 50, 32);
		noseTop.addBox(0F, 0F, 0F, 1, 1, 1);
		noseTop.setRotationPoint(0F, -0.3F, -25.8F);
		noseTop.setTextureSize(256, 128);
		noseTop.mirror = true;
		setRotation(noseTop, 0F, 0F, 0F);
		jaw1 = new ModelRenderer(this, 55, 40);
		jaw1.addBox(0F, 0F, 0F, 1, 1, 6);
		jaw1.setRotationPoint(-0.15F, 1.7F, -24.7F);
		jaw1.setTextureSize(256, 128);
		jaw1.mirror = true;
		setRotation(jaw1, -0.0523599F, 0F, 0F);
		jaw2 = new ModelRenderer(this, 55, 40);
		jaw2.addBox(0F, 0F, 0F, 1, 1, 6);
		jaw2.setRotationPoint(0.15F, 1.7F, -24.7F);
		jaw2.setTextureSize(256, 128);
		jaw2.mirror = true;
		setRotation(jaw2, -0.0523599F, 0F, 0F);
		eye1 = new ModelRenderer(this, 0, 9);
		eye1.addBox(0F, 0F, 0F, 1, 1, 1);
		eye1.setRotationPoint(0.8F, 0F, -20.5F);
		eye1.setTextureSize(256, 128);
		eye1.mirror = true;
		setRotation(eye1, 0F, 0F, 0F);
		eye2 = new ModelRenderer(this, 0, 9);
		eye2.addBox(0F, 0F, 0F, 1, 1, 1);
		eye2.setRotationPoint(-0.8F, 0F, -20.5F);
		eye2.setTextureSize(256, 128);
		eye2.mirror = true;
		setRotation(eye2, 0F, 0F, 0F);
		brow1 = new ModelRenderer(this, 44, 43);
		brow1.addBox(0F, 0F, 0F, 1, 1, 3);
		brow1.setRotationPoint(0.7F, -1.1F, -22.9F);
		brow1.setTextureSize(256, 128);
		brow1.mirror = true;
		setRotation(brow1, 0F, 0.1047198F, 0F);
		brow2 = new ModelRenderer(this, 44, 43);
		brow2.addBox(0F, 0F, 0F, 1, 1, 3);
		brow2.setRotationPoint(-0.7F, -1.1F, -23F);
		brow2.setTextureSize(256, 128);
		brow2.mirror = true;
		setRotation(brow2, 0F, -0.1047198F, 0F);
		tooth1 = new ModelRenderer(this, 8, 0);
		tooth1.addBox(0F, 0F, 0F, 0, 1, 1);
		tooth1.setRotationPoint(1.3F, 1.8F, -25F);
		tooth1.setTextureSize(256, 128);
		tooth1.mirror = true;
		setRotation(tooth1, 0.7853982F, 0F, 0F);
		neck1 = new ModelRenderer(this, 71, 22);
		neck1.addBox(0F, 0F, 0F, 3, 5, 5);
		neck1.setRotationPoint(-1F, -2F, -19F);
		neck1.setTextureSize(256, 128);
		neck1.mirror = true;
		setRotation(neck1, 0F, 0F, 0F);
		headTop = new ModelRenderer(this, 16, 9);
		headTop.addBox(0F, 0F, 0F, 2, 1, 2);
		headTop.setRotationPoint(-0.5F, -1.5F, -21F);
		headTop.setTextureSize(256, 128);
		headTop.mirror = true;
		setRotation(headTop, 0.122173F, 0F, 0F);
		neck2_1 = new ModelRenderer(this, 90, 21);
		neck2_1.addBox(0F, 0F, 0F, 3, 5, 7);
		neck2_1.setRotationPoint(-1.1F, -2F, -14F);
		neck2_1.setTextureSize(256, 128);
		neck2_1.mirror = true;
		setRotation(neck2_1, -0.5585054F, 0F, 0F);
		chest1 = new ModelRenderer(this, 0, 14);
		chest1.addBox(0F, 0F, 0F, 1, 3, 3);
		chest1.setRotationPoint(-1.7F, 6.6F, -11.5F);
		chest1.setTextureSize(256, 128);
		chest1.mirror = true;
		setRotation(chest1, 0.2268928F, 0F, 0F);
		body = new ModelRenderer(this, 0, 102);
		body.addBox(0F, 0F, 0F, 4, 7, 18);
		body.setRotationPoint(-1.5F, 1.5F, -11F);
		body.setTextureSize(256, 128);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		arm1 = new ModelRenderer(this, 40, 0);
		arm1.addBox(0F, 0F, 0F, 2, 4, 2);
		arm1.setRotationPoint(-2F, 8F, -11F);
		arm1.setTextureSize(256, 128);
		arm1.mirror = true;
		setRotation(arm1, 0.3141593F, 0F, 0F);
		forearm1 = new ModelRenderer(this, 31, 0);
		forearm1.addBox(0F, 0F, 0F, 2, 4, 2);
		forearm1.setRotationPoint(-2F, 9.8F, -9.4F);
		forearm1.setTextureSize(256, 128);
		forearm1.mirror = true;
		setRotation(forearm1, -0.8028515F, 0F, 0.005236F);
		claw1 = new ModelRenderer(this, 0, 0);
		claw1.addBox(0F, 0F, 0F, 1, 1, 2);
		claw1.setRotationPoint(-1.3F, 12F, -13.2F);
		claw1.setTextureSize(256, 128);
		claw1.mirror = true;
		setRotation(claw1, -0.2268928F, -0.1919862F, 0F);
		thigh1 = new ModelRenderer(this, 50, 0);
		thigh1.addBox(0F, 0F, 0F, 3, 9, 4);
		thigh1.setRotationPoint(-3.3F, 3F, 2F);
		thigh1.setTextureSize(256, 128);
		thigh1.mirror = true;
		setRotation(thigh1, -0.1570796F, 0F, 0F);
		thigh2 = new ModelRenderer(this, 50, 0);
		thigh2.addBox(0F, 0F, 0F, 3, 9, 4);
		thigh2.setRotationPoint(1F, 3F, 2F);
		thigh2.setTextureSize(256, 128);
		thigh2.mirror = true;
		setRotation(thigh2, -0.1570796F, 0F, 0F);
		thigh2.mirror = true;
		leg1 = new ModelRenderer(this, 66, 0);
		leg1.addBox(0F, 0F, 0F, 2, 9, 3);
		leg1.setRotationPoint(0.5F, 8F, 1F);
//		leg1.setRotationPoint(-2.8F, 11F, 1F);
		leg1.setTextureSize(256, 128);
		leg1.mirror = true;
		leg2 = new ModelRenderer(this, 66, 0);
		leg2.addBox(0F, 0F, 0F, 2, 9, 3);
		leg2.setRotationPoint(0.5F, 8F, 1F);
//		leg2.setRotationPoint(1.5F, 11F, 1F);
		leg2.setTextureSize(256, 128);
		leg2.mirror = true;
		setRotation(leg2, 0.5235988F, 0F, -0.005236F);
		leg2.mirror = true;
		setRotation(leg1, 0.5235988F, 0F, 0.005236F);
		shin1 = new ModelRenderer(this, 78, 0);
		shin1.addBox(0F, 0F, 0F, 2, 6, 2);
		shin1.setRotationPoint(0F, 7.5F, 1.0F);
//		shin1.setRotationPoint(-2.8F, 17F, 5.6F);
		shin1.setTextureSize(256, 128);
		shin1.mirror = true;
		setRotation(shin1, -0.5F, 0F, 0F);
		shin2 = new ModelRenderer(this, 78, 0);
		shin2.addBox(0F, 0F, 0F, 2, 6, 2);
		shin2.setRotationPoint(0F, 7.5F, 1.0F);
//		shin2.setRotationPoint(1.5F, 17F, 5.5F);
		shin2.setTextureSize(256, 128);
		shin2.mirror = true;
		setRotation(shin2, -0.5F, 0F, 0F);
		foot1 = new ModelRenderer(this, 90, 0);
		foot1.addBox(0F, 0F, 0F, 2, 1, 4);
		foot1.setRotationPoint(0.0F, 6F, -2.0F);
		foot1.setTextureSize(256, 128);
		foot1.mirror = true;
		setRotation(foot1, 0F, 0F, 0F);
		foot2 = new ModelRenderer(this, 90, 0);
		foot2.addBox(0F, 0F, 0F, 2, 1, 4);
		foot2.setRotationPoint(0.0F, 6F, -2.0F);
		foot2.setTextureSize(256, 128);
		foot2.mirror = true;
		setRotation(foot2, 0F, 0F, 0F);
		foot2.mirror = true;
		toe1 = new ModelRenderer(this, 94, 6);
		toe1.addBox(0F, 0F, 0F, 1, 2, 1);
		toe1.setRotationPoint(1.5F, -1F, 0.5F);
		toe1.setTextureSize(256, 128);
		toe1.mirror = true;
		setRotation(toe1, 0.5759587F, 0F, 0F);
		toe2 = new ModelRenderer(this, 94, 6);
		toe2.addBox(0F, 0F, 0F, 1, 2, 1);
		toe2.setRotationPoint(-0.5F, -1F, 0.5F);
		toe2.setTextureSize(256, 128);
		toe2.mirror = true;
		setRotation(toe2, 0.5759587F, 0F, 0F);
		bigClaw1 = new ModelRenderer(this, 94, 11);
		bigClaw1.addBox(0F, 0F, 0F, 1, 1, 2);
		bigClaw1.setRotationPoint(0.0F, 0.0F, -1.5F);
		bigClaw1.setTextureSize(256, 128);
		bigClaw1.mirror = true;
		setRotation(bigClaw1, 0.3839724F, 0.0017453F, 0F);
		bigClaw2 = new ModelRenderer(this, 94, 11);
		bigClaw2.addBox(0F, 0F, 0F, 1, 1, 2);
		bigClaw2.setRotationPoint(0.0F, 0.0F, -1.5F);
		bigClaw2.setTextureSize(256, 128);
		bigClaw2.mirror = true;
		setRotation(bigClaw2, 0.3490659F, -0.0017453F, 0F);
		tail1 = new ModelRenderer(this, 0, 90);
		tail1.addBox(0F, 0F, 0F, 4, 6, 5);
		tail1.setRotationPoint(-1.5F, 1.5F, 6.8F);
		tail1.setTextureSize(256, 128);
		tail1.mirror = true;
		setRotation(tail1, 0.0349066F, 0F, 0F);
		tail2_2 = new ModelRenderer(this, 0, 76);
		tail2_2.addBox(0F, 0F, 0F, 3, 5, 8);
		tail2_2.setRotationPoint(-1.4F, 1.5F, 11.5F);
		tail2_2.setTextureSize(256, 128);
		tail2_2.mirror = true;
		setRotation(tail2_2, 0F, 0F, 0F);
		tail3 = new ModelRenderer(this, 0, 58);
		tail3.addBox(0F, 0F, 0F, 3, 4, 13);
		tail3.setRotationPoint(-1F, 1.7F, 19F);
		tail3.setTextureSize(256, 128);
		tail3.mirror = true;
		setRotation(tail3, -0.0349066F, 0F, 0F);
		tail4 = new ModelRenderer(this, 0, 36);
		tail4.addBox(0F, 0F, 0F, 2, 3, 18);
		tail4.setRotationPoint(-0.5F, 2.5F, 32F);
		tail4.setTextureSize(256, 128);
		tail4.mirror = true;
		setRotation(tail4, -0.0698132F, 0F, 0F);
		chest2 = new ModelRenderer(this, 0, 14);
		chest2.addBox(0F, 0F, 0F, 1, 3, 3);
		chest2.setRotationPoint(1.7F, 6.6F, -11.5F);
		chest2.setTextureSize(256, 128);
		chest2.mirror = true;
		setRotation(chest2, 0.2268928F, 0F, 0F);
		tail5 = new ModelRenderer(this, 0, 22);
		tail5.addBox(0F, 0F, 0F, 1, 2, 11);
		tail5.setRotationPoint(0F, 4F, 49F);
		tail5.setTextureSize(256, 128);
		tail5.mirror = true;
		setRotation(tail5, -0.0872665F, 0F, 0F);
		claw2 = new ModelRenderer(this, 0, 0);
		claw2.addBox(0F, 0F, 0F, 1, 1, 2);
		claw2.setRotationPoint(-1.3F, 13.3F, -13.5F);
		claw2.setTextureSize(256, 128);
		claw2.mirror = true;
		setRotation(claw2, 0.3141593F, -0.1919862F, 0F);
		claw3 = new ModelRenderer(this, 0, 0);
		claw3.addBox(0F, 0F, 0F, 1, 1, 2);
		claw3.setRotationPoint(-1.3F, 14.4F, -13F);
		claw3.setTextureSize(256, 128);
		claw3.mirror = true;
		setRotation(claw3, 0.7504916F, -0.1919862F, 0F);
		arm2 = new ModelRenderer(this, 40, 0);
		arm2.addBox(0F, 0F, 0F, 2, 4, 2);
		arm2.setRotationPoint(1F, 8F, -11F);
		arm2.setTextureSize(256, 128);
		arm2.mirror = true;
		setRotation(arm2, 0.3141593F, 0F, 0F);
		forearm2 = new ModelRenderer(this, 31, 0);
		forearm2.addBox(0F, 0F, 0F, 2, 4, 2);
		forearm2.setRotationPoint(1F, 9.8F, -9.4F);
		forearm2.setTextureSize(256, 128);
		forearm2.mirror = true;
		setRotation(forearm2, -0.8028515F, 0F, -0.005236F);
		claw4 = new ModelRenderer(this, 0, 0);
		claw4.addBox(0F, 0F, 0F, 1, 1, 2);
		claw4.setRotationPoint(1.3F, 12F, -13F);
		claw4.setTextureSize(256, 128);
		claw4.mirror = true;
		setRotation(claw4, -0.2268928F, 0.1919862F, 0F);
		claw5 = new ModelRenderer(this, 0, 0);
		claw5.addBox(0F, 0F, 0F, 1, 1, 2);
		claw5.setRotationPoint(1.3F, 13.3F, -13.3F);
		claw5.setTextureSize(256, 128);
		claw5.mirror = true;
		setRotation(claw5, 0.3141593F, 0.1919862F, 0F);
		claw6 = new ModelRenderer(this, 0, 0);
		claw6.addBox(0F, 0F, 0F, 1, 1, 2);
		claw6.setRotationPoint(1.3F, 14.4F, -12.8F);
		claw6.setTextureSize(256, 128);
		claw6.mirror = true;
		setRotation(claw6, 0.7504916F, 0.1919862F, 0F);
		nose2 = new ModelRenderer(this, 50, 36);
		nose2.addBox(0F, 0F, 0F, 1, 1, 1);
		nose2.setRotationPoint(0F, 0.7F, -25.8F);
		nose2.setTextureSize(256, 128);
		nose2.mirror = true;
		setRotation(nose2, 0F, 0F, 0F);
		neck2_2 = new ModelRenderer(this, 90, 21);
		neck2_2.addBox(0F, 0F, 0F, 3, 5, 7);
		neck2_2.setRotationPoint(-0.9F, -2F, -14F);
		neck2_2.setTextureSize(256, 128);
		neck2_2.mirror = true;
		setRotation(neck2_2, -0.5585054F, 0F, 0F);
		tail2_1 = new ModelRenderer(this, 0, 76);
		tail2_1.addBox(0F, 0F, 0F, 3, 5, 8);
		tail2_1.setRotationPoint(-0.6F, 1.5F, 11.5F);
		tail2_1.setTextureSize(256, 128);
		tail2_1.mirror = true;
		setRotation(tail2_1, 0F, 0F, 0F);
		
		tooth2 = new ModelRenderer(this, 8, 0);
		tooth2.addBox(0F, 0F, 0F, 0, 1, 1);
		tooth2.setRotationPoint(1.3F, 1.8F, -22F);
		tooth2.setTextureSize(256, 128);
		tooth2.mirror = true;
		setRotation(tooth2, 0.7853982F, 3.141593F, 0F);
		tooth3 = new ModelRenderer(this, 8, 0);
		tooth3.addBox(0F, 0F, 0F, 0, 1, 1);
		tooth3.setRotationPoint(1.3F, 1.8F, -21.5F);
		tooth3.setTextureSize(256, 128);
		tooth3.mirror = true;
		setRotation(tooth3, 0.7853982F, 0F, 0F);
		tooth4 = new ModelRenderer(this, 8, 0);
		tooth4.addBox(0F, 0F, 0F, 0, 1, 1);
		tooth4.setRotationPoint(-0.3F, 1.8F, -25F);
		tooth4.setTextureSize(256, 128);
		tooth4.mirror = true;
		setRotation(tooth4, 0.7853982F, 0F, 0F);
		tooth5 = new ModelRenderer(this, 8, 0);
		tooth5.addBox(0F, 0F, 0F, 0, 1, 1);
		tooth5.setRotationPoint(-0.3F, 1.8F, -23.5F);
		tooth5.setTextureSize(256, 128);
		tooth5.mirror = true;
		setRotation(tooth5, 0.7853982F, 0F, 0F);
		tooth6 = new ModelRenderer(this, 8, 0);
		tooth6.addBox(0F, 0F, 0F, 0, 1, 1);
		tooth6.setRotationPoint(-0.3F, 1.8F, -21.5F);
		tooth6.setTextureSize(256, 128);
		tooth6.mirror = true;
		setRotation(tooth6, 0.7853982F, 0F, 0F);
		feather1 = new ModelRenderer(this, 14, 0);
		feather1.addBox(0F, 0F, 0F, 1, 2, 0);
		feather1.setRotationPoint(1F, -3.3F, -16F);
		feather1.setTextureSize(256, 128);
		feather1.mirror = true;
		setRotation(feather1, -0.7853982F, 0F, 0F);
		feather2 = new ModelRenderer(this, 14, 0);
		feather2.addBox(0F, 0F, 0F, 1, 2, 0);
		feather2.setRotationPoint(0F, -3.3F, -17F);
		feather2.setTextureSize(256, 128);
		feather2.mirror = true;
		setRotation(feather2, -0.7853982F, 0F, 0F);
		feather3 = new ModelRenderer(this, 14, 0);
		feather3.addBox(0F, 0F, 0F, 1, 2, 0);
		feather3.setRotationPoint(-1F, -3.3F, -16F);
		feather3.setTextureSize(256, 128);
		feather3.mirror = true;
		setRotation(feather3, -0.7853982F, 0F, 0F);
		feather4 = new ModelRenderer(this, 14, 0);
		feather4.addBox(0F, 0F, 0F, 1, 2, 0);
		feather4.setRotationPoint(0F, -3.3F, -15F);
		feather4.setTextureSize(256, 128);
		feather4.mirror = true;
		setRotation(feather4, -0.7853982F, 0F, 0F);
		feather5 = new ModelRenderer(this, 14, 0);
		feather5.addBox(0F, 0F, 0F, 1, 2, 0);
		feather5.setRotationPoint(-1F, -3.3F, -14F);
		feather5.setTextureSize(256, 128);
		feather5.mirror = true;
		setRotation(feather5, -0.7853982F, 0F, 0F);
		feather6 = new ModelRenderer(this, 14, 0);
		feather6.addBox(0F, 0F, 0F, 1, 2, 0);
		feather6.setRotationPoint(1F, -3.3F, -14F);
		feather6.setTextureSize(256, 128);
		feather6.mirror = true;
		setRotation(feather6, -0.7853982F, 0F, 0F);
		feather7 = new ModelRenderer(this, 14, 0);
		feather7.addBox(0F, 0F, 0F, 1, 2, 0);
		feather7.setRotationPoint(0F, -3.3F, -13F);
		feather7.setTextureSize(256, 128);
		feather7.mirror = true;
		setRotation(feather7, -0.7853982F, 0F, 0F);
		feather8 = new ModelRenderer(this, 14, 0);
		feather8.addBox(0F, 0F, 0F, 1, 2, 0);
		feather8.setRotationPoint(0F, -2.3F, -12F);
		feather8.setTextureSize(256, 128);
		feather8.mirror = true;
		setRotation(feather8, -0.7853982F, 0F, 0F);
		feather9 = new ModelRenderer(this, 14, 0);
		feather9.addBox(0F, 0F, 0F, 1, 2, 0);
		feather9.setRotationPoint(0F, -1.6F, -11F);
		feather9.setTextureSize(256, 128);
		feather9.mirror = true;
		setRotation(feather9, -0.7853982F, 0F, 0F);
		feather10 = new ModelRenderer(this, 14, 0);
		feather10.addBox(0F, 0F, 0F, 1, 2, 0);
		feather10.setRotationPoint(0F, -1F, -10F);
		feather10.setTextureSize(256, 128);
		feather10.mirror = true;
		setRotation(feather10, -0.7853982F, 0F, 0F);
		feather11 = new ModelRenderer(this, 14, 0);
		feather11.addBox(0F, 0F, 0F, 1, 2, 0);
		feather11.setRotationPoint(0F, -0.5F, -9F);
		feather11.setTextureSize(256, 128);
		feather11.mirror = true;
		setRotation(feather11, -0.7853982F, 0F, 0F);
		feather12 = new ModelRenderer(this, 14, 0);
		feather12.addBox(0F, 0F, 0F, 1, 2, 0);
		feather12.setRotationPoint(0F, 0F, -8F);
		feather12.setTextureSize(256, 128);
		feather12.mirror = true;
		setRotation(feather12, -0.7853982F, 0F, 0F);
		feather13 = new ModelRenderer(this, 14, 0);
		feather13.addBox(0F, 0F, 0F, 1, 2, 0);
		feather13.setRotationPoint(0F, 0.5F, -7F);
		feather13.setTextureSize(256, 128);
		feather13.mirror = true;
		setRotation(feather13, -0.7853982F, 0F, 0F);
		feather14 = new ModelRenderer(this, 14, 0);
		feather14.addBox(0F, 0F, 0F, 1, 2, 0);
		feather14.setRotationPoint(0F, 0.5F, -5F);
		feather14.setTextureSize(256, 128);
		feather14.mirror = true;
		setRotation(feather14, -0.7853982F, 0F, 0F);
		feather15 = new ModelRenderer(this, 14, 0);
		feather15.addBox(0F, 0F, 0F, 1, 2, 0);
		feather15.setRotationPoint(0F, 0.5F, -3F);
		feather15.setTextureSize(256, 128);
		feather15.mirror = true;
		setRotation(feather15, -0.7853982F, 0F, 0F);
		feather16 = new ModelRenderer(this, 14, 0);
		feather16.addBox(0F, 0F, 0F, 1, 2, 0);
		feather16.setRotationPoint(0F, 0.5F, -1F);
		feather16.setTextureSize(256, 128);
		feather16.mirror = true;
		setRotation(feather16, -0.7853982F, 0F, 0F);
		feather17 = new ModelRenderer(this, 14, 0);
		feather17.addBox(0F, 0F, 0F, 1, 2, 0);
		feather17.setRotationPoint(0F, 0.5F, 1F);
		feather17.setTextureSize(256, 128);
		feather17.mirror = true;
		setRotation(feather17, -0.7853982F, 0F, 0F);
		feather18 = new ModelRenderer(this, 14, 0);
		feather18.addBox(0F, 0F, 0F, 1, 2, 0);
		feather18.setRotationPoint(0F, 0.5F, 3F);
		feather18.setTextureSize(256, 128);
		feather18.mirror = true;
		setRotation(feather18, -0.7853982F, 0F, 0F);
		feather19 = new ModelRenderer(this, 14, 0);
		feather19.addBox(0F, 0F, 0F, 1, 2, 0);
		feather19.setRotationPoint(0F, 0.5F, 5F);
		feather19.setTextureSize(256, 128);
		feather19.mirror = true;
		setRotation(feather19, -0.7853982F, 0F, 0F);
		feather20 = new ModelRenderer(this, 14, 0);
		feather20.addBox(0F, 0F, 0F, 1, 2, 0);
		feather20.setRotationPoint(0F, 0.5F, 7F);
		feather20.setTextureSize(256, 128);
		feather20.mirror = true;
		setRotation(feather20, -0.7853982F, 0F, 0F);
		feather21 = new ModelRenderer(this, 14, 0);
		feather21.addBox(0F, 0F, 0F, 1, 2, 0);
		feather21.setRotationPoint(0F, 0.5F, 9F);
		feather21.setTextureSize(256, 128);
		feather21.mirror = true;
		setRotation(feather21, -0.7853982F, 0F, 0F);
		feather22 = new ModelRenderer(this, 14, 0);
		feather22.addBox(0F, 0F, 0F, 1, 2, 0);
		feather22.setRotationPoint(0F, 0.5F, 11F);
		feather22.setTextureSize(256, 128);
		feather22.mirror = true;
		setRotation(feather22, -0.7853982F, 0F, 0F);
		feather23 = new ModelRenderer(this, 14, 0);
		feather23.addBox(0F, 0F, 0F, 1, 2, 0);
		feather23.setRotationPoint(0F, 0.8F, 13F);
		feather23.setTextureSize(256, 128);
		feather23.mirror = true;
		setRotation(feather23, -0.7853982F, 0F, 0F);
		srfeather1 = new ModelRenderer(this, 14, 0);
		srfeather1.addBox(0F, 0F, 0F, 1, 2, 0);
		srfeather1.setRotationPoint(-2.7F, 3F, -9F);
		srfeather1.setTextureSize(256, 128);
		srfeather1.mirror = true;
		setRotation(srfeather1, -1.58825F, -0.7853982F, -0.8203047F);
		slfeather1 = new ModelRenderer(this, 14, 0);
		slfeather1.addBox(0F, 0F, 0F, 1, 2, 0);
		slfeather1.setRotationPoint(3.3F, 2.3F, -8.5F);
		slfeather1.setTextureSize(256, 128);
		slfeather1.mirror = true;
		setRotation(slfeather1, -1.58825F, 0.7853982F, 0.7853982F);
		srfeather2 = new ModelRenderer(this, 14, 0);
		srfeather2.addBox(0F, 0F, 0F, 1, 2, 0);
		srfeather2.setRotationPoint(-2.7F, 5F, -8.5F);
		srfeather2.setTextureSize(256, 128);
		srfeather2.mirror = true;
		setRotation(srfeather2, -1.58825F, -0.7853982F, -0.8203047F);
		srfeather3 = new ModelRenderer(this, 14, 0);
		srfeather3.addBox(0F, 0F, 0F, 1, 2, 0);
		srfeather3.setRotationPoint(-2.7F, 3.5F, -7F);
		srfeather3.setTextureSize(256, 128);
		srfeather3.mirror = true;
		setRotation(srfeather3, -1.58825F, -0.7853982F, -0.8203047F);
		srfeather4 = new ModelRenderer(this, 14, 0);
		srfeather4.addBox(0F, 0F, 0F, 1, 2, 0);
		srfeather4.setRotationPoint(-2.7F, 3F, -5F);
		srfeather4.setTextureSize(256, 128);
		srfeather4.mirror = true;
		setRotation(srfeather4, -1.58825F, -0.7853982F, -0.8203047F);
		srfeather5 = new ModelRenderer(this, 14, 0);
		srfeather5.addBox(0F, 0F, 0F, 1, 2, 0);
		srfeather5.setRotationPoint(-2.7F, 5F, -5F);
		srfeather5.setTextureSize(256, 128);
		srfeather5.mirror = true;
		setRotation(srfeather5, -1.58825F, -0.7853982F, -0.8203047F);
		srfeather6 = new ModelRenderer(this, 14, 0);
		srfeather6.addBox(0F, 0F, 0F, 1, 2, 0);
		srfeather6.setRotationPoint(-2.7F, 3.5F, -3F);
		srfeather6.setTextureSize(256, 128);
		srfeather6.mirror = true;
		setRotation(srfeather6, -1.58825F, -0.7853982F, -0.8203047F);
		slfeather2 = new ModelRenderer(this, 14, 0);
		slfeather2.addBox(0F, 0F, 0F, 1, 2, 0);
		slfeather2.setRotationPoint(3.3F, 3F, -6.5F);
		slfeather2.setTextureSize(256, 128);
		slfeather2.mirror = true;
		setRotation(slfeather2, -1.58825F, 0.7853982F, 0.7853982F);
		slfeather3 = new ModelRenderer(this, 14, 0);
		slfeather3.addBox(0F, 0F, 0F, 1, 2, 0);
		slfeather3.setRotationPoint(3.3F, 4.5F, -8F);
		slfeather3.setTextureSize(256, 128);
		slfeather3.mirror = true;
		setRotation(slfeather3, -1.58825F, 0.7853982F, 0.7853982F);
		slfeather4 = new ModelRenderer(this, 14, 0);
		slfeather4.addBox(0F, 0F, 0F, 1, 2, 0);
		slfeather4.setRotationPoint(3.3F, 2F, -4.5F);
		slfeather4.setTextureSize(256, 128);
		slfeather4.mirror = true;
		setRotation(slfeather4, -1.58825F, 0.7853982F, 0.7853982F);
		slfeather5 = new ModelRenderer(this, 14, 0);
		slfeather5.addBox(0F, 0F, 0F, 1, 2, 0);
		slfeather5.setRotationPoint(3.3F, 2.5F, -2.5F);
		slfeather5.setTextureSize(256, 128);
		slfeather5.mirror = true;
		setRotation(slfeather5, -1.58825F, 0.7853982F, 0.7853982F);
		slfeather6 = new ModelRenderer(this, 14, 0);
		slfeather6.addBox(0F, 0F, 0F, 1, 2, 0);
		slfeather6.setRotationPoint(3.3F, 4F, -4.4F);
		slfeather6.setTextureSize(256, 128);
		slfeather6.mirror = true;
		setRotation(slfeather6, -1.58825F, 0.7853982F, 0.7853982F);
		
		thigh1.addChild(leg1);
		thigh2.addChild(leg2);
		leg1.addChild(shin1);
		leg2.addChild(shin2);
		shin1.addChild(foot1);
		shin2.addChild(foot2);
		foot1.addChild(toe1);
		foot2.addChild(toe2);
		toe1.addChild(bigClaw1);
		toe2.addChild(bigClaw2);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		noseTop.render(f5);
		nose1.render(f5);
		nose2.render(f5);
		top.render(f5);
		face.render(f5);
		jaw1.render(f5);
		jaw2.render(f5);
		headTop.render(f5);
		head.render(f5);
		tooth1.render(f5);
		tooth2.render(f5);
		tooth3.render(f5);
		tooth4.render(f5);
		tooth5.render(f5);
		tooth6.render(f5);
		eye1.render(f5);
		eye2.render(f5);
		brow1.render(f5);
		brow2.render(f5);
		thigh1.render(f5);
		thigh2.render(f5);
		
//		leg1.render(f5);
//		leg2.render(f5);
//		toe2.render(f5);
//		toe1.render(f5);
//		bigClaw2.render(f5);
//		bigClaw1.render(f5);
//		shin1.render(f5);
//		foot1.render(f5);
//		shin2.render(f5);
//		foot2.render(f5);
		claw1.render(f5);
		claw2.render(f5);
		claw3.render(f5);
		claw4.render(f5);
		claw5.render(f5);
		claw6.render(f5);
		
		
		neck1.render(f5);
		neck2_1.render(f5);
		chest1.render(f5);
		body.render(f5);
		arm1.render(f5);
		forearm1.render(f5);
		tail1.render(f5);
		tail2_2.render(f5);
		tail3.render(f5);
		tail4.render(f5);
		chest2.render(f5);
		tail5.render(f5);
		arm2.render(f5);
		forearm2.render(f5);
		neck2_2.render(f5);
		tail2_1.render(f5);

		feather1.render(f5);
		feather2.render(f5);
		feather3.render(f5);
		feather4.render(f5);
		feather5.render(f5);
		feather6.render(f5);
		feather7.render(f5);
		feather8.render(f5);
		feather9.render(f5);
		feather10.render(f5);
		feather11.render(f5);
		feather12.render(f5);
		feather13.render(f5);
		feather14.render(f5);
		feather15.render(f5);
		feather16.render(f5);
		feather17.render(f5);
		feather18.render(f5);
		feather19.render(f5);
		feather20.render(f5);
		feather21.render(f5);
		feather22.render(f5);
		feather23.render(f5);
		srfeather1.render(f5);
		slfeather1.render(f5);
		srfeather2.render(f5);
		srfeather3.render(f5);
		srfeather4.render(f5);
		srfeather5.render(f5);
		srfeather6.render(f5);
		slfeather2.render(f5);
		slfeather3.render(f5);
		slfeather4.render(f5);
		slfeather5.render(f5);
		slfeather6.render(f5);

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
		super.setRotationAngles(time, distance, f2, f3, f4, f5, entity);
		this.thigh1.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * distance * 0.5F;
		this.thigh2.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.4F * distance * 0.5F;
		this.thigh1.rotateAngleY = 0F;
		this.thigh2.rotateAngleY = 0F;
	}

}