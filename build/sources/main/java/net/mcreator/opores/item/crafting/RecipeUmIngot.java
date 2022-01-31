
package net.mcreator.opores.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.opores.item.ItemUmbroningot;
import net.mcreator.opores.item.ItemUmbronDust;
import net.mcreator.opores.ElementsOPOres;

@ElementsOPOres.ModElement.Tag
public class RecipeUmIngot extends ElementsOPOres.ModElement {
	public RecipeUmIngot(ElementsOPOres instance) {
		super(instance, 14);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemUmbronDust.block, (int) (1)), new ItemStack(ItemUmbroningot.block, (int) (1)), 10F);
	}
}
