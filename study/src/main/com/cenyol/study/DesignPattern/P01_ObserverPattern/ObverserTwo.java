package com.cenyol.study.DesignPattern.P01_ObserverPattern;

/**
 * Created by cenyol on 12/04/2017.
 */
public class ObverserTwo implements iObserver, iDisplay{
    private DataObj dataObj;

    public void update(DataObj dataObj) {
        this.dataObj = dataObj;
        display();
    }

    public void display() {
        System.out.println(this.getClass().getName() + ":" + dataObj.toString());
    }
}
