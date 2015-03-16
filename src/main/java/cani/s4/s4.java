package cani.s4;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid="s4", name="Sssserverium", version="0.0.1")
//@NetworkMod(clientSideRequired=true, serverSideRequired=false) //Used in 1.6.4 and before
public class s4 {
        @Instance(value="s4")
        public static s4 instance;

        @SidedProxy(clientSide="cani.s4.client.ClientProxy",
                        serverSide="cani.s4.CommonProxy")
        public static CommonProxy proxy;

        public static Item s4Item;
        public static Block s4Block;
        

        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	
                s4Item = new cani.s4.items.s4Item();
                s4Block = new cani.s4.blocks.s4Block();

                
                
                GameRegistry.registerItem(s4Item, "s4Item");
                GameRegistry.registerBlock(s4Block, "s4Block");
                GameRegistry.addRecipe(new ItemStack(s4.s4Block), new Object[]{
            		"AAA",
            		"AAA",
            		"AAA",
            		'A', s4.s4Item
            	});


            
            

        }

        @EventHandler
        public void init(FMLInitializationEvent event) {
        }

        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}