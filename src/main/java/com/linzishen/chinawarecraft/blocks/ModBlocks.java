package com.linzishen.chinawarecraft.blocks;

import java.util.ArrayList;
import java.util.List;

import com.linzishen.chinawarecraft.blocks.blockBasic.ModBlockGlassBase;
import com.linzishen.chinawarecraft.blocks.blockBasic.ModBlockPorcelainBase;
import com.linzishen.chinawarecraft.init.ModCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	/*
	 * To add a block, put a line here,
	 * -Create a json at assets.eo.blockstates
	 * -Create a json at assets.eo.models.block
	 * -Create a json at assets.eo.models.item
	 * -Add corresponding texture png
	 */

	//public static final Block GRID_BLOCK_1 = new BlockBase("test", Material.CLAY).setCreativeTab(ModCreativeTab.IDL_MISC).setHardness(15f);
	/*
	不完全方块使用ModBlockGlassBase(),完全方块使用BlockBase()
	*/
	public static final Block SULPHUR_COBALT_ORE = new BlockBase("sulphur_cobalt_ore", Material.ROCK).setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);
	public static final Block COBALTITE_ORE = new BlockBase("cobaltite_ore",Material.ROCK).setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);
	public static final Block KAOLINITE_SOIL = new BlockBase("kaolinite_soil",Material.ROCK).setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);
	public static final Block HEMATITE_ORE = new BlockBase("hematite_ore",Material.ROCK).setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);
	public static final Block WHITE_VASES = new ModBlockPorcelainBase("white_vases",Material.GLASS).setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);
	public static final Block WHITE_DISH = new ModBlockPorcelainBase("white_dish",Material.GLASS).setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);
	public static final Block CELADON_VASES = new ModBlockPorcelainBase("celadon_vases",Material.GLASS).setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);
	public static final Block CELADON_DISH = new ModBlockPorcelainBase("celadon_dish",Material.GLASS).setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);
	public static final Block BLUE_AND_WHITE_PORCELAIN_VASES = new ModBlockPorcelainBase("blue_and_white_porcelain_vases",Material.GLASS).setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);
	public static final Block BLUE_AND_WHITE_PORCELAIN_DISH = new ModBlockPorcelainBase("blue_and_white_porcelain_dish",Material.GLASS).setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);
	public static final Block PORCELAIN_CARVING_BEIJING_RABBIT = new ModBlockPorcelainBase("porcelain_carving_beijing_rabbit",Material.GLASS).setCreativeTab(ModCreativeTab.CHIPMOD_BLOCK);
}
