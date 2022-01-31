
package net.mcreator.opores.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.opores.creativetab.TabOPOres;
import net.mcreator.opores.ElementsOPOres;

import java.util.Set;
import java.util.HashMap;

@ElementsOPOres.ModElement.Tag
public class ItemAluminumPickaxe extends ElementsOPOres.ModElement {
	@GameRegistry.ObjectHolder("opores:aluminumpickaxe")
	public static final Item block = null;
	public ItemAluminumPickaxe(ElementsOPOres instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("ALUMINUMPICKAXE", 5, 15000, 25f, 81f, 15)) {
			{
				this.attackSpeed = -2.5f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 5);
				return ret.keySet();
			}
		}.setUnlocalizedName("aluminumpickaxe").setRegistryName("aluminumpickaxe").setCreativeTab(TabOPOres.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("opores:aluminumpickaxe", "inventory"));
	}
}
