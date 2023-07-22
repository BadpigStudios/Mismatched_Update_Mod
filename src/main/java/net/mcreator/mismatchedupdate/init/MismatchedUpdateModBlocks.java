
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mismatchedupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mismatchedupdate.block.SlimemidplantBlock;
import net.mcreator.mismatchedupdate.block.SlimePlantBlock;
import net.mcreator.mismatchedupdate.block.LifeflowerlittleBlock;
import net.mcreator.mismatchedupdate.block.LifeFlowerBlock;
import net.mcreator.mismatchedupdate.block.ExplosiveBerryMidBlock;
import net.mcreator.mismatchedupdate.block.ExplosiveBerryBlock;
import net.mcreator.mismatchedupdate.block.BreakablePotBlock;
import net.mcreator.mismatchedupdate.MismatchedUpdateMod;

public class MismatchedUpdateModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MismatchedUpdateMod.MODID);
	public static final RegistryObject<Block> LIFE_FLOWER = REGISTRY.register("life_flower", () -> new LifeFlowerBlock());
	public static final RegistryObject<Block> LIFEFLOWERLITTLE = REGISTRY.register("lifeflowerlittle", () -> new LifeflowerlittleBlock());
	public static final RegistryObject<Block> EXPLOSIVE_BERRY = REGISTRY.register("explosive_berry", () -> new ExplosiveBerryBlock());
	public static final RegistryObject<Block> EXPLOSIVE_BERRY_MID = REGISTRY.register("explosive_berry_mid", () -> new ExplosiveBerryMidBlock());
	public static final RegistryObject<Block> BREAKABLE_POT = REGISTRY.register("breakable_pot", () -> new BreakablePotBlock());
	public static final RegistryObject<Block> SLIME_PLANT = REGISTRY.register("slime_plant", () -> new SlimePlantBlock());
	public static final RegistryObject<Block> SLIMEMIDPLANT = REGISTRY.register("slimemidplant", () -> new SlimemidplantBlock());
}
