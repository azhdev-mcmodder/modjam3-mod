package Azhdev.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSpoon extends Item{

	public ItemSpoon(int ID) {
		super(ID);
		setUnlocalizedName(ItemInfo.Spoon_NAME);
		setCreativeTab(CreativeTabs.tabFood);
	}
	public void registerIcons(IconRegister register){
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOC + ":" + ItemInfo.Spoon_ICON);
	}
	@Override
	public boolean isFull3D(){
		return true;
	}
}
