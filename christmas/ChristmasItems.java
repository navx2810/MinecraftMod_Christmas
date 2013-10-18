package matt.christmas;

import cpw.mods.fml.common.registry.LanguageRegistry;
import matt.christmas.items.CandyCane;
import matt.christmas.items.CookieCutter;
import matt.christmas.items.GingerCookieCOOKED;
import matt.christmas.items.GingerCookieRAW;
import matt.christmas.items.GingerDough;
import matt.christmas.items.GingerItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ChristmasItems {
	
	public static Item gingerItem;
	public static Item gingerbreadCookieCutter;
	public static Item gingerDough;
	public static Item gingerCookieRAW;
	public static ItemFood gingerCookieCOOKED;
	public static Item candyCane;
	public static Block presentBlock;
	
	public static void loadItems() {
		
		gingerItem = new GingerItem(6000).setUnlocalizedName("gingerItem");
			LanguageRegistry.addName(gingerItem, "Ginger");
			MinecraftForge.addGrassSeed(new ItemStack(gingerItem), 10);		//UNTIL I CAN GET THE CROPS WORKING | THIS WILL DO
		gingerbreadCookieCutter = new CookieCutter(6002).setUnlocalizedName("gingerbreadCookieCutter");
			LanguageRegistry.addName(gingerbreadCookieCutter, "Gingerbread Cookie Cutter");
		gingerDough = new GingerDough(6003).setUnlocalizedName("gingerDough");
			LanguageRegistry.addName(gingerDough, "Ginger Dough");
		gingerCookieRAW = new GingerCookieRAW(6004).setUnlocalizedName("gingerCookieRAW");
			LanguageRegistry.addName(gingerCookieRAW, "Raw Ginger Cookie");
		gingerCookieCOOKED = (ItemFood) new GingerCookieCOOKED(6005, 6, false).setUnlocalizedName("gingerCookieBAKED");
			LanguageRegistry.addName(gingerCookieCOOKED, "Baked Ginger Cookie");
		candyCane = new CandyCane(6006, 6, false).setUnlocalizedName("candyCaneItem");
			LanguageRegistry.addName(candyCane, "Candy Kane");
	}

}
