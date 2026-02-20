package com.narxoz.rpg.enemy;

import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {

    private Map<String, Enemy> templates = new HashMap<>();

    public void register(String key, Enemy enemy) {
        templates.put(key, enemy);
    }

    public Enemy create(String key) {
        if (!templates.containsKey(key)) {
            throw new IllegalArgumentException("Enemy not found: " + key);
        }
        return templates.get(key).copy();
    }
}
