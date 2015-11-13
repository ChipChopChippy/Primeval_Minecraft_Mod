package com.wizcomdata.squifferbear.primeval.anomaly;

import com.wizcomdata.squifferbear.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockAnomaly extends BlockContainer {
	
	private static final String name = "anomalySmall";

	public BlockAnomaly(Material material) {
		super(Material.portal);
		setBlockTextureName(Main.MODID + ":" + name);
//		setBlockBounds(0.25F, 0, 0.25F, 0.75F, 0.5F, 0.75F);
		setBlockBounds(0.20F, 0F, 0.20F, 1F, 0.75F, 1F);
		setBlockName(name);
		GameRegistry.registerBlock(this, name);
		GameRegistry.registerTileEntity(TileEntityAnomaly.class, Main.MODID + ":" + 567);
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return true;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int parameter2) {
		return new TileEntityAnomaly();
	}
	
	
}
