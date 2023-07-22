
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mismatchedupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.mismatchedupdate.world.features.plants.ExplosiveBerryMidFeature;
import net.mcreator.mismatchedupdate.world.features.plants.ExplosiveBerryFeature;
import net.mcreator.mismatchedupdate.MismatchedUpdateMod;

@Mod.EventBusSubscriber
public class MismatchedUpdateModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MismatchedUpdateMod.MODID);
	public static final RegistryObject<Feature<?>> EXPLOSIVE_BERRY = REGISTRY.register("explosive_berry", ExplosiveBerryFeature::new);
	public static final RegistryObject<Feature<?>> EXPLOSIVE_BERRY_MID = REGISTRY.register("explosive_berry_mid", ExplosiveBerryMidFeature::new);
}
