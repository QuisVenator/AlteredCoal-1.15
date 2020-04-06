package com.renepauls.alteredcoal.init;

import com.renepauls.alteredcoal.AlteredCoal;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, AlteredCoal.MOD_ID);
	
	public static final RegistryObject<Item> STACK = ITEMS.register("stack_item", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
}
