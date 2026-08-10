package com.example.structure.Decorator;

public class DarkRoast implements Beverages {
    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    @Override
    public double getCost() {
        return 3.00;
    }
}
