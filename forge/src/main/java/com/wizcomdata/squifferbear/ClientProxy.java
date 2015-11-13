package com.wizcomdata.squifferbear;

import com.wizcomdata.squifferbear.deinonychus.ModelDeinonychus;
import com.wizcomdata.squifferbear.entity.EmdCharge;
import com.wizcomdata.squifferbear.mob.EntityMoaMob;
import com.wizcomdata.squifferbear.mob.RenderMoaMob;
import com.wizcomdata.squifferbear.mob.deinonoychus.EntityDeinonychusMob;
import com.wizcomdata.squifferbear.mob.deinonoychus.RenderDeinonychusMob;
import com.wizcomdata.squifferbear.primeval.anomaly.TileEntityAnomaly;
import com.wizcomdata.squifferbear.primeval.anomaly.TileEntitySpecialRendererAnomaly;
import com.wizcomdata.squifferbear.primeval.futurepredator.EntityFuturePredatorMob;
import com.wizcomdata.squifferbear.primeval.futurepredator.ModelFuturePredator;
import com.wizcomdata.squifferbear.primeval.futurepredator.RenderFuturePredatorClamp;
import com.wizcomdata.squifferbear.primeval.futurepredator.RenderFuturePredatorMob;
import com.wizcomdata.squifferbear.renderers.RenderEmdRifle;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	int modEntityID;
	
	@Override
	public void registerRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMoaMob.class, new RenderMoaMob(new ModelMoaBird(), 1));
		RenderingRegistry.registerEntityRenderingHandler(EntityDeinonychusMob.class, new RenderDeinonychusMob(new ModelDeinonychus(), 1));
		RenderingRegistry.registerEntityRenderingHandler(EntityFuturePredatorMob.class, new RenderFuturePredatorMob(new ModelFuturePredator(), 1));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAnomaly.class, new TileEntitySpecialRendererAnomaly());
	}
	
	@Override
	public void registerEntities() {
		modEntityID = EntityRegistry.findGlobalUniqueEntityId();
//		EntityRegistry.registerModEntity(EntityMoa_old.class,"EntityMoa_old", modEntityID++,  Main.instance, 80, 1, false);
//		EntityRegistry.registerModEntity(EntityMoaMob.class,"EntityMoa_old", modEntityID++,  Main.instance, 80, 1, false);
	}

	@Override
	public void registerItemRenderer() {
		MinecraftForgeClient.registerItemRenderer(Main.neuralClamp, new RenderFuturePredatorClamp());
		MinecraftForgeClient.registerItemRenderer(Main.emdRifle, (IItemRenderer)new RenderEmdRifle());
	}
	
	@Override
	public void regsiterEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EmdCharge.class, new RenderSnowball(Main.emdTexture));
	}
}
