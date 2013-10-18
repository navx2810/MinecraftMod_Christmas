package matt.tutorial;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTutorial extends Item {

	public ItemTutorial(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	

}
