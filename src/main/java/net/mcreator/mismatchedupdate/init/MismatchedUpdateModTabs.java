
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mismatchedupdate.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MismatchedUpdateModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(MismatchedUpdateModItems.EXPLOSIVE_BERRY_PROJECTIL.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MismatchedUpdateModBlocks.LIFE_FLOWER.get().asItem());
			tabData.accept(MismatchedUpdateModBlocks.EXPLOSIVE_BERRY.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("mismatched_update", "barra_de_desarrollo"),
				builder -> builder.title(Component.translatable("item_group.mismatched_update.barra_de_desarrollo")).icon(() -> new ItemStack(Blocks.BEDROCK)).displayItems((parameters, tabData) -> {
					tabData.accept(MismatchedUpdateModItems.EBIP.get());
					tabData.accept(MismatchedUpdateModBlocks.BREAKABLE_POT.get().asItem());
					tabData.accept(MismatchedUpdateModBlocks.SLIME_PLANT.get().asItem());
					tabData.accept(MismatchedUpdateModBlocks.SLIMEMIDPLANT.get().asItem());
				})

		);
	}
}
