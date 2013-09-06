package com.cynrat.steamforge.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

import com.cynrat.steamforge.lib.ItemToolRef;

public class ItemCopperPick extends ItemPickaxe {

	public ItemCopperPick(int id, EnumToolMaterial material) {
		super(id, material);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(ItemToolRef.TOOL_COPPER_PICK_UNLOC_NAME);
	}
	
}
