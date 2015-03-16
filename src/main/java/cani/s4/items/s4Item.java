package cani.s4.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class s4Item extends Item {

        public s4Item() {
                maxStackSize = 64;
                
                setUnlocalizedName("s4Item");
                setTextureName("s4:s4Item");
                setCreativeTab(CreativeTabs.tabMisc);
        }
        
        @Override
        @SideOnly(Side.CLIENT)
        public EnumRarity getRarity(ItemStack par1ItemStack){
        	return EnumRarity.epic;
        }
        @Override
        public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean par4)
        {
            list.add("Makes dank tools");
        }
        
        @Override
        public boolean hasEffect(ItemStack par1ItemStack){
        	return true;
        }
        
}