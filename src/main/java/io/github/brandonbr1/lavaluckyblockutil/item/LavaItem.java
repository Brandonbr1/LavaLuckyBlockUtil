
package io.github.brandonbr1.lavaluckyblockutil.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import io.github.brandonbr1.lavaluckyblockutil.LavaluckyblockutilModElements;

@LavaluckyblockutilModElements.ModElement.Tag
public class LavaItem extends LavaluckyblockutilModElements.ModElement {
	@ObjectHolder("lavaluckyblockutil:lava")
	public static final Item block = null;

	public LavaItem(LavaluckyblockutilModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.pop")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("lava");
		}
	}
}
