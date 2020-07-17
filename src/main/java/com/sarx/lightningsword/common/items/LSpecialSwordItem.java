package com.sarx.lightningsword.common.items;

import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class LSpecialSwordItem extends SwordItem {

    // TODO The accuracy of the weapon is based on the distanced desired.
    // Close = Very Accurate
    // Mid = Slightly Accurate
    // Far = Terribly Inaccuracy
    // Weapon will have 3-tiers (As it becomes more charged the weapon's x and z @parm will become greater thus increasing inaccuracy.

    public LSpecialSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {

        ItemStack heldItem = player.getHeldItem(hand);
        if (!world.isRemote) {

            // Obtains where the player is looking
            Vec3d look = player.getLookVec();
            double d1 = player.chasingPosX ;
            double d2 = player.chasingPosY ;
            double d3 = player.chasingPosZ ;

            // Appends this to where the player is looking and is multiplied by a certain distance
            double f1 = d1 += look.getX() * 10D;
            double f2 = d2 += look.getY();
            double f3 = d3 += look.getZ() * 10D;

            // Handles spawning the LightningBolt entity
            LightningBoltEntity bolt = new LightningBoltEntity(world, d1,f2,d3, false);
            ((ServerWorld) world).addLightningBolt(bolt);

            // Debugging Purposes
            player.sendMessage(new StringTextComponent("Player X: " + d1 + "Player Y: " + f2 + "Player Z: " +d3 ).applyTextStyle(TextFormatting.RED));
            player.sendMessage(new StringTextComponent("Sword X: " + f1 + "Sword Y: " + f2 + "Sword Z: " + f3 ).applyTextStyle(TextFormatting.RED));
        }
        return new ActionResult<ItemStack>(ActionResultType.SUCCESS, heldItem);
    }
}

