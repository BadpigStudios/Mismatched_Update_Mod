
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mismatchedupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mismatchedupdate.MismatchedUpdateMod;

public class MismatchedUpdateModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MismatchedUpdateMod.MODID);
	public static final RegistryObject<Item> LIFE_FLOWER = block(MismatchedUpdateModBlocks.LIFE_FLOWER);
	public static final RegistryObject<Item> LIFEFLOWERLITTLE = block(MismatchedUpdateModBlocks.LIFEFLOWERLITTLE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}