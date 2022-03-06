
package io.github.brandonbr1.lavaluckyblockutil.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FlightPotionPotion {
	@ObjectHolder("lavaluckyblockutil:flight_potion")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super();
			setRegistryName("flight_potion");
		}
	}
}
