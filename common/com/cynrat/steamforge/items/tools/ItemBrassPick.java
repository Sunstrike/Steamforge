package com.cynrat.steamforge.items.tools;

import com.cynrat.steamforge.lib.ItemToolRef;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemBrassPick extends ItemPickaxe {
	
	public ItemBrassPick(int id, EnumToolMaterial material) {
		super(id, material);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(ItemToolRef.TOOL_BRASS_PICK_UNLOC_NAME);
	}

}
