package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;

public abstract class AbstractEnemy implements Enemy{
    protected String name;
    protected int health;
    protected int damage;
    protected List<Ability> abilities;
    protected LootTable lootTable;

    public AbstractEnemy(String name, int health, int damage, List<Ability> abilities, LootTable lootTable) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.abilities = abilities;
        this.lootTable = lootTable;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public List<Ability> getAbilities() {
        return abilities;
    }
    @Override
    public LootTable getLootTable() {
        return lootTable;
    }
}
