package com.narxoz.rpg.combat;

public class IceShield implements Ability{
    @Override
    public String getName(){
        return "ice Shield";
    }
    
    @Override
    public int getDamage(){
        return 0;
    }

    @Override
    public String getDescription(){
        return "ice armor increases defense";
    }

    @Override
    public Ability clone(){
        return new IceShield();
    }
}
