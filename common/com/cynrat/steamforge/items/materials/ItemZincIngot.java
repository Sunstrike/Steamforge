package com.cynrat.steamforge.items.materials;

import com.cynrat.steamforge.lib.ItemIngotRef;
import com.cynrat.steamforge.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemZincIngot extends Item {
	
	public ItemZincIngot(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(ItemIngotRef.INGOT_ZINC_UNLOC_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(Reference.ASSET_LOC + ItemIngotRef.INGOT_ZINC_ICON);
	}

}
