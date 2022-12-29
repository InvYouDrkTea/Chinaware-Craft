package com.linzishen.chinawarecraft.entity;

import com.linzishen.chinawarecraft.entity.creatures.moroon.EntityMoroonUnitBase;
import com.linzishen.chinawarecraft.entity.creatures.render.RenderBullet;
import com.linzishen.chinawarecraft.entity.creatures.render.RenderMoroonHumanoid;
import com.linzishen.chinawarecraft.entity.projectiles.EntityIdlProjectile;
import com.linzishen.chinawarecraft.IdlFramework;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityMoroonUnitBase.class, RenderMoroonHumanoid::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityIdlProjectile.class, renderManager -> new RenderBullet<>(renderManager, new ResourceLocation(IdlFramework.MODID,
                "textures/entity/projectiles/bullet_norm.png")));
    }
}
