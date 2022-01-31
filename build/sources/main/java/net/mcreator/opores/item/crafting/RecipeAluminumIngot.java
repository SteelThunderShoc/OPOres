
package net.mcreator.opores.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.opores.item.ItemAluminumDust;
import net.mcreator.opores.item.ItemAluminum;
import net.mcreator.opores.ElementsOPOres;

@ElementsOPOres.ModElement.Tag
public class RecipeAluminumIngot extends ElementsOPOres.ModElement {
	public RecipeAluminumIngot(ElementsOPOres instance) {
		super(instance, 3);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemAluminumDust.block, (int) (1)), new ItemStack(ItemAluminum.block, (int) (1)), 0F);
	}
}
