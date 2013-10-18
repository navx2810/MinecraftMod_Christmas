//package matt.tutorial;
//
//import net.minecraft.block.Block;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.crafting.FurnaceRecipes;
//import cpw.mods.fml.common.registry.GameRegistry;
//
//public class TutorialCrafting {
//
//	public static void loadRecipies() {
//
//		GameRegistry.addRecipe(new ItemStack(Tutorial.tutorialBlock), new Object[] { "X", "C", 'X', Item.swordIron, 'C', Block.stone });
//		GameRegistry.addRecipe(new ItemStack(Tutorial.candyKaneItem), new Object[] { "XX", " X", " X", 'X', new ItemStack(Item.sugar) });
//		GameRegistry.addShapelessRecipe(new ItemStack(Tutorial.tutorialBlock, 5), new Object[] { new ItemStack(Item.diamond), new ItemStack(Block.stone), new ItemStack(Item.dyePowder, 1, 15) });
//
//		FurnaceRecipes.smelting().addSmelting(Tutorial.candyKaneItem.itemID, new ItemStack(Tutorial.burnedCandyKaneItem), 0.1f);
//
//	}
//
//}
