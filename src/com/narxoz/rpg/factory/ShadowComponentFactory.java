package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;

import java.util.List;
import java.util.ArrayList;

public class ShadowComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities =new ArrayList<>();
        abilities.add(new ShadowStrike());
        abilities.add(new DarkAura());
        return abilities;
    }
    @Override
    public LootTable createLootTable(){
        return new ShadowLootTable();
    }

    @Override
    public String createAIBehavior() {
        return "stealth shadow AI";
    }
}