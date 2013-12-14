package Azhdev.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Items {
	
	public static Item spoon;
	public static Item handJuke;
	
	public static void init(){
		spoon = new ItemSpoon(ItemInfo.Spoon_ID);
		handJuke = new handheldJukebox(ItemInfo.handJuke_ID);
	}
	
	public static void addNames(){
		LanguageRegistry.addName(spoon, ItemInfo.Spoon_NAME);
		LanguageRegistry.addName(handJuke, ItemInfo.handJuke_NAME);
	}
}
