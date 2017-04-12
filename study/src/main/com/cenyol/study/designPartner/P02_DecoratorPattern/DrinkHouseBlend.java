package com.cenyol.study.designPartner.P02_DecoratorPattern;

/**
 * Created by cenyol on 12/04/2017.
 */
public class DrinkHouseBlend extends AbstractBeverage {
    public double cost() {
        return 5;
    }

    public String getDescription() {
        return this.getClass().getSimpleName();
    }
}
