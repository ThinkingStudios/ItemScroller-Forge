package fi.dy.masa.itemscroller.config;

import java.util.List;
import com.google.common.collect.ImmutableList;
import fi.dy.masa.malilib.config.options.ConfigHotkey;
import fi.dy.masa.malilib.hotkeys.KeyAction;
import fi.dy.masa.malilib.hotkeys.KeybindSettings;

public class Hotkeys
{
    private static final KeybindSettings GUI_RELAXED = KeybindSettings.create(KeybindSettings.Context.GUI, KeyAction.PRESS, true, false, false, false);
    private static final KeybindSettings GUI_RELAXED_CANCEL = KeybindSettings.create(KeybindSettings.Context.GUI, KeyAction.PRESS, true, false, false, true);
    private static final KeybindSettings GUI_NO_ORDER = KeybindSettings.create(KeybindSettings.Context.GUI, KeyAction.PRESS, false, false, false, true);

    public static final ConfigHotkey KEY_OPEN_CONFIG_GUI        = new ConfigHotkey("openConfigGui",      "I,C", "Open the in-game config GUI");

    public static final ConfigHotkey KEY_CRAFT_EVERYTHING       = new ConfigHotkey("craftEverything",    "LEFT_CONTROL,C", GUI_NO_ORDER, "Craft everything possible once with the currently selected recipe");
    public static final ConfigHotkey KEY_DROP_ALL_MATCHING      = new ConfigHotkey("dropAllMatching",    "LEFT_CONTROL,LEFT_SHIFT,Q", GUI_NO_ORDER, "Drop all stacks identical to the hovered stack");
    public static final ConfigHotkey KEY_MAIN_TOGGLE            = new ConfigHotkey("mainToggle",         "LEFT_CONTROL,S", KeybindSettings.GUI, "Toggle all functionality ON/OFF");
    public static final ConfigHotkey KEY_MASS_CRAFT             = new ConfigHotkey("massCraft",          "LEFT_CONTROL,LEFT_ALT,C", GUI_NO_ORDER, "Mass craft and throw out the results with the\ncurrently selected recipe as long as this\nkeybind is held down");
    public static final ConfigHotkey KEY_MOVE_CRAFT_RESULTS     = new ConfigHotkey("moveCraftResults",   "LEFT_CONTROL,M", GUI_NO_ORDER, "Move all of the currently selected recipe's\noutput items from the player inventory\nto the other inventory");
    public static final ConfigHotkey KEY_MOVE_STACK_TO_OFFHAND  = new ConfigHotkey("moveStackToOffhand", "F", KeybindSettings.GUI, "Swap the hovered stack with the offhand");
    public static final ConfigHotkey KEY_RECIPE_VIEW            = new ConfigHotkey("recipeView",         "A", GUI_RELAXED, "Show the Item Scroller recipe GUI");
    public static final ConfigHotkey KEY_SLOT_DEBUG             = new ConfigHotkey("slotDebug",          "LEFT_CONTROL,LEFT_ALT,LEFT_SHIFT,I", GUI_NO_ORDER, "Print debug info for the hovered slot or GUI");
    public static final ConfigHotkey KEY_STORE_RECIPE           = new ConfigHotkey("storeRecipe",        "BUTTON_3", GUI_RELAXED_CANCEL, "Store a recipe while hovering over a crafting output item");
    public static final ConfigHotkey KEY_THROW_CRAFT_RESULTS    = new ConfigHotkey("throwCraftResults",  "LEFT_CONTROL,T", GUI_NO_ORDER, "Throw all of the currently selected recipe's\noutput items to the ground from the player inventory");
    public static final ConfigHotkey KEY_VILLAGER_TRADE_FAVORITES = new ConfigHotkey("villagerTradeFavorites",  "", KeybindSettings.GUI, "Trade everything possible with all the favorited trades\nof the current villager");

    public static final ConfigHotkey KEY_DRAG_LEAVE_ONE         = new ConfigHotkey("keyDragMoveLeaveOne", "LEFT_SHIFT,BUTTON_2", GUI_NO_ORDER, "Key to move all but the last item from\nall the stacks dragged over");
    public static final ConfigHotkey KEY_DRAG_MATCHING          = new ConfigHotkey("keyDragMoveMatching", "LEFT_ALT,BUTTON_1", GUI_NO_ORDER, "Key to move all matching items dragged over");
    public static final ConfigHotkey KEY_DRAG_MOVE_ONE          = new ConfigHotkey("keyDragMoveOne",      "LEFT_CONTROL,BUTTON_1", GUI_NO_ORDER, "Key to move one item from each stack dragged over");
    public static final ConfigHotkey KEY_DRAG_FULL_STACKS       = new ConfigHotkey("keyDragMoveStacks",   "LEFT_SHIFT,BUTTON_1", GUI_NO_ORDER, "Key to move the entire stacks dragged over");

    public static final ConfigHotkey KEY_DRAG_DROP_LEAVE_ONE    = new ConfigHotkey("keyDragDropLeaveOne", "LEFT_SHIFT,Q,BUTTON_2", GUI_NO_ORDER, "Key to drop all but the last item from each stack dragged over");
    public static final ConfigHotkey KEY_DRAG_DROP_SINGLE       = new ConfigHotkey("keyDragDropSingle",   "Q,BUTTON_1", GUI_NO_ORDER, "Key to drop one item from each stack dragged over");
    public static final ConfigHotkey KEY_DRAG_DROP_STACKS       = new ConfigHotkey("keyDragDropStacks",   "LEFT_SHIFT,Q,BUTTON_1", GUI_NO_ORDER, "Key to drop the entire stacks dragged over");

