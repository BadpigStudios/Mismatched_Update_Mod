
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

import net.mcreator.mismatchedupdate.item.ExplosiveBerryProjectilItem;
import net.mcreator.mismatchedupdate.item.EBIPItem;
import net.mcreator.mismatchedupdate.MismatchedUpdateMod;

public class MismatchedUpdateModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MismatchedUpdateMod.MODID);
	public static final RegistryObject<Item> LIFE_FLOWER = block(MismatchedUpdateModBlocks.LIFE_FLOWER);
	public static final RegistryObject<Item> LIFEFLOWERLITTLE = block(MismatchedUpdateModBlocks.LIFEFLOWERLITTLE);
	public static final RegistryObject<Item> EXPLOSIVE_BERRY = block(MismatchedUpdateModBlocks.EXPLOSIVE_BERRY);
	public static final RegistryObject<Item> EXPLOSIVE_BERRY_MID = block(MismatchedUpdateModBlocks.EXPLOSIVE_BERRY_MID);
	public static final RegistryObject<Item> EBIP = REGISTRY.register("ebip", () -> new EBIPItem());
	public static final RegistryObject<Item> EXPLOSIVE_BERRY_PROJECTIL = REGISTRY.register("explosive_berry_projectil", () -> new ExplosiveBerryProjectilItem());
	public static final RegistryObject<Item> BREAKABLE_POT = block(MismatchedUpdateModBlocks.BREAKABLE_POT);
	public static final RegistryObject<Item> SLIME_PLANT = block(MismatchedUpdateModBlocks.SLIME_PLANT);
	public static final RegistryObject<Item> SLIMEMIDPLANT = block(MismatchedUpdateModBlocks.SLIMEMIDPLANT);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
