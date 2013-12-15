package Azhdev.blocks;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class tileEntityFood extends TileEntity{
	
	public static boolean ready = true;
	public static int uses = 5;
	public tileEntityFood(){
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound){
		super.writeToNBT(compound);
		NBTTagList nbttaglist = new NBTTagList();
		
		
	}
	
    @Override
    public void readFromNBT(NBTTagCompound compound){
            super.readFromNBT(compound);
    }
    
    @Override
    public void updateEntity(){
    }
    
    public static boolean isReady(){
    	if(uses == 0){
    		return false;
    	}
    	return true;
    }
}
