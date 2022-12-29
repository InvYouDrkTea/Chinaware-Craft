package com.linzishen.chinawarecraft.blocks;

import java.util.Random;

import com.linzishen.chinawarecraft.init.ModCreativeTab;
import com.linzishen.chinawarecraft.item.ModItems;
import com.linzishen.chinawarecraft.IdlFramework;
import com.linzishen.chinawarecraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);;
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

		setHardness(5.0F);
		//setResistance(1000.0F);
		//setHarvestLevel("pickaxe", 1);
		//setLightLevel(1f);
		setLightOpacity(1);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return super.getItemDropped(state, rand, fortune);
	}

	@Override
	public int quantityDropped(Random rand) {
		return super.quantityDropped(rand);
	}
	
	@Override
	public void registerModels() {
		IdlFramework.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
