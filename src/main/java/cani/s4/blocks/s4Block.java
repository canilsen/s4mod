package cani.s4.blocks;

import java.util.List;

import cani.s4.s4;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class s4Block extends Block
{
	 public s4Block() 
     {
         
		 	 super(Material.iron);
             
             setHardness(4.0F); // 33% harder than diamond
             setStepSound(Block.soundTypeMetal);
             setBlockName("s4Block");
             setBlockTextureName("s4:s4Block");
             setCreativeTab(CreativeTabs.tabBlock);
     }
	 


         
        
}