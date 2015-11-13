package com.wizcomdata.squifferbear;

public class CommonProxy {

	public void registerRenderers() {}

	public void registerEntities() {}

	public void registerItemRenderer() {}

	public void regsiterEntityRenderers() {}

	public void registerTileEntitySpecialRenderer() {}

	public void registerItemRenders() {}

	public void registerEntityRenders() {}

	public void registerRenderThings() {
		registerTileEntitySpecialRenderer();
		registerItemRenders();
		registerEntityRenders();
	}
}
