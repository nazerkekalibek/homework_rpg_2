package com.narxoz.rpg.loot;

import java.util.List;

public class IceLootTable implements LootTable {
    @Override
    public List<String> getItems(){
        return List.of("ice shard", "frost crystal");
    }
    
    @Override
    public int getGold(){
        return 70;
    }

    @Override
    public LootTable clone(){
        return new IceLootTable();
    }
}
