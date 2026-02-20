package com.narxoz.rpg.loot;

import java.util.List;

public class ShadowLootTable implements LootTable {
    @Override
    public List<String> getItems(){
        return List.of("shadow essence", "dark crystal");
    }

    @Override
    public int getGold(){
        return 80;
    }

    @Override
    public LootTable clone(){
        return new ShadowLootTable();
    }
}
