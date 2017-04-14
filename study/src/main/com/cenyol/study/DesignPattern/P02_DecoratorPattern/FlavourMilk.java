package com.cenyol.study.DesignPattern.P02_DecoratorPattern;

/**
 * Created by cenyol on 12/04/2017.
 */
public class FlavourMilk extends AbstractCondimentDecorator {

    public FlavourMilk(AbstractBeverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", " + this.getClass().getSimpleName();
    }

    public double cost() {
        return this.beverage.cost() + 0.2;
    }
}
