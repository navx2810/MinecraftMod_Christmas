//package matt.tutorial;
//
//import matt.tutorial.ChristmasItems.BurnedCandyKane;
//import matt.tutorial.ChristmasItems.CandyKane;
//import matt.tutorial.ChristmasItems.PeppermintBlock;
//import net.minecraft.block.Block;
//import net.minecraft.block.StepSound;
//import net.minecraft.block.material.MapColor;
//import net.minecraft.block.material.Material;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemFood;
//import net.minecraft.item.ItemStack;
//import cpw.mods.fml.common.Mod;
//import cpw.mods.fml.common.Mod.EventHandler;
//import cpw.mods.fml.common.event.FMLInitializationEvent;
//import cpw.mods.fml.common.network.NetworkMod;
//import cpw.mods.fml.common.registry.GameRegistry;
//import cpw.mods.fml.common.registry.LanguageRegistry;
//
//@Mod(modid = Tutorial.modid, name = "First Tutorial Mod", version = "1.0")
//@NetworkMod(clientSideRequired = true, serverSideRequired = false)
//public class Tutorial {
//	
//	public static final String modid = "Matt_Tutorial";
//	
//	public static Block tutorialBlock;
//	public static Item tutorialItem;
//	public static Item wrapperItem;
//	public static ItemFood candyKaneItem;
//	public static Item burnedCandyKaneItem;
//	public static Block peppermintBlock;
//	
////	public static Material candyMaterial = new Material(MapColor.tntColor);
//
//	
//	public static CreativeTabs tabChristmas = new CreativeTabs("tabChristmas"){
//		public ItemStack getIconItemStack() {
//			return new ItemStack(Item.snowball, 1, 0);
//		}
//	};
//	
//	
//	@EventHandler
//	public void load(FMLInitializationEvent event)
//	{
//		tutorialBlock = new BlockTutorialBlock(500, Material.rock).setUnlocalizedName("tutorialBlock");
//		GameRegistry.registerBlock(tutorialBlock, modid+tutorialBlock.getUnlocalizedName().substring(5));
//		LanguageRegistry.addName(tutorialBlock, "Tutorial Block");
//		
//		tutorialItem = new ItemTutorial(5000).setUnlocalizedName("tutorialItem");
//		LanguageRegistry.addName(tutorialItem, "Tutorial Item");
//		
//		//Start of Christmas items
//		
//		
//		burnedCandyKaneItem = new BurnedCandyKane(5002).setUnlocalizedName("burnedCandyKaneItem");
//		LanguageRegistry.addName(burnedCandyKaneItem, "Burned Candy Kane");
//		
//		peppermintBlock = new PeppermintBlock(501, Material.glass).setUnlocalizedName("peppermintBlock");
//		peppermintBlock.setLightValue(1f);
//		
//		GameRegistry.registerBlock(peppermintBlock, modid+peppermintBlock.getUnlocalizedName().substring(5));
//		LanguageRegistry.addName(peppermintBlock, "Peppermint Block");
//		
//		
//		LanguageRegistry.instance().addStringLocalization("itemGroup.tabChristmas", "en_US", "ChristmasCraft");
//		
//		TutorialCrafting.loadRecipies();
//		
//		
//	}
//}
