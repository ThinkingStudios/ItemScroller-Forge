package org.thinkingstudio.rocknroller;

import fi.dy.masa.itemscroller.ItemScroller;
import fi.dy.masa.itemscroller.Reference;
import fi.dy.masa.itemscroller.event.RenderEventHandler;
import fi.dy.masa.itemscroller.gui.GuiConfigs;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLLoader;
import org.thinkingstudio.mafglib.util.ForgePlatformUtils;

@Mod(Reference.MOD_ID)
public class RocknRoller {
    public RocknRoller() {
        if (FMLLoader.getDist().isClient()) {
            // Make sure the mod being absent on the other network side does not cause
            // the client to display the server as incompatible
            ForgePlatformUtils.getInstance().getClientModIgnoredServerOnly();
            ItemScroller.onInitialize();

            // Config Screen
            ForgePlatformUtils.getInstance().registerModConfigScreen(Reference.MOD_ID, (screen) -> {
                GuiConfigs gui = new GuiConfigs();
                gui.setParent(screen);
                return gui;
            });

            MinecraftForge.EVENT_BUS.<ScreenEvent.DrawScreenEvent.Post>addListener(EventPriority.HIGHEST, event -> {
                RenderEventHandler.instance().onDrawScreenPost(event.getScreen().getMinecraft());
            });
        }
    }
}
