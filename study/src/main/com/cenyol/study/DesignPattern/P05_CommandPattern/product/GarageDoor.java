package com.cenyol.study.DesignPattern.P05_CommandPattern.product;

/**
 * Created by cenyol on 14/04/2017.
 */
public class GarageDoor {
    public void up(){
        System.out.println("GarageDoor is up.");
    }

    public void down(){
        System.out.println("GarageDoor is down.");
    }

    public void stop(){
        System.out.println("GarageDoor is stop.");
    }

    public void lightOn(){
        System.out.println("GarageDoor Light is on.");
    }

    public void lightOff(){
        System.out.println("GarageDoor Light is off.");
    }

}
