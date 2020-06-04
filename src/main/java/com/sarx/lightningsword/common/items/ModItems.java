package com.sarx.lightningsword.common.items;

import com.sarx.lightningsword.LightningSword;
import com.sarx.lightningsword.client.CreativeTab;
import com.sarx.lightningsword.common.items.tiers.SwordItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, LightningSword.modid);

    public static final RegistryObject<SwordItem> lightningsword = ITEMS.register("lightningsword", ()-> new LSpecialSwordItem(SwordItemTier.LIGHTNING, 3, -2.4F, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<PickaxeItem> lightningpickaxe = ITEMS.register("lightningpickaxe",()-> new PickaxeItem(SwordItemTier.LIGHTNING,1,-2.8F,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<AxeItem> lightningaxe = ITEMS.register("lightningaxe", ()-> new AxeItem(SwordItemTier.LIGHTNING,2,-2.4F, (new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<ShovelItem> lightningshovel = ITEMS.register("lightningshovel", ()-> new ShovelItem(SwordItemTier.LIGHTNING,1,-2.4F,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<HoeItem> lightninghoe = ITEMS.register("lightninghoe",()-> new HoeItem(SwordItemTier.LIGHTNING,1,(new Item.Properties().group(CreativeTab.LightningSword))));
    public static final RegistryObject<Item> lightningingot  = ITEMS.register("lightningingot", ()-> new Item(new Item.Properties().group(CreativeTab.LightningSword)));

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,LightningSword.modid);


}
