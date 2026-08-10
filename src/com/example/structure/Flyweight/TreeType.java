package com.example.structure.Flyweight;

public class TreeType { //Flyweight (Intrinsic Shared State)
    private final String name;
    private final String texture;

    public TreeType(String name, String texture) {
        this.name = name;
        this.texture = texture;
    }

    public void draw(int x, int y){
        System.out.println("Rendering "+ name + " at coordinates ("+x+","+y+")");
    }
}
