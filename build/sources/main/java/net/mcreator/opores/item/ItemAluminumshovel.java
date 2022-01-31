
package net.mcreator.opores.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.opores.creativetab.TabOPOres;
import net.mcreator.opores.ElementsOPOres;

import java.util.Set;
import java.util.HashMap;

@ElementsOPOres.ModElement.Tag
public class ItemAluminumshovel extends ElementsOPOres.ModElement {
	@GameRegistry.ObjectHolder("opores:aluminumshovel")
	public static final Item block = null;
	public ItemAluminumshovel(ElementsOPOres instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("ALUMINUMSHOVEL", 5, 10000, 15f, 71f, 18)) {
			{
				this.attackSpeed = -3.2f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 5);
				return ret.keySet();
			}
		}.setUnlocalizedName("aluminumshovel").setRegistryName("aluminumshovel").setCreativeTab(TabOPOres.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("opores:aluminumshovel", "inventory"));
	}
}
