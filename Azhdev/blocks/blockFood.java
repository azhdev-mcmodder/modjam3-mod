package Azhdev.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import Azhdev.items.ItemInfo;
import Azhdev.lib.status;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class blockFood extends Block{
	
	public static int uses = 0;
	
	public blockFood(int ID, Material material) {
		super(ID, material);
		setUnlocalizedName(blockInfo.blockFood_KEY);
		setCreativeTab(CreativeTabs.tabFood);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		blockIcon = register.registerIcon("aru:blockfood");
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, 
				float par7, float par8, float par9){
		if(!world.isRemote){
			if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().itemID == ItemInfo.Spoon_ID){
				 uses--;
				 status.spoon_filled = true;
			}
			if(uses == 0){
				return false;
			}
		System.out.println(uses);
		}
		return true;
	}
}
