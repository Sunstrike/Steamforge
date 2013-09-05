package com.cynrat.steamforge.config;

import java.io.File;

import com.cynrat.steamforge.lib.BlockRef;
import com.cynrat.steamforge.lib.ItemRef;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	
	
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		BlockRef.ORE_COPPER_ID = config.getBlock(BlockRef.ORE_COPPER_KEY, BlockRef.ORE_COPPER_DEFAULT).getInt();
		BlockRef.ORE_TIN_ID = config.getBlock(BlockRef.ORE_TIN_KEY, BlockRef.ORE_TIN_DEFAULT).getInt();
		BlockRef.ORE_ZINC_ID = config.getBlock(BlockRef.ORE_ZINC_KEY, BlockRef.ORE_ZINC_DEFAULT).getInt();
		
		ItemRef.INGOT_COPPER_ID = config.getItem(ItemRef.INGOT_COPPER_KEY, ItemRef.INGOT_COPPER_DEFAULT).getInt() - 256;
		ItemRef.INGOT_TIN_ID = config.getItem(ItemRef.INGOT_TIN_KEY, ItemRef.INGOT_TIN_DEFAULT).getInt() - 256;
		ItemRef.INGOT_ZINC_ID = config.getItem(ItemRef.INGOT_ZINC_KEY, ItemRef.INGOT_ZINC_DEFAULT).getInt() - 256;
		
		config.save();
	}
	
}
