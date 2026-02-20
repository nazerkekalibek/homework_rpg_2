package com.narxoz.rpg.combat;

public class FrostBreath implements Ability{
    @Override
    public String getName(){
        return "frost breath";
    }

    @Override
    public int getDamage(){
        return 300;

    }

    @Override
    public String getDescription(){
        return "freezes enemies with icy wind";
    }

    @Override
    public Ability clone(){
        return new FrostBreath();
    }
    
}
