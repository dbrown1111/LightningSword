package com.sarx.lightningsword.common.tiers;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum LToolTier implements IItemTier {
    LIGHTNING(3,5000,8.0F,5.0F,10, () -> {
        return Ingredient.fromItems(Items.DIAMOND);
    })
    ;

    LToolTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn){
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantibility = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);

    }

    private float attackDamage, efficiency;
    private int enchantibility, harvestLevel, maxUses;
    private LazyValue<Ingredient> repairMaterial;


    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantibility;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
