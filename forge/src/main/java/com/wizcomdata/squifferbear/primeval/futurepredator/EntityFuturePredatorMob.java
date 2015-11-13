package com.wizcomdata.squifferbear.primeval.futurepredator;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityFuturePredatorMob extends EntityZombie {

	public EntityFuturePredatorMob(World world) {
		super(world);
		this.setSize(1.0F, 2.0F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.5));
		// this.tasks.addTask(1, new EntityAIPanic(this, 1.0));
		this.tasks.addTask(1, new EntityAITempt(this, 0.7, Items.beef, false));
		this.tasks.addTask(2, new EntityAISwimming(this));
		// this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
		// this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(4, new EntityAILookIdle(this));
		this.tasks.addTask(5, new EntityAILeapAtTarget(this, 0.4F)); // 1.0F
	}

	public boolean isAIEnabled() {
		return true;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5F);
	}

	// @Override
	// public EntityAgeable createChild(EntityAgeable ageable) {
	// return new EntityFuturePredatorMob(worldObj);
	// }
	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound() {
		return "modid:mob.futurepredator.say";
	}

	@Override
	protected Item getDropItem() {
		return (Item) Item.itemRegistry.getObject("modid:raptorClaw");
	}

	/**
	 * Called frequently so the entity can update its state every tick as
	 * required. For example, zombies and skeletons use this to react to
	 * sunlight and start to burn.
	 */
	public void onLivingUpdate() {
		if (this.worldObj.isDaytime() && !this.worldObj.isRemote && !this.isChild()) {
			float f = this.getBrightness(1.0F);

			if (f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F
					&& this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX),
							MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ))) {
				boolean flag = true;
				ItemStack itemstack = this.getEquipmentInSlot(4);

				if (itemstack != null) {
					if (itemstack.isItemStackDamageable()) {
						itemstack.setItemDamage(itemstack.getItemDamageForDisplay() + this.rand.nextInt(2));

						if (itemstack.getItemDamageForDisplay() >= itemstack.getMaxDamage()) {
							this.renderBrokenItemStack(itemstack);
							this.setCurrentItemOrArmor(4, (ItemStack) null);
						}
					}

					flag = false;
				}

				if (flag) {
					this.setFire(8);
				}
			}
		}
		super.onLivingUpdate();
	}

	@Override
	/**
	 * Sets entity to burn for x amount of seconds, cannot lower amount of
	 * existing fire.
	 */
	public void setFire(int p_70015_1_) {
		// do nothing!
	}

	// /**
	// * Returns the sound this mob makes when it is hurt.
	// */
	// @Override
	// protected String getHurtSound() {
	// return "modid:mob.deinonychus.hurt";
	// }
	//
	// /**
	// * Returns the sound this mob makes on death.
	// */
	// @Override
	// protected String getDeathSound() {
	// return "modid:mob.deinonychus.death";
	// }
}
