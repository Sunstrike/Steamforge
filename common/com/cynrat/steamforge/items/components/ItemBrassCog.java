package com.cynrat.steamforge.items.components;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.cynrat.steamforge.items.Items;
import com.cynrat.steamforge.lib.ItemCompRef;
import com.cynrat.steamforge.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBrassCog extends Item {
	
	public ItemBrassCog(int id) {
		super(id);
		setCreativeTab(Items.tabComponents);
		setUnlocalizedName(ItemCompRef.COG_BRASS_UNLOC);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(Reference.ASSET_LOC + ItemCompRef.COG_BRASS_TEX);
	}
	
}
