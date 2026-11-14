package com.port;
import java.io.File;

public class AssetDownloader {
    private static final String GAME_ASSETS_URL = "https://tu-servidor.com/juego_assets.zip";
    
    public static boolean checkAssetsExist(File internalDir) {
        File flagFile = new File(internalDir, "installed.flag");
        return flagFile.exists();
    }
}
