package com.sarx.lightningsword.common.items;

import com.sarx.lightningsword.LightningSword;
import com.sarx.lightningsword.client.CreativeTab;
import com.sarx.lightningsword.common.items.tiers.LArmorMaterial;
import com.sarx.lightningsword.common.items.tiers.LItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, LightningSword.modid);

    public static final RegistryObject<SwordItem> lightningsword = ITEMS.register("lightningsword", ()-> new LSpecialSwordItem(LItemTier.LIGHTNING, 3, -2.4F, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<PickaxeItem> lightningpickaxe = ITEMS.register("lightningpickaxe",()-> new PickaxeItem(LItemTier.LIGHTNING,1,-2.8F,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<AxeItem> lightningaxe = ITEMS.register("lightningaxe", ()-> new AxeItem(LItemTier.LIGHTNING,2,-2.4F, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<ShovelItem> lightningshovel = ITEMS.register("lightningshovel", ()-> new ShovelItem(LItemTier.LIGHTNING,1,-2.4F,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<HoeItem> lightninghoe = ITEMS.register("lightninghoe",()-> new HoeItem(LItemTier.LIGHTNING,1,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<Item> lightningingot  = ITEMS.register("lightningingot", ()-> new Item(new Item.Properties().group(CreativeTab.LightningSword)));

    public static final RegistryObject<ArmorItem> lightning_helmet = ITEMS.register("lightning_helmet", new ArmorItem(LArmorMaterial.LIGHTING, EquipmentSlotType.HEAD, 
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,LightningSword.modid);


}
