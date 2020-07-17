package com.sarx.lightningsword.client;

import com.sarx.lightningsword.common.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab {
    public static final ItemGroup LightningSword = (new ItemGroup("LightningSword") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.lightningsword);
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
