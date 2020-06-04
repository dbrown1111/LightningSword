package com.sarx.lightningsword.common.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class LSpecialArmor extends ArmorItem {
    public LSpecialArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
        super(materialIn, slot, builder);
    }

    /**
     * Called when a entity tries to play the 'swing' animation.
     *
     * @param stack
     * @param entity The entity swinging the item.
     * @return True to cancel any further processing by EntityLiving
     */
    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
        return false;
    }
}
