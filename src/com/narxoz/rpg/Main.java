package com.narxoz.rpg;

import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.loot.*;
import com.narxoz.rpg.prototype.EnemyRegistry;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Enemy System - Creational Patterns Capstone ===\n");

        EnemyComponentFactory fireFactory = new FireComponentFactory();
        EnemyComponentFactory iceFactory = new IceComponentFactory();
        EnemyComponentFactory shadowFactory = new ShadowComponentFactory();

        List<Ability> fireAbilities = fireFactory.createAbilities();
        List<Ability> iceAbilities = iceFactory.createAbilities();
        List<Ability> shadowAbilities = shadowFactory.createAbilities();

        LootTable fireLoot = fireFactory.createLootTable();
        LootTable iceLoot = iceFactory.createLootTable();
        LootTable shadowLoot = shadowFactory.createLootTable();

        System.out.println("Fire abilities: " + fireAbilities.size());
        System.out.println("Ice abilities: " + iceAbilities.size());
        System.out.println("Shadow abilities: " + shadowAbilities.size());
        System.out.println();


        System.out.println("============================================");
        System.out.println("PART 2: BUILDER - Complex Enemy Construction");
        System.out.println("============================================\n");

        DragonBoss fireDragon = (DragonBoss) new DragonBossBuilder()
                .setName("Inferno Dragon")
                .setHealth(8000)
                .setDamage(500)
                .setDefense(300)
                .setSpeed(75)
                .setElement("Fire")
                .setAbilities(fireAbilities)
                .setPhases(6000, 3000, 1000)
                .setLootTable(fireLoot)
                .setAI("Aggressive Fire AI")
                .setFlying(true)
                .setBreathAttack(true)
                .setWingspan(18)
                .build();
        
        DragonBoss iceDragon = (DragonBoss) new DragonBossBuilder()
                .setName("Glacier Dragon")
                .setHealth(7500)
                .setDamage(480)
                .setDefense(350)
                .setSpeed(65)
                .setElement("Ice")
                .setAbilities(iceAbilities)
                .setPhases(5500, 2800, 900)
                .setLootTable(iceLoot)
                .setAI("Defensive Ice AI")
                .setFlying(true)
                .setBreathAttack(true)
                .setWingspan(16)
                .build();

        DragonBoss shadowDragon = (DragonBoss) new DragonBossBuilder()
                .setName("Shadow Reaper Dragon")
                .setHealth(7000)
                .setDamage(550)
                .setDefense(250)
                .setSpeed(90)
                .setElement("Shadow")
                .setAbilities(shadowAbilities)
                .setPhases(5000, 2500, 800)
                .setLootTable(shadowLoot)
                .setAI("Stealth Shadow AI")
                .setFlying(true)
                .setBreathAttack(false)
                .setWingspan(15)
                .build();

        fireDragon.displayInfo();
        System.out.println();
        iceDragon.displayInfo();
        System.out.println();
        shadowDragon.displayInfo();
        System.out.println();        

        System.out.println("============================================");
        System.out.println("PART 3: PROTOTYPE - Enemy Cloning & Variants");
        System.out.println("============================================\n");

        EnemyRegistry registry = new EnemyRegistry();

        registry.register("fire", fireDragon);
        registry.register("ice", iceDragon);
        registry.register("shadow", shadowDragon);

        Enemy fireClone = registry.create("fire");
        Enemy iceClone = registry.create("ice");
        Enemy shadowClone = registry.create("shadow");

        System.out.println("FIRE CLONE:");
        ((DragonBoss) fireClone).displayInfo();
        System.out.println();

        System.out.println("ICE CLONE:");
        ((DragonBoss) iceClone).displayInfo();
        System.out.println();

        System.out.println("SHADOW CLONE:");
        ((DragonBoss) shadowClone).displayInfo();
        System.out.println();


        System.out.println("============================================");
        System.out.println("PART 4: DIRECTOR - Preconfigured Boss Variants");
        System.out.println("============================================\n");

        EnemyDirector director = new EnemyDirector(new DragonBossBuilder());

        Enemy miniBoss = director.createMiniBoss();
        Enemy raidBoss = director.createRaidBoss();

        System.out.println("MINI BOSS:");
        ((DragonBoss) miniBoss).displayInfo();
        System.out.println();

        System.out.println("RAID BOSS:");
        ((DragonBoss) raidBoss).displayInfo();
        System.out.println();

        System.out.println("=================================================");
        System.out.println("PART 5: GOBLIN PROTOTYPE TEST");
        System.out.println("=================================================\n");

        Goblin goblinTemplate = new Goblin("Cave Goblin", shadowLoot);
        registry.register("goblin", goblinTemplate);

        Enemy goblin1 = registry.create("goblin");
        Enemy goblin2 = registry.create("goblin");

        ((Goblin) goblin1).displayInfo();
        System.out.println();
        ((Goblin) goblin2).displayInfo();

        System.out.println("============================================");
        System.out.println("PATTERN SUMMARY");
        System.out.println("============================================");

        System.out.println("Abstract Factory -> Fire / Ice / Shadow components");
        System.out.println("Builder -> Step-by-step Dragon construction");
        System.out.println("Prototype -> Deep cloning via copy()");
        System.out.println("Registry -> Stores enemy templates");
        System.out.println("Director -> Predefined boss builds");
        
        System.out.println();
        
        System.out.println("\n=== Demo Complete ===");
    }

}
