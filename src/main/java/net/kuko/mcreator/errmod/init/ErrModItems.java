/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.kuko.mcreator.errmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.kuko.mcreator.errmod.item.VoidItem;
import net.kuko.mcreator.errmod.ErrMod;

public class ErrModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ErrMod.MODID);
	public static final DeferredItem<Item> VOID = REGISTRY.register("void", VoidItem::new);
	// Start of user code block custom items
	// This is my comment :3
	// End of user code block custom items
}