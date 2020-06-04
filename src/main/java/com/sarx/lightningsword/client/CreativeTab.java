package com.sarx.lightningsword.client;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class CreativeTab {
    public static final ItemGroup LightningSword = (new ItemGroup("LightningSword") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.PUMPKIN);
        }

        @Override
        public boolean hasScrollbar() {
            return super.hasScrollbar();
        }

        @Override
        public boolean hasSearchBar() {
            return super.hasSearchBar();
        }
    });
}
