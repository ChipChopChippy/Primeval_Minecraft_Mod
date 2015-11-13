package com.wizcomdata.squifferbear.items;

import com.wizcomdata.squifferbear.Main;
import com.wizcomdata.squifferbear.entity.EmdCharge;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EmdRifle extends Item {
	public EmdRifle() {
		setUnlocalizedName("ItemEmdRifle");
		setCreativeTab(Main.tabName);
		setTextureName(Main.MODID + ":EmdRifle");
	}

	int tick = 0;
	int prevtick = 0;

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if (!world.isRemote && (tick - prevtick > 20)) // on server and half
														// second delay
		{
			prevtick = tick;
			world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
			world.spawnEntityInWorld(new EmdCharge(world, player));
		}
		return stack;
	}

	@Override
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
		tick++;
	}
}
