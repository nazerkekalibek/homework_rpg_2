package com.narxoz.rpg.combat;

public class DarkAura implements Ability{
    @Override
    public String getName(){
        return "Dark Aura";
    }
    
    @Override
    public int getDamage(){
        return 150;
    }

    @Override
    public String getDescription(){
        return "emits dark energy damaging nearby enemies";
    }

    @Override
    public Ability clone(){
        return new DarkAura();
    }
}
