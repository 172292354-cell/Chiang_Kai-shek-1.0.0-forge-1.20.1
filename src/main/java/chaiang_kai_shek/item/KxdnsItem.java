package chaiang_kai_shek.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class KxdnsItem extends RecordItem {
	public KxdnsItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("chiang_kai_shek:kxdns")), new Item.Properties(), 4740);
	}
}