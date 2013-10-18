//package matt.tutorial.ChristmasItems;
//
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//import matt.tutorial.Tutorial;
//import net.minecraft.block.Block;
//import net.minecraft.block.material.Material;
//import net.minecraft.client.renderer.texture.IconRegister;
//import net.minecraft.creativetab.CreativeTabs;
//
//public class PeppermintBlock extends Block {
//
//	public PeppermintBlock(int id, Material material) {
//		super(id, material);
//		setCreativeTab(Tutorial.tabChristmas);
//	}
//
//	@SideOnly(Side.CLIENT)
//	public void registerIcons(IconRegister iconRegister) {
//		this.blockIcon = iconRegister.registerIcon(Tutorial.modid + ":" + (this.getUnlocalizedName().substring(5)));
//	}
//	
//}
