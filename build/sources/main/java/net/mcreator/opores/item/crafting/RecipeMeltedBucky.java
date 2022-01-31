
package net.mcreator.opores.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.opores.item.ItemUmbronBucket;
import net.mcreator.opores.item.ItemIngotBucket;
import net.mcreator.opores.ElementsOPOres;

@ElementsOPOres.ModElement.Tag
public class RecipeMeltedBucky extends ElementsOPOres.ModElement {
	public RecipeMeltedBucky(ElementsOPOres instance) {
		super(instance, 40);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemIngotBucket.block, (int) (1)), new ItemStack(ItemUmbronBucket.block, (int) (1)), 1F);
	}
}
