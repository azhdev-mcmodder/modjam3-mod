package Azhdev.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import Azhdev.items.ItemInfo;

public class blockFood extends Block{
	
	private int uses = 4;
	
	public blockFood(int ID, Material material) {
		super(ID, material);
		setUnlocalizedName(blockInfo.blockFood_KEY);
		setCreativeTab(CreativeTabs.tabFood);
	}
	
	@Override
	public void registerIcons(IconRegister register){
		blockIcon = register.registerIcon(ItemInfo.TEXTURE_LOC + ":" + blockInfo.blockFood_ICON);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, 
				float par7, float par8, float par9){
		if(!world.isRemote){
			if(player.getCurrentEquippedItem().itemID == ItemInfo.Spoon_ID){
				 uses--;
			}
		}
		return true;
	}
}
