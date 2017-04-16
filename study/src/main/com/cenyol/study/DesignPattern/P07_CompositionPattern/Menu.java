package com.cenyol.study.DesignPattern.P07_CompositionPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by cenyol on 16/04/2017.
 */
public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents;

    public Menu(String name, String description){
        super(name, description);
    }
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return menuComponents.get(i);
    }

    public void print(){
        System.out.print("\n" + this.getName());
        System.out.print("\n" + this.getDescription());
        System.out.print("\n---------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
