package matt.christmas.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matt.christmas.ChristmasMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class CookieCutter extends Item {

	public CookieCutter(int id) {
		super(id);
		this.setCreativeTab(ChristmasMod.tabChristmasCraft);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(ChristmasMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
