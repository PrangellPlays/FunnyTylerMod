package dev.prangellplays.ftm;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class FunnyTylerMod implements ModInitializer {
	public static final String MOD_ID = "ftm";
	public static final Logger LOGGER = LoggerFactory.getLogger("ftm");

	@Override
	public void onInitialize() {

	}
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}