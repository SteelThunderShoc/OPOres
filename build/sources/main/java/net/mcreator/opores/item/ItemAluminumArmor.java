
package net.mcreator.opores.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.opores.creativetab.TabOPOres;
import net.mcreator.opores.ElementsOPOres;

@ElementsOPOres.ModElement.Tag
public class ItemAluminumArmor extends ElementsOPOres.ModElement {
	@GameRegistry.ObjectHolder("opores:aluminumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("opores:aluminumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("opores:aluminumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("opores:aluminumarmorboots")
	public static final Item boots = null;
	public ItemAluminumArmor(ElementsOPOres instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ALUMINUMARMOR", "opores:iron_", 1000, new int[]{200, 300, 400, 200}, 14,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("aluminumarmorhelmet")
				.setRegistryName("aluminumarmorhelmet").setCreativeTab(TabOPOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("aluminumarmorbody")
				.setRegistryName("aluminumarmorbody").setCreativeTab(TabOPOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("aluminumarmorlegs")
				.setRegistryName("aluminumarmorlegs").setCreativeTab(TabOPOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("aluminumarmorboots")
				.setRegistryName("aluminumarmorboots").setCreativeTab(TabOPOres.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("opores:aluminumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("opores:aluminumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("opores:aluminumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("opores:aluminumarmorboots", "inventory"));
	}
}
