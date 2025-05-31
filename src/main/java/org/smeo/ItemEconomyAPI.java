package org.smeo;

import org.bukkit.inventory.ItemStack;

public interface ItemEconomyAPI {

    double getSellPrice(ItemStack itemStack);
    double getSellPrice(String itemName);

    double getBuyPrice(ItemStack itemStack);
    double getBuyPrice(String itemName);

    boolean isItemBuyable(ItemStack itemStack);
    boolean isItemBuyable(String itemName);

    boolean isItemSellable(ItemStack itemStack);
    boolean isItemSellable(String itemName);
}