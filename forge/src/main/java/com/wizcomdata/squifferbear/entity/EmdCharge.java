package com.wizcomdata.squifferbear.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EmdCharge extends EntityThrowable {

	private static final String __OBFID = "CL_00001722";
	private double damage = 2.0D;

	public EmdCharge(World world) {
		super(world);
	}

	public EmdCharge(World world, EntityLivingBase player) {
		super(world, player);
	}

	public EmdCharge(World world, double d0, double d1, double d2) {
		super(world, d0, d1, d2);
	}

	public float getGravityVelocity() {
		return .008F;
	}

	public void onImpact(MovingObjectPosition mo) {

		if (mo.entityHit != null && mo.entityHit instanceof EntityLiving) {
			mo.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), .01F);
			((EntityLiving) mo.entityHit).addPotionEffect((new PotionEffect(Potion.moveSlowdown.id, 200, 2)));
		}
		for (int i = 0; i < 8; ++i) {
			this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
		}

		if (!this.worldObj.isRemote) {
			this.setDead();
		}
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public double getDamage() {
		return this.damage;
	}

}
