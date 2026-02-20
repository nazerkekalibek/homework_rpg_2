package com.narxoz.rpg.combat;

public class ShadowStrike implements Ability{
    @Override
    public String getName(){
        return "shadow strike";
    }

    @Override
    public int getDamage(){
        return 450;
    }
    @Override
    public String getDescription(){
        return "deadly shadow attack";
    }
    @Override
    public Ability clone(){
        return new ShadowStrike();
    }
    
}
