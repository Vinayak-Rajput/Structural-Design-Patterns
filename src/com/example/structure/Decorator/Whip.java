package com.example.structure.Decorator;

public class Whip extends BeverageDecorator{

    public Whip(Beverages beverage){
        super(beverage);
    }
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.70;
    }
}
