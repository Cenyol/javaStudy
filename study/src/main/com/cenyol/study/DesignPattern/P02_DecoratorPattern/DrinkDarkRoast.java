package com.cenyol.study.DesignPattern.P02_DecoratorPattern;

/**
 * Created by cenyol on 12/04/2017.
 */
public class DrinkDarkRoast extends AbstractBeverage {
    public double cost() {
        return 6;
    }

    public String getDescription() {
        return this.getClass().getSimpleName();
    }
}
