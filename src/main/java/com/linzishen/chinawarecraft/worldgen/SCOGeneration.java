package com.linzishen.chinawarecraft.worldgen;

import com.linzishen.chinawarecraft.blocks.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class SCOGeneration implements IWorldGenerator{
    public WorldGenMinable GenSCO = new WorldGenMinable(ModBlocks.SULPHUR_COBALT_ORE.getDefaultState(),12);
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        GenSCO.generate(world,random,new BlockPos(chunkX * 16 + random.nextInt(16),45 + random.nextInt(10),chunkZ * 16 + random.nextInt(16)));

    }
}
