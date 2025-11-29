package net.kuko.mcreator.errmod;

import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class CreativeModeTabs {

    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == net.minecraft.world.item.CreativeModeTabs.TOOLS_AND_UTILITIES) {
            //event.accept(ErrModItems.VOID);
        }
    }
}
