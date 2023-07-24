
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mismatchedupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.mismatchedupdate.world.features.ores.BreakablePotFeature;
import net.mcreator.mismatchedupdate.world.features.SlimeplantspotFeature;
import net.mcreator.mismatchedupdate.world.features.AncientportalFeature;
import net.mcreator.mismatchedupdate.MismatchedUpdateMod;

@Mod.EventBusSubscriber
public class MismatchedUpdateModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MismatchedUpdateMod.MODID);
	public static final RegistryObject<Feature<?>> BREAKABLE_POT = REGISTRY.register("breakable_pot", BreakablePotFeature::new);
	public static final RegistryObject<Feature<?>> SLIMEPLANTSPOT = REGISTRY.register("slimeplantspot", SlimeplantspotFeature::new);
	public static final RegistryObject<Feature<?>> ANCIENTPORTAL = REGISTRY.register("ancientportal", AncientportalFeature::new);
}
