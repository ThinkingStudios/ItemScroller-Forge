package fi.dy.masa.itemscroller;

import fi.dy.masa.itemscroller.gui.GuiConfigs;
import fi.dy.masa.malilib.compat.neoforge.ForgePlatformUtils;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fi.dy.masa.malilib.event.InitializationHandler;

@Mod(Reference.MOD_ID)
public class ItemScroller {
    public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);

    public ItemScroller() {
        if (FMLLoader.getDist().isClient()) {
            ForgePlatformUtils.getInstance().getClientModIgnoredServerOnly();
            InitializationHandler.getInstance().registerInitializationHandler(new InitHandler());
            ForgePlatformUtils.getInstance().getMod(Reference.MOD_ID).registerModConfigScreen((screen) -> {
                GuiConfigs gui = new GuiConfigs();
                gui.setParent(screen);
                return gui;
            });
        }
    }
}
