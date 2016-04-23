package io.codebakery.thegame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import io.codebakery.thegame.TheGame;

public class DesktopLauncher {
    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "The Game";
        config.width = 1280;
        config.height = 720;
        config.resizable = false;
        new LwjglApplication(new TheGame(), config);
    }
}
