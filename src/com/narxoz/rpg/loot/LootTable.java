package com.narxoz.rpg.loot;

import java.util.List;

public interface LootTable {
    List<String> getItems();
    int getGold();
    LootTable clone();
}
