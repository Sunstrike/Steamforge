package com.cynrat.steamforge

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.network.NetworkMod
import com.cynrat.steamforge.lib.Repo._
import com.cynrat.steamforge.network.PacketHandler
import com.cynrat.steamforge.config.ConfigHandler
import com.cynrat.steamforge.items.Items
import com.cynrat.steamforge.blocks.Blocks
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLPreInitializationEvent, FMLInitializationEvent}

@Mod(modid = MODID, name = NAME, version = VERSION, modLanguage = "scala")
@NetworkMod(channels = CHANNELS, clientSideRequired = true, serverSideRequired = false, packetHandler = classOf[PacketHandler])
object Steamforge {

    @EventHandler
    def init(event: FMLPreInitializationEvent) {
        ConfigHandler.init(event.getSuggestedConfigurationFile)
        Items.init()
        Blocks.init()
    }

    @EventHandler
    def load(event: FMLInitializationEvent) {
        Items.loadNames()
        Items.registerRecipes()
        Blocks.loadNames()
    }

    @EventHandler
    def postInit(event: FMLPostInitializationEvent) {

    }

}
