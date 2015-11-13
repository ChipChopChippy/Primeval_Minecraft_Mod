package com.wizcomdata.squifferbear.mob;

import com.wizcomdata.squifferbear.Main;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityMoa {
	public static void mainRegistry() {
		registerEntity();
	}

	public static void registerEntity() {
		createEntity(EntityMoaMob.class, "Moa Bird", 0x493504, 0xB8860B);
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
