package com.cynrat.steamforge.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;

import com.cynrat.steamforge.lib.BlockRef;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {

	public static Block oreCopper;
	public static Block oreTin;
	public static Block oreZinc;
	
	public static void init() {
		oreCopper = new BlockCopperOre(BlockRef.ORE_COPPER_ID);
		GameRegistry.registerBlock(oreCopper, BlockRef.ORE_COPPER_KEY);
		
		oreTin = new BlockTinOre(BlockRef.ORE_TIN_ID);
		GameRegistry.registerBlock(oreTin, BlockRef.ORE_TIN_KEY);
		
		oreZinc = new BlockZincOre(BlockRef.ORE_ZINC_ID);
		GameRegistry.registerBlock(oreZinc, BlockRef.ORE_ZINC_KEY);	
	}
	
	public static void loadNames() {
		LanguageRegistry.addName(oreCopper, BlockRef.ORE_COPPER_NAME);
		MinecraftForge.setBlockHarvestLevel(oreCopper, "pickaxe", 1);
		
		LanguageRegistry.addName(oreTin, BlockRef.ORE_TIN_NAME);
		MinecraftForge.setBlockHarvestLevel(oreTin, "pickaxe", 1);
		
		LanguageRegistry.addName(oreZinc, BlockRef.ORE_ZINC_NAME);
		MinecraftForge.setBlockHarvestLevel(oreZinc, "pickaxe", 1);
	}
	
	public static void registerTileEntities() {
		
	}
	
	public static void loadHarvestLevels() {
		
	}
	
}
