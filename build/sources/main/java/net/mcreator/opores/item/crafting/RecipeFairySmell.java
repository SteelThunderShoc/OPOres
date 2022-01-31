
package net.mcreator.opores.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.opores.item.ItemFairyIngot;
import net.mcreator.opores.item.ItemFairyDust;
import net.mcreator.opores.ElementsOPOres;

@ElementsOPOres.ModElement.Tag
public class RecipeFairySmell extends ElementsOPOres.ModElement {
	public RecipeFairySmell(ElementsOPOres instance) {
		super(instance, 42);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemFairyDust.block, (int) (1)), new ItemStack(ItemFairyIngot.block, (int) (1)), 1F);
	}
}
