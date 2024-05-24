package org.thinkingstudio.rocknroller;

import fi.dy.masa.itemscroller.ItemScroller;
import fi.dy.masa.itemscroller.Reference;
import fi.dy.masa.itemscroller.gui.GuiConfigs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;
import org.thinkingstudio.mafglib.util.ForgePlatformUtils;

@Mod(value = Reference.MOD_ID, dist = Dist.CLIENT)
public class RocknRoller {
    public RocknRoller() {
        if (FMLLoader.getDist().isClient()) {
            ItemScroller.onInitialize();

            // Config Screen
            ForgePlatformUtils.getInstance().registerModConfigScreen(Reference.MOD_ID, (screen) -> {
                GuiConfigs gui = new GuiConfigs();
                gui.setParent(screen);
                return gui;
            });
        }
    }
}