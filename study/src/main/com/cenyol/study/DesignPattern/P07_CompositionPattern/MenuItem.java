package com.cenyol.study.DesignPattern.P07_CompositionPattern;

import java.util.Iterator;

/**
 * Created by cenyol on 16/04/2017.
 */
public class MenuItem extends MenuComponent {
    private double price;
    private boolean isVegetarian;

    public MenuItem(String name, String description, double price, boolean isVegetarian){
        super(name, description);
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean isVegetarian(){
        return this.isVegetarian;
    }

    public void print(){
        System.out.print("\t" + this.getName());
        if (this.isVegetarian()){
            System.out.print("(v)");
        }
        System.out.print(",\t" + this.getPrice());
        System.out.println("\t----" + this.getDescription());
    }
}
