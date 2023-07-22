package net.mcreator.mismatchedupdate.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.mismatchedupdate.init.MismatchedUpdateModBlocks;

public class LifeFlowerOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MismatchedUpdateModBlocks.LIFEFLOWERLITTLE.get()));
			entityToSpawn.setPickUpDelay(4);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
