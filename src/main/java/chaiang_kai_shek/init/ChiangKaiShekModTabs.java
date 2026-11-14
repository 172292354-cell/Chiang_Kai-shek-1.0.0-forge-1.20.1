/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package chaiang_kai_shek.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import chaiang_kai_shek.ChiangKaiShekMod;

public class ChiangKaiShekModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChiangKaiShekMod.MODID);
	public static final RegistryObject<CreativeModeTab> XMMLZWTKDQSMX = REGISTRY.register("xmmlzwtkdqsmx",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chiang_kai_shek.xmmlzwtkdqsmx")).icon(() -> new ItemStack(ChiangKaiShekModItems.SK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChiangKaiShekModItems.CHIANG_KAISHEK_SPAWN_EGG.get());
				tabData.accept(ChiangKaiShekModItems.KXDNS.get());
				tabData.accept(ChiangKaiShekModBlocks.JIANGJIESHI.get().asItem());
			}).build());
}