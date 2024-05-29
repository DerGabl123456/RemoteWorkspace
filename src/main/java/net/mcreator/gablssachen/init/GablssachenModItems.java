
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gablssachen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;

import net.mcreator.gablssachen.item.NoobFaceItem;
import net.mcreator.gablssachen.GablssachenMod;

public class GablssachenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GablssachenMod.MODID);
	public static final RegistryObject<Item> NOOB_FACE_HELMET = REGISTRY.register("noob_face_helmet", () -> new NoobFaceItem.Helmet());
	public static final RegistryObject<Item> NOOB_FACE_CHESTPLATE = REGISTRY.register("noob_face_chestplate", () -> new NoobFaceItem.Chestplate());
	public static final RegistryObject<Item> NOOB_FACE_LEGGINGS = REGISTRY.register("noob_face_leggings", () -> new NoobFaceItem.Leggings());
	public static final RegistryObject<Item> LEITER = doubleBlock(GablssachenModBlocks.LEITER);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
