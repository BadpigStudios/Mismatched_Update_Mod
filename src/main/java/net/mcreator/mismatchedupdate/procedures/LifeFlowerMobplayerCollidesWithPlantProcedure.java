package net.mcreator.mismatchedupdate.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class LifeFlowerMobplayerCollidesWithPlantProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isAlive()) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) (0.1 + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)));
		}
	}
}
