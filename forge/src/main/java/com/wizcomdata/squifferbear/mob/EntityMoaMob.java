package com.wizcomdata.squifferbear.mob;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityMoaMob extends EntityAnimal {

	private EntityAIEatGrass eatGrass = new EntityAIEatGrass(this);
	/**
	 * Used to control movement as well as wool regrowth. Set to 40 on
	 * handleHealthUpdate and counts down with each tick.
	 */
	private int moaTimer;

	public EntityMoaMob(World world) {
		super(world);
		this.setSize(1.0F, 2.0F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.5));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.0));
		this.tasks.addTask(2, new EntityAITempt(this, 0.7, Items.wheat_seeds, false));
		this.tasks.addTask(3, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(5, new EntityAIFollowParent(this, 1.1D));
		this.tasks.addTask(6, this.eatGrass);
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
	}

	public boolean isAIEnabled() {
		return true;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityMoaMob(worldObj);
	}

	@SideOnly(Side.CLIENT)
	public float setMoaTimer(float moaTimerFloatSetter) {
		return this.moaTimer <= 0 ? 0.0F
				: (this.moaTimer >= 4 && this.moaTimer <= 36 ? 1.0F
						: (this.moaTimer < 4 ? ((float) this.moaTimer - moaTimerFloatSetter) / 4.0F
								: -((float) (this.moaTimer - 40) - moaTimerFloatSetter) / 4.0F));
	}

	@SideOnly(Side.CLIENT)
	public float setMoaTimerPitch(float moaTimerFloatSetter) {
		if (this.moaTimer > 4 && this.moaTimer <= 36) {
			float f1 = ((float) (this.moaTimer - 4) - moaTimerFloatSetter) / 32.0F;
			return ((float) Math.PI / 5F) + ((float) Math.PI * 7F / 100F) * MathHelper.sin(f1 * 28.7F);
		} else {
			return this.moaTimer > 0 ? ((float) Math.PI / 5F) : this.rotationPitch / (180F / (float) Math.PI);
		}
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound() {
		return "modid:mob.moa.say";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound() {
		return "modid:mob.moa.hurt";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound() {
		return "modid:mob.moa.death";
	}
}
