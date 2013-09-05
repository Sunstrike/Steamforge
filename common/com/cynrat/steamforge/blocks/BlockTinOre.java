package com.cynrat.steamforge.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

import com.cynrat.steamforge.lib.BlockRef;
import com.cynrat.steamforge.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTinOre extends Block {
	
	public BlockTinOre(int id) {
		super(id, Material.rock);
		setHardness(2.5F);
		setCreativeTab(CreativeTabs.tabBlock);
		setUnlocalizedName(BlockRef.ORE_TIN_UNLOC_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(Reference.ASSET_LOC + BlockRef.ORE_TIN_TEX);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return blockIcon;
	}

}
