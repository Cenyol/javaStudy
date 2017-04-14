package com.cenyol.study.DesignPattern.P05_CommandPattern.product;

/**
 * Created by cenyol on 14/04/2017.
 */
public class Hottub {
    public void jetsOn(){
        System.out.println("Hottub is on.");
    }

    public void jetsOff(){
        System.out.println("Hottub is off.");
    }

    public void setTemp(int temp){
        System.out.println("Hottub is set to:" + temp);
    }

}
