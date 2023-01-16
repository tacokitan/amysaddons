
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amysaddons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.amysaddons.item.IceShellItem;
import net.mcreator.amysaddons.item.IceEpaulettesItem;
import net.mcreator.amysaddons.AmysAddonsMod;

public class AmysAddonsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AmysAddonsMod.MODID);
	public static final RegistryObject<Item> SNOW_SLUG = REGISTRY.register("snow_slug_spawn_egg",
			() -> new ForgeSpawnEggItem(AmysAddonsModEntities.SNOW_SLUG, -1, -3342337, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ICE_SHELL = REGISTRY.register("ice_shell", () -> new IceShellItem());
	public static final RegistryObject<Item> ICE_EPAULETTES_CHESTPLATE = REGISTRY.register("ice_epaulettes_chestplate",
			() -> new IceEpaulettesItem.Chestplate());
}
