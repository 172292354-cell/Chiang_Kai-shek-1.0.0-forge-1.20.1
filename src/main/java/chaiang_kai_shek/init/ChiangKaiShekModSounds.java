/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package chaiang_kai_shek.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import chaiang_kai_shek.ChiangKaiShekMod;

public class ChiangKaiShekModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ChiangKaiShekMod.MODID);
	public static final RegistryObject<SoundEvent> KXDNS = REGISTRY.register("kxdns", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chiang_kai_shek", "kxdns")));
}