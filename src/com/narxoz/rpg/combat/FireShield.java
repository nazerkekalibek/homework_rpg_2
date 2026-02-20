package com.narxoz.rpg.combat;

public class FireShield implements Ability{
    @Override
    public String getName(){
        return "fire shield";
    }
    
    @Override
    public int getDamage(){
        return 0;
    }

    @Override
    public String getDescription(){
        return "burning defensive shield";
    }

    @Override
    public Ability clone(){
        return new FireShield();
    }
}
