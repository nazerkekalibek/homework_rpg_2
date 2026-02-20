package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;

public class EnemyDirector{
    private DragonBossBuilder builder;

    public EnemyDirector(DragonBossBuilder builder){
        this.builder=builder;
    }
    public Enemy createMiniBoss(){
        return builder
                .setName("Mini Dragon")
                .setHealth(3000)
                .setDamage(200)
                .setDefense(100)
                .setSpeed(60)
                .setWingspan(8)
                .build();
    }
    public Enemy createRaidBoss() {
        return builder
                .setName("Ancient Raid Dragon")
                .setHealth(10000)
                .setDamage(800)
                .setDefense(400)
                .setSpeed(80)
                .setWingspan(20)
                .build();
    }
}