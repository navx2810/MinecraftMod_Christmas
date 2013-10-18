package matt.christmas.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matt.christmas.ChristmasMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class GingerCookieCOOKED extends ItemFood {

	public GingerCookieCOOKED(int id, int hungerRestore, boolean isWolveFood) {
		super(id, hungerRestore, isWolveFood);
		this.setCreativeTab(ChristmasMod.tabChristmasCraft);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(ChristmasMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
