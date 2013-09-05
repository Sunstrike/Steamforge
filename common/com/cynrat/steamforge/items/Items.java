package com.cynrat.steamforge.items;

import com.cynrat.steamforge.lib.ItemRef;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items {

	public static Item copperIngot;
	public static Item tinIngot;
	public static Item zincIngot;
	
	public static void init() {
		copperIngot = new ItemCopperIngot(ItemRef.INGOT_COPPER_ID);
		tinIngot = new ItemTinIngot(ItemRef.INGOT_TIN_ID);
		zincIngot = new ItemZincIngot(ItemRef.INGOT_ZINC_ID);
	}
	
	public static void loadNames() {
		LanguageRegistry.addName(copperIngot, ItemRef.INGOT_COPPER_NAME);
		LanguageRegistry.addName(tinIngot, ItemRef.INGOT_TIN_NAME);
		LanguageRegistry.addName(zincIngot, ItemRef.INGOT_ZINC_NAME);
	}
	
	public static void registerRecipes() {
		
	}
	
}
