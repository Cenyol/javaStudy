package com.cenyol.study.DesignPattern.P01_ObserverPattern;

/**
 * Created by cenyol on 15/03/2017.
 */
public class Client {

    public static void main(String[] args){
        Observable observable = new Observable();

        observable.addObserver(new ObverserOne());
        observable.addObserver(new ObverserTwo());
        observable.addObserver(new ObverserThree());

        DataObj dataObj = new DataObj();
        dataObj.setHumidity(1);
        dataObj.setPresssure(3);
        dataObj.setTemp(8);

        observable.setMeasurement(dataObj);
    }
}
