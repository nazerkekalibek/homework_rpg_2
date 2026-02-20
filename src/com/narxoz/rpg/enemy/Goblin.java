package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.List;

public class Goblin implements Enemy {

    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private List<Ability> abilities;
    private LootTable lootTable;

    public Goblin(String name, LootTable lootTable) {
        this.name = name;
        this.health = 100;
        this.damage = 15;
        this.defense = 5;
        this.speed = 35;
        this.abilities = new ArrayList<>();
        this.lootTable = lootTable;
    }

    public String getName() {
        return name;
    }

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

    @Override
    public Enemy copy() {

        List<Ability> clonedAbilities = new ArrayList<>();
        for (Ability ability : abilities) {
            clonedAbilities.add(ability.clone());
        }

        Goblin cloned = new Goblin(this.name, this.lootTable.clone());
        cloned.health = this.health;
        cloned.damage = this.damage;
        cloned.defense = this.defense;
        cloned.speed = this.speed;
        cloned.abilities = clonedAbilities;

        return cloned;
    }

    public void displayInfo() {
        System.out.println("=== " + name + " (Goblin) ===");
        System.out.println("Health: " + health + " | Damage: " + damage + " | Defense: " + defense + " | Speed: " + speed);
        System.out.println("Abilities: " + abilities.size() + " ability(ies)");
    }
}
