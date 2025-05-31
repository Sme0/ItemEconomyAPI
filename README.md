# ItemEconomyAPI

A Spigot/Bukkit API interface for interacting with the ItemEconomy plugin’s shop prices and item tradeability.


### Overview

`ItemEconomyAPI` allows other plugins to retrieve buy and sell prices for items as well as check if an item exists in sections of the config.  
It supports both `ItemStack` and item name (`String`) parameters for each function.


### Maven Setup

To use this API with maven, add the JitPack repository and the dependency to your plugin’s `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.Sme0</groupId>
        <artifactId>ItemEconomyAPI</artifactId>
        <version>v1.0.0</version>
    </dependency>
</dependencies>
```

## API Methods

The `ItemEconomyAPI` interface provides the following methods to interact with item prices and trade status:

### Price Retrieval

- `double getSellPrice(ItemStack itemStack)`  
  Returns the price at which the given `ItemStack` can be sold.

- `double getSellPrice(String itemName)`  
  Returns the price at which an item identified by its name can be sold.

- `double getBuyPrice(ItemStack itemStack)`  
  Returns the price at which the given `ItemStack` can be bought.

- `double getBuyPrice(String itemName)`  
  Returns the price at which an item identified by its name can be bought.

### Trade Availability Checks

- `boolean isItemBuyable(ItemStack itemStack)`  
  Returns `true` if the given `ItemStack` can be bought.

- `boolean isItemBuyable(String itemName)`  
  Returns `true` if the item identified by name can be bought.

- `boolean isItemSellable(ItemStack itemStack)`  
  Returns `true` if the given `ItemStack` can be sold.

- `boolean isItemSellable(String itemName)`  
  Returns `true` if the item identified by name can be sold.
