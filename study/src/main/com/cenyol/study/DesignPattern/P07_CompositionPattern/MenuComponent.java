package com.cenyol.study.DesignPattern.P07_CompositionPattern;

/**
 * Created by cenyol on 16/04/2017.
 */
public abstract class MenuComponent {
    protected String name;
    protected String description;

    public MenuComponent(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}
