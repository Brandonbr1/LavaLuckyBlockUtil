
package io.github.brandonbr1.lavaluckyblockutil.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import io.github.brandonbr1.lavaluckyblockutil.LavaluckyblockutilModElements;

@LavaluckyblockutilModElements.ModElement.Tag
public class LavaKnifeItem extends LavaluckyblockutilModElements.ModElement {
	@ObjectHolder("lavaluckyblockutil:lava_knife")
	public static final Item block = null;

	public LavaKnifeItem(LavaluckyblockutilModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 900;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.LAVA_BUCKET));
			}
		}, 3, 96f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("lava_knife"));
	}
}
