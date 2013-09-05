package com.cynrat.steamforge;

import com.cynrat.steamforge.blocks.Blocks;
import com.cynrat.steamforge.config.ConfigHandler;
import com.cynrat.steamforge.items.Items;
import com.cynrat.steamforge.lib.Reference;
import com.cynrat.steamforge.network.PacketHandler;
import com.cynrat.steamforge.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERS)
@NetworkMod(channels = {Reference.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class Steamforge {	
	
	@Instance(Reference.ID)
	public static Steamforge steamforge;
	
	@SidedProxy(clientSide = "com.cynrat.steamforge.proxies.ClientProxy", serverSide = "com.cynrat.steamforge.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void init(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		Items.init();
		Blocks.init();
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event) {
		Items.loadNames();
		Items.registerRecipes();
		
		Blocks.loadNames();
		
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
