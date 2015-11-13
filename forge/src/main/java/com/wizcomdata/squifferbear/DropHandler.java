package com.wizcomdata.squifferbear;

import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {
	public static Random random;
	public static int dropped;

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
//		int rand = ThreadLocalRandom.current().nextInt(2) + 1;
		random = new Random();
		dropped = random.nextInt(2) + 1; // DO NOT CHANGE THIS

		if (event.entityLiving instanceof EntityCow) {
			event.entityLiving.entityDropItem(new ItemStack(Items.apple), dropped);
		}

	}

}