package org.thinkingstudio.rocknroller;

import fi.dy.masa.itemscroller.ItemScroller;
import fi.dy.masa.itemscroller.Reference;
import fi.dy.masa.malilib.compat.modmenu.ModMenuImpl;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = Reference.MOD_ID, dist = Dist.CLIENT)
public class RocknRoller {
    public RocknRoller(ModContainer modContainer) {
        if (FMLLoader.getDist().isClient()) {
            ItemScroller.onInitialize();

            modContainer.registerExtensionPoint(IConfigScreenFactory.class, new ModMenuImpl().getModConfigScreenFactory());
        }
    }
}