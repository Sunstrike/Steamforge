package com.cynrat.steamforge.config;

import java.io.File;

import net.minecraftforge.common.Configuration;

import com.cynrat.steamforge.lib.BlockOreRef;
import com.cynrat.steamforge.lib.ItemCompRef;
import com.cynrat.steamforge.lib.ItemIngotRef;
import com.cynrat.steamforge.lib.ItemToolRef;

public class ConfigHandler {
	
	
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		BlockOreRef.ORE_COPPER_ID = config.getBlock(BlockOreRef.ORE_COPPER_KEY, BlockOreRef.ORE_COPPER_DEFAULT).getInt();
		BlockOreRef.ORE_TIN_ID = config.getBlock(BlockOreRef.ORE_TIN_KEY, BlockOreRef.ORE_TIN_DEFAULT).getInt();
		BlockOreRef.ORE_ZINC_ID = config.getBlock(BlockOreRef.ORE_ZINC_KEY, BlockOreRef.ORE_ZINC_DEFAULT).getInt();
		
		ItemIngotRef.INGOT_BRASS_ID = config.getItem(ItemIngotRef.INGOT_BRASS_KEY, ItemIngotRef.INGOT_BRASS_DEFAULT).getInt() - 256;
		ItemIngotRef.INGOT_BRONZE_ID = config.getItem(ItemIngotRef.INGOT_BRONZE_KEY, ItemIngotRef.INGOT_BRONZE_DEFAULT).getInt() - 256;
		ItemIngotRef.INGOT_COPPER_ID = config.getItem(ItemIngotRef.INGOT_COPPER_KEY, ItemIngotRef.INGOT_COPPER_DEFAULT).getInt() - 256;
		ItemIngotRef.INGOT_TIN_ID = config.getItem(ItemIngotRef.INGOT_TIN_KEY, ItemIngotRef.INGOT_TIN_DEFAULT).getInt() - 256;
		ItemIngotRef.INGOT_ZINC_ID = config.getItem(ItemIngotRef.INGOT_ZINC_KEY, ItemIngotRef.INGOT_ZINC_DEFAULT).getInt() - 256;
		
		ItemToolRef.TOOL_STEAMHAMMER_ID = config.getItem(ItemToolRef.TOOL_STEAMHAMMER_KEY, ItemToolRef.TOOL_STEAMHAMMER_DEFAULT).getInt() - 256;
		
		ItemCompRef.COG_BRASS_ID = config.getItem(ItemCompRef.COG_BRASS_KEY, ItemCompRef.COG_BRASS_DEFAULT).getInt() - 256;
		
		config.save();
	}
	
}
