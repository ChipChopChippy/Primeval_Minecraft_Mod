package com.wizcomdata.squifferbear.primeval.futurepredator;

import com.wizcomdata.squifferbear.Main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderFuturePredatorClamp implements IItemRenderer {

	NeuralClamp clamp;
	Minecraft mc;
	private static final ResourceLocation mobTextures = new ResourceLocation(
			Main.MODID + ":textures/items/neuralClamp.png");

	public RenderFuturePredatorClamp() {
		clamp = new NeuralClamp();
		mc = Minecraft.getMinecraft();
		System.out.println("IN RENDERFUTUREPREDATORCLAMP CONSTRUCTOR");

	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	public static ResourceLocation getMobtextures() {
		return mobTextures;
	}

	public void renderItem() {
		System.out.println("IN renderItem METHOD2");
		mc.renderEngine.bindTexture(new ResourceLocation(Main.MODID + ":textures/items/neuralClamp.png"));
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		System.out.println("IN renderItem METHOD");

		mc.renderEngine.bindTexture(new ResourceLocation(Main.MODID + ":textures/items/neuralClamp.png"));
	}

}
