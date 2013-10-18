package matt.christmas.blocks;

import java.util.Random;

import org.bouncycastle.asn1.x500.X500Name;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matt.christmas.ChristmasMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PresentBlock extends Block {
	
	Random random = new Random();
	ItemStack presentItem;
	
	public PresentBlock(int id) {
		super(id, Material.wood);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(ChristmasMod.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5) {
		super.onBlockDestroyedByPlayer(par1World, par2, par3, par4, par5);
		int x = random.nextInt(5);
		switch (x) {
		case 0:
			presentItem = new ItemStack(Item.coal,5);
			break;
		case 1:
			presentItem = new ItemStack(Item.swordDiamond);
			break;
		case 2: presentItem = new ItemStack(Item.goldenCarrot); break;
		case 3: presentItem = new ItemStack(Item.axeGold); break;
		case 4: presentItem = new ItemStack(Item.appleGold); break;
		default: presentItem = new ItemStack(Item.arrow);
			break;
		}
	}

	@Override
	protected void dropBlockAsItem_do(World par1World, int par2, int par3, int par4, ItemStack par5ItemStack) {
		// TODO Auto-generated method stub
		super.dropBlockAsItem_do(par1World, par2, par3, par4, presentItem);
	}
	
	@Override
	public void setBlockBoundsForItemRender() {
		this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
	}

}
