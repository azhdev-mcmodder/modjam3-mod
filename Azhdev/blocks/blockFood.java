package Azhdev.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import Azhdev.items.ItemInfo;
import Azhdev.lib.status;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class blockFood extends BlockContainer{
	
	private boolean used = false;
	
	public blockFood(int ID, Material material) {
		super(ID, material);
		setUnlocalizedName(blockInfo.blockFood_KEY);
		setCreativeTab(CreativeTabs.tabFood);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		blockIcon = register.registerIcon(ItemInfo.TEXTURE_LOC + ":" + blockInfo.blockFood_ICON);
	}
	
	   @Override
       public TileEntity createNewTileEntity(World world) {
               return new tileEntityFood();
       }
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, 
				float par7, float par8, float par9){
		if(!world.isRemote){
			if(tileEntityFood.isReady()){
				player.setHealth(player.getHealth() + 2);
				tileEntityFood.uses--;
			}else{
				player.setHealth(player.getHealth() - 4);
				player.addExhaustion(4);
			}
		}
		return true;
	}
}
