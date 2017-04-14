package com.cenyol.study.DesignPattern.P05_CommandPattern.product;

/**
 * Created by cenyol on 14/04/2017.
 */
public class Stereo {
    public void on(){
        System.out.println("Stereo is on.");
    }

    public void off(){
        System.out.println("Stereo is off.");
    }

    public void setCd(){
        System.out.println("Stereo is set cd.");
    }

    public void setVolume(int volume){
        System.out.println("Stereo is set Volume:" + volume);
    }
}
