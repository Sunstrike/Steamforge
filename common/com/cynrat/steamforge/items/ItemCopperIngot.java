package com.cynrat.steamforge.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.cynrat.steamforge.lib.ItemIngotRef;
import com.cynrat.steamforge.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCopperIngot extends Item {

	public ItemCopperIngot(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(ItemIngotRef.INGOT_COPPER_UNLOC_NAME);
	}
	
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(Reference.ASSET_LOC + ItemIngotRef.INGOT_COPPER_ICON);
	}
	
}
