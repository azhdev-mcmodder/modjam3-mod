package Azhdev.items;

import Azhdev.lib.status;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSpoon extends Item{

	public ItemSpoon(int ID) {
		super(ID);
		setUnlocalizedName(ItemInfo.Spoon_NAME);
		setCreativeTab(CreativeTabs.tabFood);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon empty;
	@SideOnly(Side.CLIENT)
	private Icon filled;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOC + ":" + ItemInfo.Spoon_ICON);
		filled = register.registerIcon(ItemInfo.TEXTURE_LOC + ":" + ItemInfo.Spoon_filled);
	}
	
	@Override
	public boolean isFull3D(){
		return true;
	}
}
