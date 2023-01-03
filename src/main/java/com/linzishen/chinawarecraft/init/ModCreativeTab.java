package com.linzishen.chinawarecraft.init;

import com.google.common.math.Quantiles;
import com.linzishen.chinawarecraft.blocks.ModBlocks;
import com.linzishen.chinawarecraft.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModCreativeTab {
	public static final CreativeTabs CHIPMOD_ITEM = new CreativeTabs(CreativeTabs.getNextID(), "chinawarecraftItemTab")
	{
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItems.PORCELAIN_SWORD);
        }
    };
    public static final CreativeTabs CHIPMOD_BLOCK = new CreativeTabs(CreativeTabs.getNextID(), "chinawarecraftBlockTab")
    {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModBlocks.WHITE_VASES);
        }
    };
}
