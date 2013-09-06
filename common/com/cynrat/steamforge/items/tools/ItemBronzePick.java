package com.cynrat.steamforge.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

import com.cynrat.steamforge.lib.ItemToolRef;

public class ItemBronzePick extends ItemPickaxe {

	public ItemBronzePick(int id, EnumToolMaterial material) {
		super(id, material);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(ItemToolRef.TOOL_BRONZE_PICK_UNLOC_NAME);
	}
	
}
