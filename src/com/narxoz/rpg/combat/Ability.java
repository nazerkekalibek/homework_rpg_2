package com.narxoz.rpg.combat;

public interface Ability {
    String getName();
    int getDamage();
    Ability clone();
}