    public static final ConfigHotkey KEY_MOVE_EVERYTHING        = new ConfigHotkey("keyMoveEverything", "LEFT_ALT,LEFT_SHIFT,BUTTON_1", GUI_NO_ORDER, "Key to move ALL items to the other\ninventory when clicking a stack");

    public static final ConfigHotkey KEY_WS_MOVE_DOWN_LEAVE_ONE = new ConfigHotkey("wsMoveDownLeaveOne", "S,BUTTON_2", GUI_NO_ORDER, "The key to move all but the last item from each stack\n\"down\" in the inventory");
    public static final ConfigHotkey KEY_WS_MOVE_DOWN_MATCHING  = new ConfigHotkey("wsMoveDownMatching", "LEFT_ALT,S,BUTTON_1", GUI_NO_ORDER, "The key to move all matching items \"down\" in the inventory");
    public static final ConfigHotkey KEY_WS_MOVE_DOWN_SINGLE    = new ConfigHotkey("wsMoveDownSingle",   "S,BUTTON_1", GUI_NO_ORDER, "The key to move single items \"down\" in the inventory");
    public static final ConfigHotkey KEY_WS_MOVE_DOWN_STACKS    = new ConfigHotkey("wsMoveDownStacks",   "LEFT_SHIFT,S,BUTTON_1", GUI_NO_ORDER, "The key to move stacks \"down\" in the inventory");
    public static final ConfigHotkey KEY_WS_MOVE_UP_LEAVE_ONE   = new ConfigHotkey("wsMoveUpLeaveOne",   "W,BUTTON_2", GUI_NO_ORDER, "The key to move all but the last item from each stack\n\"up\" in the inventory");
    public static final ConfigHotkey KEY_WS_MOVE_UP_MATCHING    = new ConfigHotkey("wsMoveUpMatching",   "LEFT_ALT,W,BUTTON_1", GUI_NO_ORDER, "The key to move all matching items \"up\" in the inventory");
    public static final ConfigHotkey KEY_WS_MOVE_UP_SINGLE      = new ConfigHotkey("wsMoveUpSingle",     "W,BUTTON_1", GUI_NO_ORDER, "The key to move single items \"up\" in the inventory");
    public static final ConfigHotkey KEY_WS_MOVE_UP_STACKS      = new ConfigHotkey("wsMoveUpStacks",     "LEFT_SHIFT,W,BUTTON_1", GUI_NO_ORDER, "The key to move stacks \"up\" in the inventory");

    public static final ConfigHotkey MODIFIER_MOVE_EVERYTHING   = new ConfigHotkey("modifierMoveEverything", "LEFT_ALT,LEFT_SHIFT", GUI_NO_ORDER, "Modifier key to move ALL items to the other\ninventory when scrolling over a stack");
    public static final ConfigHotkey MODIFIER_MOVE_MATCHING     = new ConfigHotkey("modifierMoveMatching",   "LEFT_ALT", GUI_NO_ORDER, "Modifier key to move all matching items to the other\ninventory when scrolling over a stack");
    public static final ConfigHotkey MODIFIER_MOVE_STACK        = new ConfigHotkey("modifierMoveStack",      "LEFT_SHIFT", GUI_NO_ORDER, "Modifier key to move the entire stack to the other\ninventory when scrolling over it");
    public static final ConfigHotkey MODIFIER_TOGGLE_VILLAGER_GLOBAL_FAVORITE = new ConfigHotkey("modifierToggleVillagerGlobalFavorite", "LEFT_SHIFT", GUI_RELAXED, "Modifier key to hold while middle clicking a trade,\nto toggle the global favorite state for that trade.\nGlobal favorites are used for villagers that don't have any specific favorites set.");

    public static final List<ConfigHotkey> HOTKEY_LIST = ImmutableList.of(
            KEY_OPEN_CONFIG_GUI,

            MODIFIER_MOVE_EVERYTHING,
            MODIFIER_MOVE_MATCHING,
            MODIFIER_MOVE_STACK,
            MODIFIER_TOGGLE_VILLAGER_GLOBAL_FAVORITE,

            KEY_MOVE_EVERYTHING,

            KEY_DRAG_FULL_STACKS,
            KEY_DRAG_LEAVE_ONE,
            KEY_DRAG_MATCHING,
            KEY_DRAG_MOVE_ONE,

            KEY_DRAG_DROP_LEAVE_ONE,
            KEY_DRAG_DROP_SINGLE,
            KEY_DRAG_DROP_STACKS,

            KEY_CRAFT_EVERYTHING,
            KEY_DROP_ALL_MATCHING,
            KEY_MAIN_TOGGLE,
            KEY_MASS_CRAFT,
            KEY_MOVE_CRAFT_RESULTS,
            KEY_MOVE_STACK_TO_OFFHAND,
            KEY_RECIPE_VIEW,
            KEY_SLOT_DEBUG,
            KEY_STORE_RECIPE,
            KEY_THROW_CRAFT_RESULTS,
            KEY_VILLAGER_TRADE_FAVORITES,

            KEY_WS_MOVE_DOWN_LEAVE_ONE,
            KEY_WS_MOVE_DOWN_MATCHING,
            KEY_WS_MOVE_DOWN_SINGLE,
            KEY_WS_MOVE_DOWN_STACKS,
            KEY_WS_MOVE_UP_LEAVE_ONE,
            KEY_WS_MOVE_UP_MATCHING,
            KEY_WS_MOVE_UP_SINGLE,
            KEY_WS_MOVE_UP_STACKS
    );
}
