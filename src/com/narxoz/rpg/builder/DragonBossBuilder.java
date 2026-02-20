package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.DragonBoss;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;

public class DragonBossBuilder implements EnemyBuilder{
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private String element;
    private List<Ability> abilities;
    private int phase1;
    private int phase2;
    private int phase3;
    private LootTable lootTable;
    private String aiBehavior;
    private boolean canFly;
    private boolean hasBreathAttack;
    private int wingspan;

    public DragonBossBuilder setName(String name){
        this.name=name;
        return this;
    }
    public DragonBossBuilder setHealth(int health){
        this.health=health;
        return this;
    }
    public DragonBossBuilder setDamage(int damage){
        this.damage =damage;
        return this;
    }
    public DragonBossBuilder setDefense(int defense) {
        this.defense=defense;
        return this;
    }

    public DragonBossBuilder setSpeed(int speed){
        this.speed=speed;
        return this;
    }

    public DragonBossBuilder setElement(String element){
        this.element=element;
        return this;
    }

    public DragonBossBuilder setAbilities(List<Ability> abilities) {
        this.abilities =abilities;
        return this;
    }

    public DragonBossBuilder setPhases(int p1, int p2, int p3) {
        this.phase1=p1;
        this.phase2=p2;
        this.phase3=p3;
        return this;
    }

    public DragonBossBuilder setLootTable(LootTable lootTable) {
        this.lootTable=lootTable;
        return this;
    }

    public DragonBossBuilder setAI(String ai) {
        this.aiBehavior=ai;
        return this;
    }

    public DragonBossBuilder setFlying(boolean canFly) {
        this.canFly =canFly;
        return this;
    }

    public DragonBossBuilder setBreathAttack(boolean hasBreathAttack) {
        this.hasBreathAttack=hasBreathAttack;
        return this;
    }

    public DragonBossBuilder setWingspan(int wingspan) {
        this.wingspan=wingspan;
        return this;
    }

    @Override
    public Enemy build(){
        return new DragonBoss(name, health, damage, defense, speed, element, abilities, phase1, phase2, phase3, lootTable, aiBehavior, canFly, hasBreathAttack, wingspan);
    }
}
