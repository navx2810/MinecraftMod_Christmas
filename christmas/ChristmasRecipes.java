package matt.christmas;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class ChristmasRecipes {
	
	public static void loadRecipies(){
		
		/* *****************************
		 *  SHAPELESS CRAFTING RECIPIES
		 * *****************************/
		GameRegistry.addShapelessRecipe(new ItemStack(ChristmasMod.gingerDough), new Object[]{ new ItemStack(ChristmasMod.gingerItem), new ItemStack(Item.bucketWater), new ItemStack(Item.wheat) });
		GameRegistry.addShapelessRecipe(new ItemStack(ChristmasMod.gingerCookieRAW, 6), new Object[] { new ItemStack(ChristmasMod.gingerDough), new ItemStack(ChristmasMod.cookieCutter) });
		/* *************************
		 * SHAPED CRAFTING RECIPIES
		 * *************************/
		
		/* ***************************
		 *  FURNACE SMELTING RECIPIES
		 * ***************************/
		FurnaceRecipes.smelting().addSmelting(ChristmasMod.gingerCookieRAW.itemID, new ItemStack(ChristmasMod.gingerCookieCOOKED), 0.1f);
		
	}

}
