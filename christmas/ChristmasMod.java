package matt.christmas;

import matt.christmas.blocks.PresentBlock;
import matt.christmas.items.CandyCane;
import matt.christmas.items.CookieCutter;
import matt.christmas.items.GingerCookieCOOKED;
import matt.christmas.items.GingerCookieRAW;
import matt.christmas.items.GingerDough;
import matt.christmas.items.GingerItem;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = ChristmasMod.modid, name = "ChristmasCraft", version = "alpha 0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ChristmasMod {

	public static final String modid = "ChristmasCraft";
	public static int ID_ITEMS = 6000;
	public static int ID_BLOCKS = 500;

	public static CreativeTabs tabChristmasCraft = new CreativeTabs("ChristmasCraft") {
		public ItemStack getIconItemStack() {
			return new ItemStack(Item.snowball, 1, 0);
		}
	};

//	public static Block gingerBlock;
	public static Item gingerItem;
	public static Item cookieCutter;
	public static Item gingerDough;
	public static Item gingerCookieRAW;
	public static ItemFood gingerCookieCOOKED;
	public static Item candyCane;
	public static Block presentBlock;
	
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		// [ ----- BLOCKS ----- ]
		presentBlock = new PresentBlock(500).setUnlocalizedName("presentBlock");
			GameRegistry.registerBlock(presentBlock,"presentBlock");
			LanguageRegistry.addName(presentBlock, "Present");
			
		// [ ----- ITEMS ----- ]	
		ChristmasItems.loadItems();
			
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.ChristmasCraft", "ChristmasCraft");
		ChristmasRecipes.loadRecipies();
	}



	

	

}
