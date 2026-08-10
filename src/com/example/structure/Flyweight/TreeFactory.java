package com.example.structure.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory { // Flyweight Factory
    private static final Map<String,TreeType> types = new HashMap<>();

    public static TreeType getTreeType(String name, String texture){
        return types.computeIfAbsent(name, k -> new TreeType(name, texture));
    }
}
