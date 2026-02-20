package com.narxoz.rpg.prototype;

import com.narxoz.rpg.enemy.Enemy;
import java.util.Map;
import java.util.HashMap;

public class EnemyRegistry {
    private Map<String, Enemy> templates=new HashMap<>();
    public void register(String key, Enemy enemy) {
        templates.put(key, enemy);
    }
    public Enemy create(String key){
        return templates.get(key).copy();
    }
}