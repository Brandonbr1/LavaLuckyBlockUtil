package io.github.brandonbr1.lavaluckyblockutil.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import io.github.brandonbr1.lavaluckyblockutil.LavaluckyblockutilMod;

public class SpeedSoulItemInInventoryTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LavaluckyblockutilMod.LOGGER.warn("Failed to load dependency entity for procedure SpeedSoulItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 4, (false), (true)));
	}
}
