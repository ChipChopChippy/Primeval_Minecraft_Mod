package com.wizcomdata.squifferbear.primeval.futurepredator;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelFuturePredator extends ModelBase {
    public ModelRenderer back1;
    public ModelRenderer back2;
    public ModelRenderer v1;
    public ModelRenderer v2;
    public ModelRenderer v3;
    public ModelRenderer v4;
    public ModelRenderer body;
    public ModelRenderer upleg1;
    public ModelRenderer upleg2;
    public ModelRenderer tail;
    public ModelRenderer neck;
    public ModelRenderer back2_1;
    public ModelRenderer thigh1;
    public ModelRenderer thigh2;
    public ModelRenderer arm1;
    public ModelRenderer foot3;
    public ModelRenderer foot4;
    public ModelRenderer toe4;
    public ModelRenderer claw1;
    public ModelRenderer toe3;
    public ModelRenderer arm2;
    public ModelRenderer foot1;
    public ModelRenderer foot2;
    public ModelRenderer toe2;
    public ModelRenderer claw2;
    public ModelRenderer toe1;
    public ModelRenderer Head;
    public ModelRenderer jaw;
    public ModelRenderer spine;
    public ModelRenderer face;
    public ModelRenderer nose6;
    public ModelRenderer nose4;
    public ModelRenderer nose1;
    public ModelRenderer nose3;
    public ModelRenderer nose2;
    public ModelRenderer tooth3;
    public ModelRenderer tooth2;
    public ModelRenderer tooth4;
    public ModelRenderer tooth1;
    public ModelRenderer nose5;
    public ModelRenderer chin1;
    public ModelRenderer chin2;
    public ModelRenderer leg1;
    public ModelRenderer bfoot1;
    public ModelRenderer leg2;
    public ModelRenderer bfoot2;

    public ModelFuturePredator() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.leg2 = new ModelRenderer(this, 80, 41);
        this.leg2.setRotationPoint(0.1F, 7.0F, 0.0F);
        this.leg2.addBox(0.0F, 0.0F, 0.0F, 3, 15, 3, 0.0F);
        this.setRotateAngle(leg2, 0.5918411493512771F, -0.0F, 0.0F);
        this.foot2 = new ModelRenderer(this, 57, 0);
        this.foot2.setRotationPoint(-1.1F, 15.3F, -1.1F);
        this.foot2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(foot2, 0.33143802495372315F, -0.0F, -0.03106686068549907F);
        this.claw2 = new ModelRenderer(this, 57, 0);
        this.claw2.setRotationPoint(0.7F, 0.5F, 4.4F);
        this.claw2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(claw2, 0.11222467090323537F, -0.020718563911447108F, 0.0F);
        this.back1 = new ModelRenderer(this, 40, 35);
        this.back1.setRotationPoint(-4.0F, -7.699999809265137F, -5.0F);
        this.back1.addBox(0.0F, 0.0F, 0.0F, 8, 1, 11, 0.0F);
        this.nose4 = new ModelRenderer(this, 15, 26);
        this.nose4.setRotationPoint(3.9F, 1.8F, -0.6F);
        this.nose4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(nose4, 0.0017453292519943296F, -0.0F, -0.7853981633974483F);
        this.v2 = new ModelRenderer(this, 28, 2);
        this.v2.setRotationPoint(-0.5F, -8.300000190734863F, -1.0F);
        this.v2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.tail = new ModelRenderer(this, 54, 18);
        this.tail.setRotationPoint(-0.5F, 0.0F, 15.0F);
        this.tail.addBox(-1.0F, 0.0F, -1.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(tail, 0.9506808435613113F, -0.0F, 0.0F);
        this.nose5 = new ModelRenderer(this, 15, 26);
        this.nose5.setRotationPoint(4.0F, 0.5F, -0.6F);
        this.nose5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(nose5, 0.0F, -0.0F, 0.7853981633974483F);
        this.arm2 = new ModelRenderer(this, 80, 18);
        this.arm2.mirror = true;
        this.arm2.setRotationPoint(0.0F, 8.5F, 0.1F);
        this.arm2.addBox(-1.0F, 0.0F, -1.0F, 3, 16, 4, 0.0F);
        this.setRotateAngle(arm2, -0.6108652381980153F, -0.0017453292519943296F, 0.0F);
        this.v3 = new ModelRenderer(this, 26, 4);
        this.v3.setRotationPoint(-0.5F, -8.399999618530273F, 1.0F);
        this.v3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.spine = new ModelRenderer(this, 17, 22);
        this.spine.setRotationPoint(0.5F, -3.6F, -2.0F);
        this.spine.addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
        this.face = new ModelRenderer(this, 19, 90);
        this.face.setRotationPoint(-2.5F, -2.0F, -2.9F);
        this.face.addBox(0.0F, 0.0F, -0.1F, 8, 7, 1, 0.0F);
        this.toe2 = new ModelRenderer(this, 57, 0);
        this.toe2.setRotationPoint(-0.1F, 0.6F, 3.4F);
        this.toe2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(toe2, 0.6108652381980153F, 0.20943951023931953F, 0.0F);
        this.tooth4 = new ModelRenderer(this, 0, 0);
        this.tooth4.setRotationPoint(1.0F, 6.5F, -0.2F);
        this.tooth4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tooth4, 0.05235987755982988F, -0.0F, -0.13962634015954636F);
        this.chin2 = new ModelRenderer(this, 57, 57);
        this.chin2.setRotationPoint(2.0F, 5.5F, -3.7F);
        this.chin2.addBox(-3.0F, -5.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(chin2, 0.13962634015954636F, -0.0F, 0.0F);
        this.toe3 = new ModelRenderer(this, 57, 0);
        this.toe3.setRotationPoint(0.0F, 0.2F, 3.9F);
        this.toe3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(toe3, 0.5235987755982988F, 0.0017453292519943296F, 0.0F);
        this.tooth2 = new ModelRenderer(this, 0, 0);
        this.tooth2.setRotationPoint(4.4F, 6.5F, -0.2F);
        this.tooth2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tooth2, 0.05235987755982988F, -0.0F, 0.12217304763960307F);
        this.back2 = new ModelRenderer(this, 75, 64);
        this.back2.setRotationPoint(-3.0F, -5.0F, 7.0F);
        this.back2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 11, 0.0F);
        this.setRotateAngle(back2, -0.2548180818557739F, -0.0F, 0.0F);
        this.jaw = new ModelRenderer(this, 14, 44);
        this.jaw.setRotationPoint(-1.5F, 3.5F, -8.3F);
        this.jaw.addBox(-2.0F, 0.0F, -5.0F, 7, 2, 7, 0.0F);
        this.setRotateAngle(jaw, 0.15289084247470325F, -0.0F, 0.0F);
        this.tooth3 = new ModelRenderer(this, 0, 0);
        this.tooth3.setRotationPoint(2.8F, 6.6F, -0.2F);
        this.tooth3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tooth3, 0.05235987755982988F, 0.0F, -0.12217304763960307F);
        this.thigh2 = new ModelRenderer(this, 97, 18);
        this.thigh2.setRotationPoint(-5.0F, 2.0F, 11.0F);
        this.thigh2.addBox(0.0F, 0.0F, 0.0F, 3, 9, 4, 0.0F);
        this.setRotateAngle(thigh2, -0.2617993950843811F, -0.008726646192371845F, 0.0F);
        this.upleg1 = new ModelRenderer(this, 77, 2);
        this.upleg1.setRotationPoint(-4.1F, 0.0F, -3.7F);
        this.upleg1.addBox(-1.0F, 0.0F, -1.0F, 3, 11, 4, 0.0F);
        this.setRotateAngle(upleg1, 0.2617993877991494F, 0.0F, 0.0F);
        this.v4 = new ModelRenderer(this, 28, 2);
        this.v4.setRotationPoint(-0.5F, -8.199999809265137F, 3.0F);
        this.v4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.toe1 = new ModelRenderer(this, 57, 0);
        this.toe1.setRotationPoint(0.0F, 0.3F, 3.6F);
        this.toe1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(toe1, 0.5235987755982988F, -0.0017453292519943296F, 0.0F);
        this.neck = new ModelRenderer(this, 93, 2);
        this.neck.setRotationPoint(0.0F, -0.5F, -3.1F);
        this.neck.addBox(-4.0F, -3.5F, -5.4F, 8, 8, 6, 0.0F);
        this.claw1 = new ModelRenderer(this, 57, 0);
        this.claw1.setRotationPoint(0.6F, 0.6F, 4.4F);
        this.claw1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(claw1, 0.045553093477052F, 0.011356851755450391F, 0.0F);
        this.foot4 = new ModelRenderer(this, 57, 0);
        this.foot4.setRotationPoint(0.1F, 15.1F, -1.1F);
        this.foot4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(foot4, 0.342259066316088F, 0.0F, 0.0F);
        this.tooth1 = new ModelRenderer(this, 0, 0);
        this.tooth1.setRotationPoint(6.0F, 6.4F, -0.2F);
        this.tooth1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tooth1, 0.05235987755982988F, -0.0F, 0.13962634015954636F);
        this.leg1 = new ModelRenderer(this, 80, 41);
        this.leg1.setRotationPoint(-0.1F, 7.0F, 0.0F);
        this.leg1.addBox(0.0F, 0.0F, 0.0F, 3, 15, 3, 0.0F);
        this.setRotateAngle(leg1, 0.5918411493512771F, -0.0F, 0.0F);
        this.upleg2 = new ModelRenderer(this, 77, 2);
        this.upleg2.setRotationPoint(3.1F, 0.0F, -4.0F);
        this.upleg2.addBox(-1.0F, 0.0F, -1.0F, 3, 11, 4, 0.0F);
        this.setRotateAngle(upleg2, 0.2617993877991494F, 0.008726646259971648F, 0.0F);
        this.back2_1 = new ModelRenderer(this, 12, 14);
        this.back2_1.setRotationPoint(-4.0F, 4.0F, 2.0F);
        this.back2_1.addBox(0.0F, 0.0F, 0.0F, 8, 15, 9, 0.0F);
        this.setRotateAngle(back2_1, 1.326450228691101F, -0.0F, 0.0F);
        this.foot1 = new ModelRenderer(this, 57, 0);
        this.foot1.setRotationPoint(0.0F, 15.2F, -1.0F);
        this.foot1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(foot1, 0.3415609346152903F, 0.13962634015954636F, 0.0F);
        this.nose1 = new ModelRenderer(this, 15, 26);
        this.nose1.setRotationPoint(5.0F, 2.6F, -0.6F);
        this.nose1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(nose1, -0.0017453292519943296F, -0.0F, -0.05235987755982988F);
        this.bfoot1 = new ModelRenderer(this, 57, 8);
        this.bfoot1.setRotationPoint(0.0F, 13.8F, -0.7F);
        this.bfoot1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(bfoot1, -0.31869712141416456F, 0.008726646259971648F, 0.0F);
        this.bfoot2 = new ModelRenderer(this, 57, 8);
        this.bfoot2.setRotationPoint(0.0F, 13.8F, -0.8F);
        this.bfoot2.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(bfoot2, -0.31869712141416456F, -0.008726646259971648F, 0.0F);
        this.Head = new ModelRenderer(this, 49, 89);
        this.Head.setRotationPoint(-1.5F, -1.5F, -10.5F);
        this.Head.addBox(-3.0F, -3.0F, -2.0F, 9, 8, 8, 0.0F);
        this.foot3 = new ModelRenderer(this, 57, 0);
        this.foot3.setRotationPoint(-1.0F, 15.4F, -1.0F);
        this.foot3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(foot3, 0.2792526803190927F, -0.13962634015954636F, 0.0F);
        this.nose2 = new ModelRenderer(this, 15, 26);
        this.nose2.setRotationPoint(2.0F, 2.5F, -0.6F);
        this.nose2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(nose2, -0.0017453292519943296F, -0.0F, 0.05235987755982988F);
        this.thigh1 = new ModelRenderer(this, 97, 18);
        this.thigh1.setRotationPoint(2.0F, 2.0F, 11.0F);
        this.thigh1.addBox(0.0F, 0.0F, 0.0F, 3, 9, 4, 0.0F);
        this.setRotateAngle(thigh1, -0.2617993950843811F, 0.008726646192371845F, 0.0F);
        this.v1 = new ModelRenderer(this, 26, 3);
        this.v1.setRotationPoint(-0.5F, -8.0F, -3.0F);
        this.v1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.body = new ModelRenderer(this, 18, 63);
        this.body.setRotationPoint(-1.0F, 2.0F, -4.0F);
        this.body.addBox(-4.0F, -2.0F, -3.0F, 10, 13, 12, 0.0F);
        this.setRotateAngle(body, 1.5707963705062866F, -0.0F, 0.0F);
        this.chin1 = new ModelRenderer(this, 57, 57);
        this.chin1.setRotationPoint(1.0F, 5.5F, -3.7F);
        this.chin1.addBox(1.0F, -5.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(chin1, 0.13962634015954636F, -0.0F, 0.0F);
        this.arm1 = new ModelRenderer(this, 80, 18);
        this.arm1.setRotationPoint(-0.0F, 8.5F, -0.1F);
        this.arm1.addBox(-1.0F, 0.0F, -1.0F, 3, 16, 4, 0.0F);
        this.setRotateAngle(arm1, -0.6224646998791667F, 0.0017453292519943296F, 0.0F);
        this.toe4 = new ModelRenderer(this, 57, 0);
        this.toe4.setRotationPoint(0.1F, 0.3F, 2.8F);
        this.toe4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(toe4, 0.6967354373961364F, -0.13309456020189295F, 0.0F);
        this.nose6 = new ModelRenderer(this, 15, 26);
        this.nose6.setRotationPoint(2.0F, 4.55F, -0.6F);
        this.nose6.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.nose3 = new ModelRenderer(this, 15, 26);
        this.nose3.setRotationPoint(3.4F, 1.1F, -0.6F);
        this.nose3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(nose3, 0.0017453292519943296F, -0.0F, 0.7853981633974483F);
        this.thigh2.addChild(this.leg2);
        this.arm2.addChild(this.foot2);
        this.toe2.addChild(this.claw2);
        this.face.addChild(this.nose4);
        this.face.addChild(this.nose5);
        this.upleg2.addChild(this.arm2);
        this.Head.addChild(this.spine);
        this.Head.addChild(this.face);
        this.foot1.addChild(this.toe2);
        this.face.addChild(this.tooth4);
        this.jaw.addChild(this.chin2);
        this.foot4.addChild(this.toe3);
        this.face.addChild(this.tooth2);
        this.neck.addChild(this.jaw);
        this.face.addChild(this.tooth3);
        this.foot2.addChild(this.toe1);
        this.toe4.addChild(this.claw1);
        this.arm1.addChild(this.foot4);
        this.face.addChild(this.tooth1);
        this.thigh1.addChild(this.leg1);
        this.arm2.addChild(this.foot1);
        this.face.addChild(this.nose1);
        this.leg1.addChild(this.bfoot1);
        this.leg2.addChild(this.bfoot2);
        this.neck.addChild(this.Head);
        this.arm1.addChild(this.foot3);
        this.face.addChild(this.nose2);
        this.jaw.addChild(this.chin1);
        this.upleg1.addChild(this.arm1);
        this.foot3.addChild(this.toe4);
        this.face.addChild(this.nose6);
        this.face.addChild(this.nose3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.back1.render(f5);
        this.v2.render(f5);
        this.tail.render(f5);
        this.v3.render(f5);
        this.back2.render(f5);
        this.thigh2.render(f5);
        this.upleg1.render(f5);
        this.v4.render(f5);
        this.neck.render(f5);
        this.upleg2.render(f5);
        this.back2_1.render(f5);
        this.thigh1.render(f5);
        this.v1.render(f5);
        this.body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are
	 * used for animating the movement of arms and legs, where par1 represents
	 * the time(so that arms and legs swing back and forth) and par2 represents
	 * how "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float time, float distance, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(time, distance, f2, f3, f4, f5, entity);
//		this.upleg1.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * distance * 0.5F;
//		this.upleg2.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.4F * distance * 0.5F;
//		this.upleg1.rotateAngleY = 0F;
//		this.upleg2.rotateAngleY = 0F;
		float f6 = (270F / (float) Math.PI);
		this.neck.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.neck.rotateAngleY = f3 / (180F / (float) Math.PI);
//		this.body.rotateAngleX = ((float) Math.PI / 2F);
		this.upleg1.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * distance;
		this.upleg2.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.4F * distance;
		this.thigh1.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.4F * distance;
		this.thigh2.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * distance;
	}
}