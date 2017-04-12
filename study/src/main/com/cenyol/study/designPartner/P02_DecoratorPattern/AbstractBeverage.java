package com.cenyol.study.designPartner.P02_DecoratorPattern;

/**
 * Created by cenyol on 12/04/2017.
 */
public abstract class AbstractBeverage {
    protected String description = "";

    public abstract double cost();
    public abstract String getDescription();
}
