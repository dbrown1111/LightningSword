package com.sarx.lightningsword.client;

import com.sarx.lightningsword.common.items.LightningItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab {
    public static final ItemGroup LightningSword = (new ItemGroup("LightningSword") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(LightningItems.lightningsword);
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
