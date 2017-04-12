package com.cenyol.study.designPartner.P02_DecoratorPattern;

/**
 * Created by cenyol on 12/04/2017.
 */
public class FlavourSoy extends AbstractCondimentDecorator {

    public FlavourSoy(AbstractBeverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", " + this.getClass().getSimpleName();
    }

    public double cost() {
        return this.beverage.cost() + 0.6;
    }
}
