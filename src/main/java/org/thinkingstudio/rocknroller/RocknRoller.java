package org.thinkingstudio.rocknroller;

import fi.dy.masa.itemscroller.ItemScroller;
import fi.dy.masa.itemscroller.Reference;
import fi.dy.masa.itemscroller.gui.GuiConfigs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;
import org.thinkingstudio.mafglib.util.NeoUtils;

@Mod(value = Reference.MOD_ID, dist = Dist.CLIENT)
public class RocknRoller {
    public RocknRoller(ModContainer modContainer) {
        if (FMLLoader.getDist().isClient()) {
            ItemScroller.onInitialize();

            // Config Screen
            NeoUtils.getInstance().registerConfigScreen(modContainer, (screen) -> {
                GuiConfigs gui = new GuiConfigs();
                gui.setParent(screen);
                return gui;
            });
        }
    }
}