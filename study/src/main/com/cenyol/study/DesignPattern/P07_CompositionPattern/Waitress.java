package com.cenyol.study.DesignPattern.P07_CompositionPattern;

/**
 * Created by cenyol on 16/04/2017.
 */
public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void print(){
        allMenus.print();
    }
}
