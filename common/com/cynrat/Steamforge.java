package com.cynrat;

import com.cynrat.lib.Reference;
import com.cynrat.network.PacketHandler;
import com.cynrat.proxies.CommonProxy;

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
	
	@SidedProxy(clientSide = "com.cynrat.proxies.ClientProxy", serverSide = "com.cynrat.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void init(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
