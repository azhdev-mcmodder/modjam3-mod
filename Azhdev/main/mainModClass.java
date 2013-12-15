package Azhdev.main;

import Azhdev.blocks.Blocks;
import Azhdev.handlers.configHandler;
import Azhdev.items.Items;
import Azhdev.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class mainModClass {
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event){
		configHandler.init(event.getSuggestedConfigurationFile());
		Items.init();
		Blocks.init();
		
		Blocks.registerTileEntities();
	}
	@EventHandler
	public void Init(FMLInitializationEvent event){
		Items.addNames();
		Blocks.addnames();
	}
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event){
		
	}
}
