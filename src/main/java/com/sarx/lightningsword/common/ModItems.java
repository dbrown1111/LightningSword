package com.sarx.lightningsword.common;

import com.sarx.lightningsword.LightningSword;
import com.sarx.lightningsword.client.CreativeTab;
import com.sarx.lightningsword.common.items.LSpecialSwordItem;
import com.sarx.lightningsword.common.tiers.LArmorTier;
import com.sarx.lightningsword.common.tiers.LToolTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, LightningSword.modid);


    public static final Item lightningsword = register("lightningsword", new LSpecialSwordItem(LToolTier.LIGHTNING, 3, -2.4F, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final Item lightningpickaxe = register("lightningpickaxe",new PickaxeItem(LToolTier.LIGHTNING,1,-2.8F,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final Item lightningaxe = register("lightningaxe",  new AxeItem(LToolTier.LIGHTNING,2,-2.4F, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final Item lightningshovel = register("lightningshovel", new ShovelItem(LToolTier.LIGHTNING,1,-2.4F,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final Item lightninghoe = register("lightninghoe", new HoeItem(LToolTier.LIGHTNING,1,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final Item lightningingot  = register("lightningingot", new Item(new Item.Properties().group(CreativeTab.LightningSword)));

    public static final Item lightning_helmet = register("lightning_helmet", new ArmorItem(LArmorTier.LIGHTING, EquipmentSlotType.HEAD, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final Item lightning_chestplate = register("lightning_chestplate", new ArmorItem(LArmorTier.LIGHTING, EquipmentSlotType.CHEST, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final Item lightning_leggings = register("lightning_leggings", new ArmorItem(LArmorTier.LIGHTING, EquipmentSlotType.LEGS, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final Item lightning_shoes = register("lightning_shoes", new ArmorItem(LArmorTier.LIGHTING, EquipmentSlotType.FEET, (new Item.Properties().group(CreativeTab.LightningSword))));

    public static Item register(String name, Item item){
        ITEMS.register(name,()-> item);
        return item;
    }


}
