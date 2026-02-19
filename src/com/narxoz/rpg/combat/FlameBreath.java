package com.narxoz.rpg.combat;

public class FlameBreath implements Ability {
    @Override
    public String getName(){
        return "flame breath";
    }
    @Override
    public int getDamage(){
        return 250;
    }
    @Override
    public String getDescription(){
        return "Deals area fire damage and burns enemies ";
    }
    @Override
    public Ability clone(){
        return new FlameBreath();
    }
}
