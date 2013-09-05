package com.cynrat.steamforge.items;

import com.cynrat.steamforge.lib.ItemRef;
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
	}
	
	public String getUnlocalizedName(ItemStack itemstack) {
		return ItemRef.INGOT_ZINC_UNLOC_NAME;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(Reference.ASSET_LOC + ItemRef.INGOT_ZINC_ICON);
	}

}
