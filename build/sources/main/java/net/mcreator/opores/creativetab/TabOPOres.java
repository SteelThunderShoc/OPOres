
package net.mcreator.opores.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.opores.item.ItemAluminumPickaxe;
import net.mcreator.opores.ElementsOPOres;

@ElementsOPOres.ModElement.Tag
public class TabOPOres extends ElementsOPOres.ModElement {
	public TabOPOres(ElementsOPOres instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabopores") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemAluminumPickaxe.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
