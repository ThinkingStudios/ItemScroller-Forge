package org.thinkingstudio.rocknroller;

import fi.dy.masa.itemscroller.ItemScroller;
import fi.dy.masa.itemscroller.Reference;
import fi.dy.masa.itemscroller.compat.modmenu.ModMenuImpl;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;
import org.thinkingstudio.mafglib.loader.entrypoints.ConfigScreenEntrypoint;

@Mod(value = Reference.MOD_ID, dist = Dist.CLIENT)
public class RocknRoller {
    public RocknRoller(ModContainer modContainer) {
        if (FMLLoader.getDist().isClient()) {
            modContainer.registerExtensionPoint(ConfigScreenEntrypoint.class, new ModMenuImpl());
            ItemScroller.onInitialize();
        }
    }
}