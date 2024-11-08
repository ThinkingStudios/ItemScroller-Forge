package fi.dy.masa.itemscroller;

import net.minecraft.MinecraftVersion;

import fi.dy.masa.malilib.util.StringUtils;

public class Reference
{
    public static final String ID = "itemscroller";
    public static final String MOD_ID = "rocknroller";
    public static final String MOD_NAME = "Rock'n Roller";
    public static final String MOD_VERSION = StringUtils.getModVersionString(MOD_ID);
    public static final String MC_VERSION = MinecraftVersion.CURRENT.getName();
    public static final String MOD_TYPE = "neoforge";
    public static final String MOD_STRING = MOD_ID + "-" + MOD_TYPE + "-" + MC_VERSION + "-" + MOD_VERSION;
}
