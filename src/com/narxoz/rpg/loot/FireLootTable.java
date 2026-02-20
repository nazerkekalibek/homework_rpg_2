package com.narxoz.rpg.loot;

import java.util.List;

public class FireLootTable implements LootTable{
    @Override
    public List<String> getItems(){
        return List.of("fire gem", "dragon scale");
    }
    
    @Override
    public int getGold(){
        return 100;
    }

    @Override
    public LootTable clone(){
        return new FireLootTable();
    }
}