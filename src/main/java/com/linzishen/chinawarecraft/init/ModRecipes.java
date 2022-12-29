package com.linzishen.chinawarecraft.init;

import com.linzishen.chinawarecraft.blocks.ModBlocks;
import com.linzishen.chinawarecraft.item.ModItems;
import com.linzishen.chinawarecraft.util.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModRecipes {
	
	
	public static void Init() {
		//Only smelting recipes
//		GameRegistry.addSmelting(ModItems.PURE_INGOT,
//				new ItemStack(ModItems.WEAPON_PEARL),
//				0.1f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.SULPHUR_COBALT_ORE),new ItemStack(ModItems.COBALT_INGOT,3),0.5f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.COBALTITE_ORE),new ItemStack(ModItems.COBALT_INGOT,2),0.5f);
		GameRegistry.addSmelting(new ItemStack(ModItems.WHITE_VASES_PROTOTYPE),new ItemStack(ModBlocks.WHITE_VASES,1),1f);
		GameRegistry.addSmelting(new ItemStack(ModItems.WHITE_DISH_PROTOTYPE),new ItemStack(ModBlocks.WHITE_DISH,1),1f);
		GameRegistry.addSmelting(new ItemStack(ModItems.CELADON_VASES_PROTOTYPE),new ItemStack(ModBlocks.CELADON_VASES,1),1f);
		GameRegistry.addSmelting(new ItemStack(ModItems.CELADON_DISH_PROTOTYPE),new ItemStack(ModBlocks.CELADON_DISH,1),1f);
		GameRegistry.addSmelting(new ItemStack(ModItems.BLUE_AND_WHITE_PORCELAIN_VASES_PROTOTYPE),new ItemStack(ModBlocks.BLUE_AND_WHITE_PORCELAIN_VASES,1),1f);
		GameRegistry.addSmelting(new ItemStack(ModItems.BLUE_AND_WHITE_PORCELAIN_DISH_PROTOTYPE),new ItemStack(ModBlocks.BLUE_AND_WHITE_PORCELAIN_DISH,1),1f);
	}
	
	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> evt) {
		IForgeRegistry<IRecipe> r = evt.getRegistry();
		//Example
		//r.register(new GobletFill().setRegistryName(new ResourceLocation(Reference.MOD_ID, "goblet_fill")));
	}
}
