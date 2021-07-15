package eu.octanne.codelyoko.server;

import eu.octanne.codelyoko.CodeLyokoMain;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.minecraft.server.MinecraftServer;

public class CodeLyokoServer extends CodeLyokoMain implements DedicatedServerModInitializer {

    private static MinecraftServer minecraftServer;

    public static final MinecraftServer getMinecraftServer() {
        return minecraftServer;
    }

    public CodeLyokoServer() {
        super();
    }

    @Override
    public void onInitializeServer() {
        
    }
    
}
