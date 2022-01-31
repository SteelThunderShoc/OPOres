
package net.mcreator.opores.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.opores.item.ItemTitaniumrod;
import net.mcreator.opores.item.ItemTitaniumingot;
import net.mcreator.opores.ElementsOPOres;

@ElementsOPOres.ModElement.Tag
public class RecipeRodMaking extends ElementsOPOres.ModElement {
	public RecipeRodMaking(ElementsOPOres instance) {
		super(instance, 18);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemTitaniumingot.block, (int) (1)), new ItemStack(ItemTitaniumrod.block, (int) (1)), 1F);
	}
}
