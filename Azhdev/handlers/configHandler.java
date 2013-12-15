package Azhdev.handlers;

import java.io.File;

import Azhdev.blocks.blockInfo;
import Azhdev.items.ItemInfo;
import net.minecraftforge.common.Configuration;

public class configHandler {
		public static void init(File file){
			Configuration config = new Configuration(file);
			config.load();
			
			blockInfo.blockFood_ID = config.getBlock(blockInfo.blockFood_KEY, blockInfo.blockFood_DEFAULT).getInt();
			
			ItemInfo.Spoon_ID = config.getItem(ItemInfo.Spoon_KEY, ItemInfo.Spoon_DEFAULT).getInt() - 256;
		}
}
