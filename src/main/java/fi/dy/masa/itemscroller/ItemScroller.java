package fi.dy.masa.itemscroller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fi.dy.masa.malilib.event.InitializationHandler;

public class ItemScroller {
    public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);

    public static void onInitialize()
    {
        InitializationHandler.getInstance().registerInitializationHandler(new InitHandler());
    }
}
