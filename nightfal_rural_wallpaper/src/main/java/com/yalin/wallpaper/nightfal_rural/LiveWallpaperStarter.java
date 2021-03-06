package com.yalin.wallpaper.nightfal_rural;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.android.AndroidWallpaperListener;

public class LiveWallpaperStarter extends Game implements AndroidWallpaperListener {
    LiveWallpaperScreen myScreen;

    public void create() {
        this.myScreen = new LiveWallpaperScreen(this);
        setScreen(this.myScreen);
    }

    public void offsetChange(float xOffset, float yOffset, float xOffsetStep,
                             float yOffsetStep, int xPixelOffset, int yPixelOffset) {
    }

    public void previewStateChange(boolean isPreview) {
    }
}
