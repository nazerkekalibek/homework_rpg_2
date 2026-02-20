package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;


public interface Enemy {
    String getName();
    int getHealth();
    int getDamage();
    List<Ability> getAbilities();
    LootTable getLootTable();
    Enemy copy();
}
