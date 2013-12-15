package Azhdev.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
	
	public static Block blockFood;
	
	public static void init(){
		blockFood = new blockFood(blockInfo.blockFood_ID, Material.coral);
		GameRegistry.registerBlock(blockFood);
	}
	
	public static void addnames(){
		LanguageRegistry.addName(blockFood, blockInfo.blockFood_NAME);
	}
	
	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(tileEntityFood.class, blockInfo.blockFood_KEY);
	}
}
