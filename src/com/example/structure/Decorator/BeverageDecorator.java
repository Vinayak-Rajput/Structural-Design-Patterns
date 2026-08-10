package com.example.structure.Decorator;

abstract class BeverageDecorator implements Beverages{

    protected final Beverages beverage;

    public BeverageDecorator(Beverages beverage){
        this.beverage=beverage;
    }
}
