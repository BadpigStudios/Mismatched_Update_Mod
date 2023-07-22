
package net.mcreator.mismatchedupdate.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EBIPItem extends Item {
	public EBIPItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
