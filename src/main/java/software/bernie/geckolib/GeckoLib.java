/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib.example.KeyboardHandler;
import software.bernie.geckolib.listener.ModEventBus;

@Mod(modid = GeckoLib.ModID, name = GeckoLib.NAME, version = GeckoLib.VERSION)
public class GeckoLib
{
    @Mod.Instance
    public static GeckoLib INSTANCE;

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String ModID = "geckolib";
    public static final String NAME = "GeckoLib";
    public static final String VERSION = "2.0.0";

    @Mod.EventHandler
    public void pre(FMLPreInitializationEvent e) {
        final KeyboardHandler keyboardHandler = new KeyboardHandler();
        MinecraftForge.EVENT_BUS.register(keyboardHandler);
        FMLCommonHandler.instance().bus().register(keyboardHandler);

        ModEventBus.registerEntities();
        ModEventBus.registerRenderers();
    }
}