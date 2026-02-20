package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;

public interface EnemyBuilder {
    EnemyBuilder setName(String name);
    EnemyBuilder setHealth(int health);
    EnemyBuilder setDamage(int damage);
    Enemy build();
}