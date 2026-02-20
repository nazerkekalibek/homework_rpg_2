package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DragonBoss implements Enemy {
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private String element;
    private List<Ability> abilities;
    private Map<Integer, Integer> phases;
    private LootTable lootTable;
    private String aiBehavior;
    private boolean canFly;
    private boolean hasBreathAttack;
    private int wingspan;

    public DragonBoss(String name, int health, int damage, int defense, int speed, String element, List<Ability> abilities, int phase1Threshold, int phase2Threshold, int phase3Threshold, LootTable lootTable, String aiBehavior, boolean canFly, boolean hasBreathAttack, int wingspan) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        this.element = element;
        this.abilities = abilities != null ? abilities : new ArrayList<>();
        this.phases = new HashMap<>();
        this.phases.put(1, phase1Threshold);
        this.phases.put(2, phase2Threshold);
        this.phases.put(3, phase3Threshold);
        this.lootTable = lootTable;
        this.aiBehavior = aiBehavior;
        this.canFly = canFly;
        this.hasBreathAttack = hasBreathAttack;
        this.wingspan = wingspan;
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
        return new DragonBoss(name, health, damage, defense, speed, element, clonedAbilities,
                phases.get(1),
                phases.get(2),
                phases.get(3),
                lootTable.clone(),
                aiBehavior,
                canFly,
                hasBreathAttack,
                wingspan
        );
    }

    public void displayInfo() {
        System.out.println("=== " + name + " (Dragon Boss) ===");
        System.out.println("Health: " + health + " | Damage: " + damage + " | Defense: " + defense + " | Speed: " + speed);
        System.out.println("Element: " + element);
        System.out.println("Abilities (" + abilities.size() + "):");
        System.out.println("Boss Phases: " + phases.size());
        for (Ability ability : abilities) {
            System.out.println(" - " + ability.getName()
                    + " (" + ability.getDamage() + ")");
        }

        System.out.println("Boss Phases:");
        for (Map.Entry<Integer, Integer> phase : phases.entrySet()) {
            System.out.println("  Phase " + phase.getKey() + ": triggers at " + phase.getValue() + " HP");
        }
        System.out.println("AI Behavior: " + aiBehavior);
        System.out.println("Can Fly: " + canFly + " | Breath Attack: " + hasBreathAttack + " | Wingspan: " + wingspan);
    }

}
