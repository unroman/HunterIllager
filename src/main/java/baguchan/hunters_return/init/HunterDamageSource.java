package baguchan.hunters_return.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;

public interface HunterDamageSource {
    ResourceKey<DamageType> BOOMERANG = ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation(baguchan.hunters_return.HuntersReturn.MODID, "boomerang"));
    ResourceKey<DamageType> SPIN_BLADE = ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation(baguchan.hunters_return.HuntersReturn.MODID, "spin_blade"));

}
