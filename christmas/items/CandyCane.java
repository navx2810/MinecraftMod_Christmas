package matt.christmas.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matt.christmas.ChristmasMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class CandyCane extends ItemFood {

	
	
	public CandyCane(int id, int healAmount, boolean isWolvesFavorite) {
		super(id, healAmount, isWolvesFavorite);
		this.setCreativeTab(ChristmasMod.tabChristmasCraft);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(ChristmasMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	

}
