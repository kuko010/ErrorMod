package net.kuko.mcreator.errmod.item;

import com.wdiscute.libtooltips.Tooltips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class VoidItem extends Item {
	public VoidItem() {
		super(new Item.Properties());
	}

	@Override
	public Component getName(ItemStack p_41458_) {
		Component textTranslated = Tooltips.RGBEachLetter(Component.translatable("item.err.void");
		String text = textTranslated.getString());
		return Component.literal(text);
	}
}