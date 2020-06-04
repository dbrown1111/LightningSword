package com.sarx.lightningsword;

import com.sarx.lightningsword.common.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LightningSword.modid)
public class LightningSword {

    final public static String modid = "lightningsword";
    final public static String name = "Sarx's Lightning Sword";
    final public static String version = "1.0-Alpha";

    public static final Logger LOGGER = LogManager.getLogger();

    public LightningSword() {

        final IEventBus swordBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(swordBus);
        ModItems.BLOCKS.register(swordBus);
        LOGGER.info("LightningSword Initiated!");

    }
}
