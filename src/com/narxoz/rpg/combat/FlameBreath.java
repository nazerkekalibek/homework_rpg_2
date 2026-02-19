package com.narxoz.rpg.combat;

public class FlameBreath implements Ability {
    public String getName(){
        return "flame breath";
    }
    public int getDamage(){
        return 250;
    }
    public Ability clone(){
        return new FlameBreath();
    }
}
