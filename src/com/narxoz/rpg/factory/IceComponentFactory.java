package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import java.util.List;
import java.util.ArrayList;

public class IceComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities=new ArrayList<>();
        abilities.add(new FrostBreath());
        abilities.add(new IceShield());
        return abilities;
    }
    @Override
    public LootTable createLootTable(){
        return new IceLootTable();
    }

    @Override
    public String createAIBehavior(){
        return "defensive ice AI";
    }
}