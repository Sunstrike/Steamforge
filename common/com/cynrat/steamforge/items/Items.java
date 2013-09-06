package com.cynrat.steamforge.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.cynrat.steamforge.blocks.Blocks;
import com.cynrat.steamforge.items.components.ItemBrassCog;
import com.cynrat.steamforge.items.components.ItemCogAssem;
import com.cynrat.steamforge.items.materials.ItemBrassIngot;
import com.cynrat.steamforge.items.materials.ItemBronzeIngot;
import com.cynrat.steamforge.items.materials.ItemCopperIngot;
import com.cynrat.steamforge.items.materials.ItemTinIngot;
import com.cynrat.steamforge.items.materials.ItemZincIngot;
import com.cynrat.steamforge.items.tools.ItemBrassPick;
import com.cynrat.steamforge.items.tools.ItemBronzePick;
import com.cynrat.steamforge.items.tools.ItemCopperPick;
import com.cynrat.steamforge.items.tools.ItemTinPick;
import com.cynrat.steamforge.items.tools.ItemZincPick;
import com.cynrat.steamforge.lib.ItemCompRef;
import com.cynrat.steamforge.lib.ItemIngotRef;
import com.cynrat.steamforge.lib.ItemToolRef;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	public static CreativeTabs tabComponents = new CreativeTabs("tabComponents") {
		public ItemStack getIconItemStack() {
			return new ItemStack(brassCog, 1);
		}
	};

	// Ingots
	public static Item brassIngot;
	public static Item bronzeIngot;
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item zincIngot;
	
	// picks
	public static Item brassPickaxe;
	public static Item bronzePickaxe;
	public static Item copperPickaxe;
	public static Item tinPickaxe;
	public static Item zincPickaxe;
	
	// axes
	public static Item brassAxe;
	public static Item bronzeAxe;
	public static Item copperAxe;
	public static Item tinAxe;
	public static Item zincAxe;
	
	// hoes
	public static Item brassHoe;
	public static Item bronzeHoe;
	public static Item copperHoe;
	public static Item tinHoe;
	public static Item zincHoe;
	
	// swords
	public static Item brassSword;
	public static Item bronzeSword;
	public static Item copperSword;
	public static Item tinSword;
	public static Item zincSword;
	
	// shovels
	public static Item brassShovel;
	public static Item bronzeShovel;
	public static Item copperShovel;
	public static Item tinShovel;
	public static Item zincShovel;
	
	// components
	public static Item brassCog;
	public static Item cogAssem;
	
	public static void init() {
		
		// Ingots
		brassIngot = new ItemBrassIngot(ItemIngotRef.INGOT_BRASS_ID);
		bronzeIngot = new ItemBronzeIngot(ItemIngotRef.INGOT_BRONZE_ID);
		copperIngot = new ItemCopperIngot(ItemIngotRef.INGOT_COPPER_ID);
		tinIngot = new ItemTinIngot(ItemIngotRef.INGOT_TIN_ID);
		zincIngot = new ItemZincIngot(ItemIngotRef.INGOT_ZINC_ID);
		
		// Picks
		brassPickaxe = new ItemBrassPick(ItemToolRef.TOOL_BRASS_PICK_ID, ItemMaterials.EnumToolMaterialBrass);
		bronzePickaxe = new ItemBronzePick(ItemToolRef.TOOL_BRONZE_PICK_ID, ItemMaterials.EnumToolMaterialBronze);
		copperPickaxe = new ItemCopperPick(ItemToolRef.TOOL_COPPER_PICK_ID, ItemMaterials.EnumToolMaterialCopper);
		tinPickaxe = new ItemTinPick(ItemToolRef.TOOL_TIN_PICK_ID, ItemMaterials.EnumToolMaterialTin);
		zincPickaxe = new ItemZincPick(ItemToolRef.TOOL_ZINC_PICK_ID, ItemMaterials.EnumToolMaterialZinc);
		// Axes
		
		// Hoes
		
		// Swords
		
		// Shovels
		
		// comps
		brassCog = new ItemBrassCog(ItemCompRef.COG_BRASS_ID);
		cogAssem = new ItemCogAssem(ItemCompRef.COG_ASSEM_ID);
				
	}
	
	public static void loadNames() {
		// Ingots
		LanguageRegistry.addName(brassIngot, ItemIngotRef.INGOT_BRASS_NAME);
		LanguageRegistry.addName(bronzeIngot, ItemIngotRef.INGOT_BRONZE_NAME);
		LanguageRegistry.addName(copperIngot, ItemIngotRef.INGOT_COPPER_NAME);
		LanguageRegistry.addName(tinIngot, ItemIngotRef.INGOT_TIN_NAME);
		LanguageRegistry.addName(zincIngot, ItemIngotRef.INGOT_ZINC_NAME);
		
		// tools
		
		// comps
		LanguageRegistry.addName(brassCog, ItemCompRef.COG_BRASS_NAME);
		LanguageRegistry.addName(cogAssem, ItemCompRef.COG_ASSEM_NAME);
	}
	
	public static void registerRecipes() {
		GameRegistry.addSmelting(new ItemStack(Blocks.oreCopper).itemID, new ItemStack(Items.copperIngot), 0.5F);
		GameRegistry.addSmelting(new ItemStack(Blocks.oreTin).itemID, new ItemStack(Items.tinIngot), 0.5F);
		GameRegistry.addSmelting(new ItemStack(Blocks.oreZinc).itemID, new ItemStack(Items.zincIngot), 0.5F);
	}
	
}
