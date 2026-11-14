/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package chaiang_kai_shek.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import chaiang_kai_shek.block.JiangjieshiBlock;

import chaiang_kai_shek.ChiangKaiShekMod;

public class ChiangKaiShekModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChiangKaiShekMod.MODID);
	public static final RegistryObject<Block> JIANGJIESHI;
	static {
		JIANGJIESHI = REGISTRY.register("jiangjieshi", JiangjieshiBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}