package com.example.structure.Flyweight;

public class Tree { // Context Object (Extrinsic unshared state)
    private final int x,y;
    private final TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(){
        type.draw(x,y);
    }
}
