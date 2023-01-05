package com.linzishen.chinawarecraft.item.weapon;

import com.linzishen.chinawarecraft.item.ItemSwordBase;
import com.linzishen.chinawarecraft.potion.ModPotions;
import com.linzishen.chinawarecraft.util.CommonFunctions;
import com.linzishen.chinawarecraft.util.EntityUtil;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemPorcelainSword extends ItemSwordBase {
    public ItemPorcelainSword(String name, ToolMaterial material) {
        super(name, material);
        CommonFunctions.addToEventBus(this);
    }

    @SubscribeEvent
    public void onAttack(LivingHurtEvent event)
    {
        World world = event.getEntity().world;
        if (!world.isRemote)
        {
            EntityLivingBase hurtOne = event.getEntityLiving();
            EntityLivingBase attacker = (EntityLivingBase) event.getSource().getTrueSource();

            if (attacker != null && attacker.getHeldItemMainhand().getItem() == this)
            {
                /*写效果*/
                if (attacker.getRNG().nextFloat() < 0.2f)
                {
                    event.setAmount(event.getAmount() * 1.5f);
                }
            }
        }
    }
}
