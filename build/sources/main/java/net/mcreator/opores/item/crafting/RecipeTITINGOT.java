
package net.mcreator.opores.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.opores.item.ItemTitaniumingot;
import net.mcreator.opores.item.ItemTitaniumChunk;
import net.mcreator.opores.ElementsOPOres;

@ElementsOPOres.ModElement.Tag
public class RecipeTITINGOT extends ElementsOPOres.ModElement {
	public RecipeTITINGOT(ElementsOPOres instance) {
		super(instance, 25);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemTitaniumChunk.block, (int) (1)), new ItemStack(ItemTitaniumingot.block, (int) (1)), 5F);
	}
}
