package com.sarx.lightningsword.common.items;

import com.sarx.lightningsword.common.util.TextComponent;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.network.play.server.SSpawnMobPacket;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class LSpecialSwordItem extends SwordItem {

    TextComponent message;
    SSpawnMobPacket mobPacket = new SSpawnMobPacket();


    public LSpecialSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {

        ItemStack heldItem = player.getHeldItem(hand);
        if (!world.isRemote) {

            Vec3d look = player.getLookVec();
            double d1 = player.serverPosX;
            double d2 = player.serverPosY;
            double d3 = player.serverPosZ;

            LightningBoltEntity bolt = new LightningBoltEntity(world, d1,d2,d3, false);
            ((ServerWorld) world).addLightningBolt(bolt);
            player.sendMessage(new StringTextComponent("X: " + d1 + "Y: " + d2 + "Z: " +d3 ).applyTextStyle(TextFormatting.RED));
            }
        return new ActionResult<ItemStack>(ActionResultType.SUCCESS, heldItem);
    }
}

