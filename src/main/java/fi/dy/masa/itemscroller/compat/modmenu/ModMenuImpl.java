package fi.dy.masa.itemscroller.compat.modmenu;

import fi.dy.masa.itemscroller.gui.GuiConfigs;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import org.thinkingstudio.mafglib.loader.entrypoints.ConfigScreenEntrypoint;

public class ModMenuImpl implements ConfigScreenEntrypoint
{
    @Override
    public IConfigScreenFactory getModConfigScreenFactory()
    {
        return (modContainer, screen) -> {
            GuiConfigs gui = new GuiConfigs();
            gui.setParent(screen);
            return gui;
        };
    }
}
