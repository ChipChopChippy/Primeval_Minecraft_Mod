package com.wizcomdata.squifferbear.primeval.futurepredator;

import com.wizcomdata.squifferbear.Main;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityFuturePredator {
	public static void mainRegistry() {
		registerEntity();
	}

	public static void registerEntity() {
		createEntity(EntityFuturePredatorMob.class, "FuturePredator", 0x222526, 0x929495);
	}
	

	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, Main.instance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 2, EnumCreatureType.creature, BiomeGenBase.plains);
		
		createEgg(randomId, solidColour, spotColour);
	}

	private static void createEgg(int randomId, int solidColour, int spotColour) {
		EntityList.entityEggs.put(randomId, new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
		
	}
}
