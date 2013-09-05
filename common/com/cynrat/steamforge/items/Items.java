package com.cynrat.steamforge.items;

import com.cynrat.steamforge.blocks.Blocks;
import com.cynrat.steamforge.lib.ItemIngotRef;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Items {

	public static Item brassIngot;
	public static Item bronzeIngot;
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item zincIngot;
	
	public static void init() {
		brassIngot = new ItemBrassIngot(ItemIngotRef.INGOT_BRASS_ID);
		bronzeIngot = new ItemBronzeIngot(ItemIngotRef.INGOT_BRONZE_ID);
		copperIngot = new ItemCopperIngot(ItemIngotRef.INGOT_COPPER_ID);
		tinIngot = new ItemTinIngot(ItemIngotRef.INGOT_TIN_ID);
		zincIngot = new ItemZincIngot(ItemIngotRef.INGOT_ZINC_ID);
	}
	
	public static void loadNames() {
		LanguageRegistry.addName(brassIngot, ItemIngotRef.INGOT_BRASS_NAME);
		LanguageRegistry.addName(bronzeIngot, ItemIngotRef.INGOT_BRONZE_NAME);
		LanguageRegistry.addName(copperIngot, ItemIngotRef.INGOT_COPPER_NAME);
		LanguageRegistry.addName(tinIngot, ItemIngotRef.INGOT_TIN_NAME);
		LanguageRegistry.addName(zincIngot, ItemIngotRef.INGOT_ZINC_NAME);
	}
	
	public static void registerRecipes() {
		GameRegistry.addSmelting(new ItemStack(Blocks.oreCopper).itemID, new ItemStack(Items.copperIngot), 0.5F);
		GameRegistry.addSmelting(new ItemStack(Blocks.oreTin).itemID, new ItemStack(Items.tinIngot), 0.5F);
		GameRegistry.addSmelting(new ItemStack(Blocks.oreZinc).itemID, new ItemStack(Items.zincIngot), 0.5F);
	}
	
}
