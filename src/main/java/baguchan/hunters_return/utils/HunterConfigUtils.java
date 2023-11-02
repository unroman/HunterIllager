package baguchan.hunters_return.utils;

import baguchan.hunters_return.HunterConfig;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.ForgeRegistries;

public class HunterConfigUtils {
	public static boolean isWhitelistedItem(Item item) {
		return HunterConfig.COMMON.foodWhitelist.get().contains(ForgeRegistries.ITEMS.getKey(item).toString());
	}

	public static boolean isWhitelistedEntity(EntityType<?> entityType) {
		return HunterConfig.COMMON.attackableWhitelist.get().contains(ForgeRegistries.ENTITY_TYPES.getKey(entityType).toString());
	}
}
