package eu.octanne.codelyoko;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class CodeLyokoMain implements ModInitializer {

	public static Logger LOGGER = LogManager.getLogger();

	public static final String MOD_ID = "codelyoko";
    public static final String MOD_NAME = "CodeLyoko";
    public static final Identifier MOD_FULL_ID = new Identifier(CodeLyokoMain.MOD_ID, CodeLyokoMain.MOD_ID);

	public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

	public static void log(String message) {
        LOGGER.log(Level.INFO, "[" + MOD_NAME + "] " + message);
    }

	@Override
	public void onInitialize() {
		CodeLyokoMain.log("Initialisation du mod CodeLyoko!");
	}
}
