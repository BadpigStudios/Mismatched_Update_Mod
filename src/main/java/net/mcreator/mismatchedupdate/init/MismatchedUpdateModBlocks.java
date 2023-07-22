
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mismatchedupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mismatchedupdate.block.LifeflowerlittleBlock;
import net.mcreator.mismatchedupdate.block.LifeFlowerBlock;
import net.mcreator.mismatchedupdate.MismatchedUpdateMod;

public class MismatchedUpdateModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MismatchedUpdateMod.MODID);
	public static final RegistryObject<Block> LIFE_FLOWER = REGISTRY.register("life_flower", () -> new LifeFlowerBlock());
	public static final RegistryObject<Block> LIFEFLOWERLITTLE = REGISTRY.register("lifeflowerlittle", () -> new LifeflowerlittleBlock());
}
