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
		
		compound.setShort("uses", (short)uses);
		compound.setBoolean("ready", ready);
		
	}
	
    @Override
    public void readFromNBT(NBTTagCompound compound){
            super.readFromNBT(compound);
            
            uses = compound.getShort("uses");
            ready = compound.getBoolean("ready");
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
