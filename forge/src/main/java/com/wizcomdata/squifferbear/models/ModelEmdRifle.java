package com.wizcomdata.squifferbear.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * EMD rifle.tcn - TechneToTabulaImporter Created using Tabula 5.1.0
 */
public class ModelEmdRifle extends ModelBase {
	public ModelRenderer butt1;
	public ModelRenderer butt2;
	public ModelRenderer butt3;
	public ModelRenderer butt4;
	public ModelRenderer shaft1;
	public ModelRenderer shaft2;
	public ModelRenderer bottomShaft;
	public ModelRenderer hilt1;
	public ModelRenderer trigger;
	public ModelRenderer hilt2;
	public ModelRenderer button;
	public ModelRenderer top;
	public ModelRenderer barrel1;
	public ModelRenderer barrel2;
	public ModelRenderer end1;
	public ModelRenderer end2;
	public ModelRenderer end3;
	public ModelRenderer end4;
	public ModelRenderer nose;
	public ModelRenderer handle1;
	public ModelRenderer handleEnd1;
	public ModelRenderer handle2;
	public ModelRenderer handleEnd2;
	public ModelRenderer scope;
	public ModelRenderer Shape1;
	public ModelRenderer Shape2;

	public ModelEmdRifle() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.bottomShaft = new ModelRenderer(this, 0, 10);
		this.bottomShaft.setRotationPoint(0.0F, 17.200000762939453F, -10.0F);
		this.bottomShaft.addBox(0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
		this.setRotateAngle(bottomShaft, -0.03490658476948738F, -0.0F, 0.0F);
		this.end3 = new ModelRenderer(this, 0, 14);
		this.end3.setRotationPoint(-0.10000000149011612F, 16.899999618530273F, -24.5F);
		this.end3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
		this.hilt1 = new ModelRenderer(this, 0, 14);
		this.hilt1.setRotationPoint(0.0F, 17.899999618530273F, -7.0F);
		this.hilt1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
		this.nose = new ModelRenderer(this, 38, 26);
		this.nose.setRotationPoint(0.0F, 17.100000381469727F, -24.899999618530273F);
		this.nose.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.handle1 = new ModelRenderer(this, 0, 16);
		this.handle1.setRotationPoint(0.0F, 18.0F, -10.0F);
		this.handle1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
		this.handleEnd1 = new ModelRenderer(this, 0, 15);
		this.handleEnd1.setRotationPoint(0.0F, 20.5F, -10.0F);
		this.handleEnd1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.Shape2 = new ModelRenderer(this, 0, 16);
		this.Shape2.setRotationPoint(-0.10000000149011612F, 18.0F, -10.699999809265137F);
		this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.handle2 = new ModelRenderer(this, 0, 15);
		this.handle2.setRotationPoint(0.0F, 18.0F, -10.600000381469727F);
		this.handle2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
		this.butt1 = new ModelRenderer(this, 0, 14);
		this.butt1.setRotationPoint(0.0F, 18.0F, 0.0F);
		this.butt1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
		this.end1 = new ModelRenderer(this, 0, 14);
		this.end1.setRotationPoint(0.20000000298023224F, 16.899999618530273F, -24.5F);
		this.end1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
		this.handleEnd2 = new ModelRenderer(this, 0, 16);
		this.handleEnd2.setRotationPoint(0.0F, 20.5F, -10.800000190734863F);
		this.handleEnd2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.barrel2 = new ModelRenderer(this, 0, 28);
		this.barrel2.setRotationPoint(0.0F, 17.299999237060547F, -20.0F);
		this.barrel2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F);
		this.setRotateAngle(barrel2, -0.026179939508438117F, -0.0F, 0.0F);
		this.button = new ModelRenderer(this, 0, 0);
		this.button.setRotationPoint(-0.20000000298023224F, 18.0F, -5.300000190734863F);
		this.button.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.butt3 = new ModelRenderer(this, 4, 13);
		this.butt3.setRotationPoint(-0.20000000298023224F, 17.0F, -3.9000000953674316F);
		this.butt3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
		this.butt4 = new ModelRenderer(this, 4, 13);
		this.butt4.setRotationPoint(0.20000000298023224F, 17.0F, -3.9000000953674316F);
		this.butt4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
		this.end2 = new ModelRenderer(this, 0, 14);
		this.end2.setRotationPoint(0.20000000298023224F, 17.399999618530273F, -24.5F);
		this.end2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
		this.barrel1 = new ModelRenderer(this, 0, 29);
		this.barrel1.setRotationPoint(0.0F, 17.0F, -20.0F);
		this.barrel1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
		this.trigger = new ModelRenderer(this, 0, 15);
		this.trigger.setRotationPoint(0.0F, 18.5F, -4.599999904632568F);
		this.trigger.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
		this.butt2 = new ModelRenderer(this, 0, 14);
		this.butt2.setRotationPoint(0.0F, 18.200000762939453F, -3.25F);
		this.butt2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
		this.setRotateAngle(butt2, 0.7155849933624268F, -0.0F, 0.0F);
		this.shaft1 = new ModelRenderer(this, 32, 20);
		this.shaft1.setRotationPoint(0.10000000149011612F, 17.0F, -10.899999618530273F);
		this.shaft1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
		this.shaft2 = new ModelRenderer(this, 32, 20);
		this.shaft2.setRotationPoint(-0.10000000149011612F, 17.0F, -10.899999618530273F);
		this.shaft2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
		this.Shape1 = new ModelRenderer(this, 0, 16);
		this.Shape1.setRotationPoint(0.10000000149011612F, 18.0F, -10.600000381469727F);
		this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.end4 = new ModelRenderer(this, 0, 14);
		this.end4.setRotationPoint(-0.10000000149011612F, 17.399999618530273F, -24.5F);
		this.end4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
		this.hilt2 = new ModelRenderer(this, 0, 15);
		this.hilt2.setRotationPoint(0.0F, 20.899999618530273F, -6.900000095367432F);
		this.hilt2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(hilt2, 0.15707963705062866F, -0.0F, 0.0F);
		this.top = new ModelRenderer(this, 27, 15);
		this.top.setRotationPoint(0.0F, 16.799999237060547F, -11.0F);
		this.top.addBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F);
		this.scope = new ModelRenderer(this, 14, 5);
		this.scope.setRotationPoint(1.0F, 17.5F, -9.0F);
		this.scope.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bottomShaft.render(f5);
		this.end3.render(f5);
		this.hilt1.render(f5);
		this.nose.render(f5);
		this.handle1.render(f5);
		this.handleEnd1.render(f5);
		this.Shape2.render(f5);
		this.handle2.render(f5);
		this.butt1.render(f5);
		this.end1.render(f5);
		this.handleEnd2.render(f5);
		this.barrel2.render(f5);
		this.button.render(f5);
		this.butt3.render(f5);
		this.butt4.render(f5);
		this.end2.render(f5);
		this.barrel1.render(f5);
		this.trigger.render(f5);
		this.butt2.render(f5);
		this.shaft1.render(f5);
		this.shaft2.render(f5);
		this.Shape1.render(f5);
		this.end4.render(f5);
		this.hilt2.render(f5);
		this.top.render(f5);
		this.scope.render(f5);
	}

	public void renderModel(float f5) {
		this.bottomShaft.render(f5);
		this.end3.render(f5);
		this.hilt1.render(f5);
		this.nose.render(f5);
		this.handle1.render(f5);
		this.handleEnd1.render(f5);
		this.Shape2.render(f5);
		this.handle2.render(f5);
		this.butt1.render(f5);
		this.end1.render(f5);
		this.handleEnd2.render(f5);
		this.barrel2.render(f5);
		this.button.render(f5);
		this.butt3.render(f5);
		this.butt4.render(f5);
		this.end2.render(f5);
		this.barrel1.render(f5);
		this.trigger.render(f5);
		this.butt2.render(f5);
		this.shaft1.render(f5);
		this.shaft2.render(f5);
		this.Shape1.render(f5);
		this.end4.render(f5);
		this.hilt2.render(f5);
		this.top.render(f5);
		this.scope.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
