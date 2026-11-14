/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package chaiang_kai_shek.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import chaiang_kai_shek.item.SkItem;
import chaiang_kai_shek.item.KxdnsItem;

import chaiang_kai_shek.ChiangKaiShekMod;

public class ChiangKaiShekModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChiangKaiShekMod.MODID);
	public static final RegistryObject<Item> CHIANG_KAISHEK_SPAWN_EGG;
	public static final RegistryObject<Item> KXDNS;
	public static final RegistryObject<Item> SK;
	public static final RegistryObject<Item> JIANGJIESHI;
	static {
		CHIANG_KAISHEK_SPAWN_EGG = REGISTRY.register("chiang_kaishek_spawn_egg", () -> new ForgeSpawnEggItem(ChiangKaiShekModEntities.CHIANG_KAISHEK, -1, -1, new Item.Properties()));
		KXDNS = REGISTRY.register("kxdns", KxdnsItem::new);
		SK = REGISTRY.register("sk", SkItem::new);
		JIANGJIESHI = block(ChiangKaiShekModBlocks.JIANGJIESHI);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}