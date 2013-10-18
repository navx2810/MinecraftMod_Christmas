package matt.christmas.items;

import matt.christmas.ChristmasMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ChristmasFood extends ItemFood {

	public ChristmasFood(int id, int hungerAmount, boolean isWolvesFavorite) {
		super(id, hungerAmount, isWolvesFavorite);
		this.setCreativeTab(ChristmasMod.tabChristmasCraft);
	}
	
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(ChristmasMod.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
