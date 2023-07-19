package fi.dy.masa.itemscroller.gui;

import net.minecraft.util.Identifier;
import fi.dy.masa.itemscroller.Reference;
import fi.dy.masa.malilib.gui.interfaces.IGuiIcon;
import fi.dy.masa.malilib.render.RenderUtils;

public enum ItemScrollerIcons implements IGuiIcon
{
    TRADE_ARROW_AVAILABLE   (112,   0, 10,   9),
    TRADE_ARROW_LOCKED      (112,   9, 10,   9),
    SCROLL_BAR_6            (106,   0,  6, 167),
    STAR_5_YELLOW           (112, 18, 5, 5),
    STAR_5_PURPLE           (117, 18, 5, 5);

    public static final Identifier TEXTURE = new Identifier(Reference.MOD_ID, "textures/gui/gui_widgets.png");

    private final int u;
    private final int v;
    private final int w;
    private final int h;
    private final int hoverOffU;
    private final int hoverOffV;

    ItemScrollerIcons(int u, int v, int w, int h)
    {
        this(u, v, w, h, w, 0);
    }

    ItemScrollerIcons(int u, int v, int w, int h, int hoverOffU, int hoverOffV)
    {
        this.u = u;
        this.v = v;
        this.w = w;
        this.h = h;
        this.hoverOffU = hoverOffU;
        this.hoverOffV = hoverOffV;
    }

    @Override
    public int getWidth()
    {
        return this.w;
    }

    @Override
    public int getHeight()
    {
        return this.h;
    }

    @Override
    public int getU()
    {
        return this.u;
    }

    @Override
    public int getV()
    {
        return this.v;
    }

    @Override
    public void renderAt(int x, int y, float zLevel, boolean enabled, boolean selected)
    {
        int u = this.u;
        int v = this.v;

        if (enabled)
        {
            u += this.hoverOffU;
            v += this.hoverOffV;
        }

        if (selected)
        {
            u += this.hoverOffU;
            v += this.hoverOffV;
        }

        RenderUtils.drawTexturedRect(x, y, u, v, this.w, this.h, zLevel);
    }

    @Override
    public Identifier getTexture()
    {
        return TEXTURE;
    }
}
