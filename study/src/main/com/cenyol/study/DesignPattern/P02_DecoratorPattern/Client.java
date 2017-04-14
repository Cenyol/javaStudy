package com.cenyol.study.DesignPattern.P02_DecoratorPattern;

/**
 * Created by cenyol on 12/04/2017.
 */
public class Client {
    public static void main(String[] args){
        AbstractBeverage drinkDarkRoast = new DrinkDarkRoast();
        System.out.println(drinkDarkRoast.getDescription() + ": $" + drinkDarkRoast.cost());

        AbstractBeverage drinkDecaf = new DrinkDecaf();
        drinkDecaf = new FlavourMocha(drinkDecaf);
        drinkDecaf = new FlavourMilk(drinkDecaf);
        drinkDecaf = new FlavourMocha(drinkDecaf);
        System.out.println(drinkDecaf.getDescription() + ": $" + drinkDecaf.cost());

        AbstractBeverage drinkHouseBlend = new DrinkHouseBlend();
        drinkHouseBlend = new FlavourSoy(drinkHouseBlend);
        drinkHouseBlend = new FlavourMilk(drinkHouseBlend);
        drinkHouseBlend = new FlavourMocha(drinkHouseBlend);
        System.out.println(drinkHouseBlend.getDescription() + ": $" + drinkHouseBlend.cost());
    }
}
