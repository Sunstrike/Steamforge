package com.cynrat.steamforge.items.tools;

import com.cynrat.steamforge.lib.ItemToolRef;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemTinPick extends ItemPickaxe {

	public ItemTinPick(int id, EnumToolMaterial material) {
		super(id, material);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(ItemToolRef.TOOL_TIN_PICK_UNLOC_NAME);
	}
	
}
