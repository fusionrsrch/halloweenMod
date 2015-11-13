package com.zoneix.halloweenMod;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = HalloweenMod.MODID, version = HalloweenMod.VERSION, name = HalloweenMod.NAME)
public class HalloweenMod
{
    public static final String MODID = "HalloweenMod";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "Halloween Mod";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
