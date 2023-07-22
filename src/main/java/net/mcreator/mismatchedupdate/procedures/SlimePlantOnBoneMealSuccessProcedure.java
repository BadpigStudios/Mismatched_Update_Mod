package net.mcreator.mismatchedupdate.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SlimePlantOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.SLIME_BALL));
			entityToSpawn.setPickUpDelay(5);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
