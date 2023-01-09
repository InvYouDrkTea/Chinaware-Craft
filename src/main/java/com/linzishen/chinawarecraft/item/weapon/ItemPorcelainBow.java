package com.linzishen.chinawarecraft.item.weapon;

import com.linzishen.chinawarecraft.item.ModItems;
import net.minecraft.item.ItemBow;

public class ItemPorcelainBow extends ItemBow {
    public ItemPorcelainBow(String name) {
        super();
        setRegistryName(name);
        setUnlocalizedName(name);

        ModItems.ITEMS.add(this);
    }
}
