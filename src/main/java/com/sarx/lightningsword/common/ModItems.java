package com.sarx.lightningsword.common;

import com.sarx.lightningsword.LightningSword;
import com.sarx.lightningsword.client.CreativeTab;
import com.sarx.lightningsword.common.items.LSpecialSwordItem;
import com.sarx.lightningsword.common.tiers.LArmorTier;
import com.sarx.lightningsword.common.tiers.LToolTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, LightningSword.modid);

    public static final RegistryObject<SwordItem> lightningsword = ITEMS.register("lightningsword", ()-> new LSpecialSwordItem(LToolTier.LIGHTNING, 3, -2.4F, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<PickaxeItem> lightningpickaxe = ITEMS.register("lightningpickaxe",()-> new PickaxeItem(LToolTier.LIGHTNING,1,-2.8F,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<AxeItem> lightningaxe = ITEMS.register("lightningaxe", ()-> new AxeItem(LToolTier.LIGHTNING,2,-2.4F, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<ShovelItem> lightningshovel = ITEMS.register("lightningshovel", ()-> new ShovelItem(LToolTier.LIGHTNING,1,-2.4F,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<HoeItem> lightninghoe = ITEMS.register("lightninghoe",()-> new HoeItem(LToolTier.LIGHTNING,1,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<Item> lightningingot  = ITEMS.register("lightningingot", ()-> new Item(new Item.Properties().group(CreativeTab.LightningSword)));

    public static final RegistryObject<ArmorItem> lightning_helmet = ITEMS.register("lightning_helmet", () -> new ArmorItem(LArmorTier.LIGHTING, EquipmentSlotType.HEAD, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<ArmorItem> lightning_chestplate = ITEMS.register("lightning_chestplate", () -> new ArmorItem(LArmorTier.LIGHTING, EquipmentSlotType.CHEST, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<ArmorItem> lightning_leggings = ITEMS.register("lightning_leggings", () -> new ArmorItem(LArmorTier.LIGHTING, EquipmentSlotType.LEGS, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<ArmorItem> lightning_shoes = ITEMS.register("lightning_shoes", () -> new ArmorItem(LArmorTier.LIGHTING, EquipmentSlotType.FEET, (new Item.Properties().group(CreativeTab.LightningSword))));

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,LightningSword.modid);


}
