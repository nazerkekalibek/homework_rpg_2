package com.narxoz.rpg.enemy;

public class EnemyStats {

    private int health;
    private int damage;

    public EnemyStats(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void multiply(double factor) {
        this.health = (int)(health * factor);
        this.damage = (int)(damage * factor);
    }
}
