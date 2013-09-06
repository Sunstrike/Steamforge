package com.cynrat.steamforge.items.components;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.cynrat.steamforge.items.Items;
import com.cynrat.steamforge.lib.ItemCompRef;
import com.cynrat.steamforge.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCogAssem extends Item {
	
	public ItemCogAssem(int id) {
		super(id);
		setCreativeTab(Items.tabComponents);
		setUnlocalizedName(ItemCompRef.COG_ASSEM_UNLOC);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(Reference.ASSET_LOC + ItemCompRef.COG_ASSEM_TEX);
	}

}
