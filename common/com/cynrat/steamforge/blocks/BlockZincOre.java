package com.cynrat.steamforge.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

import com.cynrat.steamforge.lib.BlockOreRef;
import com.cynrat.steamforge.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockZincOre extends Block {
	
	public BlockZincOre(int id) {
		super(id, Material.rock);
		setHardness(2.5F);
		setCreativeTab(CreativeTabs.tabBlock);
		setUnlocalizedName(BlockOreRef.ORE_ZINC_UNLOC_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(Reference.ASSET_LOC + BlockOreRef.ORE_ZINC_TEX);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return blockIcon;
	}

}
