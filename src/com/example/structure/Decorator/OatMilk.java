package com.example.structure.Decorator;

public class OatMilk extends BeverageDecorator{
    public OakMilk(Beverages beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50;
    }
}
