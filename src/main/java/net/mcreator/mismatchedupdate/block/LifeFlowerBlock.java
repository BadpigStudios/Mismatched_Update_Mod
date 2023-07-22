
package net.mcreator.mismatchedupdate.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.mismatchedupdate.procedures.LifeFlowerOnBoneMealSuccessProcedure;
import net.mcreator.mismatchedupdate.procedures.LifeFlowerMobplayerCollidesWithPlantProcedure;

import java.util.List;
import java.util.Collections;

public class LifeFlowerBlock extends FlowerBlock implements BonemealableBlock {
	public LifeFlowerBlock() {
		super(() -> MobEffects.HEAL, 100, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_MAGENTA).randomTicks().sound(SoundType.GRASS).strength(0.2f, 0f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)
				.lightLevel(s -> 3).noCollission());
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 46;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this));
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		LifeFlowerMobplayerCollidesWithPlantProcedure.execute(entity);
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate, boolean clientSide) {
		return true;
	}

	@Override
	public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
		return true;
	}

	@Override
	public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
		LifeFlowerOnBoneMealSuccessProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
