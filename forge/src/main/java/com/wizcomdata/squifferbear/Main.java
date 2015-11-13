package com.wizcomdata.squifferbear;

import com.wizcomdata.squifferbear.entity.EmdCharge;
import com.wizcomdata.squifferbear.items.EmdRifle;
import com.wizcomdata.squifferbear.items.EmdTexture;
import com.wizcomdata.squifferbear.mob.EntityMoa;
import com.wizcomdata.squifferbear.mob.deinonoychus.EntityDeinonychus;
import com.wizcomdata.squifferbear.mob.multitexture.MultitextureBlock;
import com.wizcomdata.squifferbear.primeval.anomaly.BlockAnomaly;
import com.wizcomdata.squifferbear.primeval.futurepredator.EntityFuturePredator;
import com.wizcomdata.squifferbear.primeval.futurepredator.NeuralClamp;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
	public static final String MODID = "modid";
	public static final String VERSION = "0.1";

	public static CreativeTabs tabName = new CreativeTabs("dimension") {
		public Item getTabIconItem() {
			return Items.arrow;
		}
	};

	@Mod.Instance
	public static Main instance;

	@SidedProxy(clientSide = "com.wizcomdata.squifferbear.ClientProxy", serverSide = "com.wizcomdata.squifferbear.CommonProxy")
	public static CommonProxy proxy;

	/*
	 * You can call the Material whatever you want. The first number in the
	 * brakets is the harvest level. Level 0 (gold and wood) can't mine iron
	 * ore... Level 1 (stone) can't mine gold ore... Level 2 (iron) can't mine
	 * obsidian. Level 3 (diamond) can mine every breakable block. The second
	 * number of uses of the Material. wood = 59, stone = 131, iron = 250,
	 * diamond = 1561, gold = 32 The third number is the strength against
	 * blocks. wood = 2.0F, stone = 4.0F, iron = 6.0F, diamond = 8.0F, gold
	 * 12.0F The fourth number is the damage against entities. wood = 0.0F,
	 * stone = 1.0F, iron = 2.0F, diamond = 3.0F, gold 0.0F The last number is
	 * enchantability factor of the Material. wood = 15, stone = 5, iron = 14,
	 * diamond = 10, gold 22
	 */
	public static final Item.ToolMaterial TUTORIALMATERIAL = EnumHelper.addToolMaterial("TUTORIALMATERIAL", 2, 192,
			5.0F, 1.5F, 12);
	public static final Item.ToolMaterial SWORDMATERIAL = EnumHelper.addToolMaterial("SWORDMATERIAL", 0, 59, 2.0F, 1.0F,
			15);
	public static final Item.ToolMaterial RAPTORMATERIAL = EnumHelper.addToolMaterial("RAPTORMATERIAL", 0, 59, 0.0F,
			0.0F, 0);

	// Items
	public static Item freshBone;
	public static Item raptorClaw;
	public static Item scrapSword;
	public static Item theropodEgg;
	public static Item neuralClamp;

	public static Item emdRifle = new EmdRifle();
	public static Item emdTexture = new EmdTexture();

	// Blocks
	public static Block lepinodendron;
	public static Block lepinodendronLeaves;
	public static Block anomalySmall;
	public static Block multitexture;

	public static final Block.SoundType soundTypeLepinodendronLeaves = new Block.SoundType("grass", 1.0F, 1.0F) {
		private static final String __OBFID = "CL_00000999";

		/**
		 * Used when a block breaks, e.g.: Player break, Sheep eating grass,
		 * etc..
		 */
		public String getBreakSound() {
			return "dig.grass";
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.registerRenderers();
		proxy.registerEntities();
		EntityRegistry.registerModEntity(EmdCharge.class, "EMD Charge", 0, this, 80, 3, true);
		GameRegistry.registerItem(emdRifle, "EMD Rifle");
		GameRegistry.registerItem(emdTexture, "Emd Texture");
	}

	@EventHandler
	public void PreLoad(FMLPreInitializationEvent preEvent) {
		EntityMoa.mainRegistry();
		EntityDeinonychus.mainRegistry();
		EntityFuturePredator.mainRegistry();
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		System.out.println("DAN'S ITEM >> ");

		// Items
		freshBone = new FreshBone(2, true).setUnlocalizedName("freshBone").setCreativeTab(tabName)
				.setTextureName(MODID + ":" + "freshBone");
		GameRegistry.registerItem(freshBone, "freshBone");
		raptorClaw = new RaptorClaw(RAPTORMATERIAL).setUnlocalizedName("raptorClaw").setCreativeTab(tabName)
				.setTextureName(MODID + ":" + "raptorClaw");
		GameRegistry.registerItem(raptorClaw, "raptorClaw");
		scrapSword = new ScrapSword(SWORDMATERIAL).setUnlocalizedName("scrapSword").setCreativeTab(tabName)
				.setTextureName(MODID + ":" + "scrapSword");
		GameRegistry.registerItem(scrapSword, "scrapSword");
		theropodEgg = new TheropodEgg().setUnlocalizedName("theropodEgg").setCreativeTab(tabName)
				.setTextureName(MODID + ":" + "theropodEgg");
		GameRegistry.registerItem(theropodEgg, "theropodEgg");

		// Blocks
		lepinodendron = new Lepinodendron().setBlockName("lepinodendron").setHardness(2.0f).setCreativeTab(tabName)
				.setBlockTextureName(MODID + ":" + "lepinodendronWood");
		GameRegistry.registerBlock(lepinodendron, "lepinodendron");
		lepinodendronLeaves = new LepinodendronLeaves(Material.leaves, true).setHardness(0.5f)
				.setStepSound(soundTypeLepinodendronLeaves).setBlockName("lepinodendronLeaves").setCreativeTab(tabName)
				.setBlockTextureName(MODID + ":" + "lepinodendronLeaves");
		GameRegistry.registerBlock(lepinodendronLeaves, "lepinodendronLeaves");

		GameRegistry.registerBlock(multitexture = new MultitextureBlock("lepinodendron", Material.wood),
				"multitexture");

		anomalySmall = new BlockAnomaly(Material.portal).setCreativeTab(tabName).setBlockName("anomalySmall");

		GameRegistry.addRecipe(new ItemStack(scrapSword), "AB", "AB", 'A', Blocks.cobblestone, 'B', Items.stick);

		System.out.println("Just before proxy.registerItemRenderer");
		proxy.registerItemRenderer();
		System.out.println("Just after proxy.registerItemRenderer");

		MinecraftForge.EVENT_BUS.register(new DropHandler());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
	}

}