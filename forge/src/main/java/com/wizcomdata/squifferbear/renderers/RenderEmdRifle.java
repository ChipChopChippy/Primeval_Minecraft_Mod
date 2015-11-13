package com.wizcomdata.squifferbear.renderers;

import org.lwjgl.opengl.GL11;

import com.wizcomdata.squifferbear.Main;
import com.wizcomdata.squifferbear.models.ModelEmdRifle;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderEmdRifle implements IItemRenderer {

	public static ResourceLocation tex = new ResourceLocation(Main.MODID, "textures/models/emdRifle.png");

	private ModelEmdRifle gun;

	public RenderEmdRifle() {
		gun = new ModelEmdRifle();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {

		case EQUIPPED:
			return true;
		case EQUIPPED_FIRST_PERSON:
			return true;
		case ENTITY:
			return true;
		case INVENTORY:
			return false;

		default:
			return false;

		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {

		case EQUIPPED: {
			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(tex);

			GL11.glScalef(.8F, 1.0F, 1.4F);

			GL11.glRotatef(90, 0F, 1F, 0F);
			GL11.glRotatef(130, 1F, 0F, 0F);
			GL11.glRotatef(10, 0F, 0F, 1F);

			GL11.glTranslatef(0.06F, -.8F, -0.8F);

			this.gun.renderModel(0.0625F);
			GL11.glPopMatrix();
			break;
		}
		case EQUIPPED_FIRST_PERSON: {

			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(tex);

			GL11.glScalef(.8F, 1.0F, 1.4F);

			GL11.glRotatef(90, 0F, 1F, 0F);
			GL11.glRotatef(130, 1F, 0F, 0F);
			GL11.glRotatef(20, 0F, 0F, 1F);
			GL11.glTranslatef(0.3F, -.8F, -0.55F);
			this.gun.renderModel(0.0625F);
			GL11.glPopMatrix();
			break;

		}
		case ENTITY: {
			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(tex);

			if (item.isOnItemFrame()) {
				GL11.glScalef(0.7F, 0.5F, 0.7F);
				GL11.glRotatef(180, 1F, 0F, 0F);
				GL11.glTranslatef(0F, 2.4F, 0.7F);
				this.gun.renderModel(0.0625F);
				GL11.glPopMatrix();
			}
			GL11.glScalef(0.7F, 0.5F, 0.7F);
			GL11.glRotatef(180, 1F, 0F, 0F);
			GL11.glTranslatef(0F, -2F, 0F);
			this.gun.renderModel(0.0625F);
			GL11.glPopMatrix();
			break;
		}
		case INVENTORY: {
			GL11.glPushMatrix();
			Minecraft.getMinecraft().renderEngine.bindTexture(tex);
			GL11.glScalef(0.4F, 0.2F, 0.4F);
			GL11.glRotatef(180, 1F, 0F, 0F);
			GL11.glTranslatef(0F, -2F, 0F);
			this.gun.renderModel(0.0625F);
			GL11.glPopMatrix();
			break;
		}

		default:
			break;
		}
	}

}
