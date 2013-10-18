package matt.christmas.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matt.christmas.ChristmasMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GingerCookieRAW extends Item {

	public GingerCookieRAW(int id) {
		super(id);
		this.setCreativeTab(ChristmasMod.tabChristmasCraft);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(ChristmasMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
	@SideOnly(Side.CLIENT)
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ChristmasMod.cookieCutter));
		
	}

}
