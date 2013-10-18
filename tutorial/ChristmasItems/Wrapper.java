//package matt.tutorial.ChristmasItems;
//
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//import matt.tutorial.Tutorial;
//import net.minecraft.client.renderer.texture.IconRegister;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.Item;
//
//public class Wrapper extends Item {
//
//	public Wrapper(int par1) {
//		super(par1);
//		this.setCreativeTab(CreativeTabs.tabMaterials);
//	}
//	
//	@SideOnly(Side.CLIENT)
//	public void registerIcons(IconRegister iconRegister) {
//		this.itemIcon = iconRegister.registerIcon(Tutorial.modid + ":" + (this.getUnlocalizedName().substring(5)));
//	}
//	
//
//}
