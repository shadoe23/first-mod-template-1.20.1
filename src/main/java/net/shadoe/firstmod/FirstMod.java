package net.shadoe.firstmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String Mod_Id = "firstmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("Mod_Id");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}