package com.sarx.lightningsword.common.items;

import com.sarx.lightningsword.LightningSword;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class LSpecialSwordItem extends SwordItem {

    public LSpecialSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        if (!worldIn.isRemote) {
            LightningBoltEntity bolt = new LightningBoltEntity(worldIn.getWorld(), playerIn.chasingPosX, playerIn.chasingPosY, playerIn.chasingPosZ , false);
            ((ServerWorld) worldIn).addLightningBolt(bolt);
            LightningSword.LOGGER.info("Method Called!");
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}

