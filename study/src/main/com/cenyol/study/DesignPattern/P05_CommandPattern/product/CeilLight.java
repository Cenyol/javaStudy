package com.cenyol.study.DesignPattern.P05_CommandPattern.product;

/**
 * Created by cenyol on 14/04/2017.
 */
public class CeilLight {
    public void on(){
        System.out.println("CeilLight is on.");
    }

    public void off(){
        System.out.println("CeilLight is off.");
    }

    public void dim(){
        System.out.println("CeilLight is dim.");
    }
}
