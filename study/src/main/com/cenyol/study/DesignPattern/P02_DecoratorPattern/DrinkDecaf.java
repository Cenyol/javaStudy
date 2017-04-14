package com.cenyol.study.DesignPattern.P02_DecoratorPattern;

/**
 * Created by cenyol on 12/04/2017.
 */
public class DrinkDecaf extends AbstractBeverage {
    public double cost() {
        return 7;
    }

    public String getDescription() {
        return this.getClass().getSimpleName();
    }
}
