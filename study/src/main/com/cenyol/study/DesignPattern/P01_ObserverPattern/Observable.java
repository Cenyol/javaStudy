package com.cenyol.study.DesignPattern.P01_ObserverPattern;

/**
 * Created by cenyol on 12/04/2017.
 */
public class Observable implements iObservable {
    DataObj dataObj;

    public Observable(){
        dataObj = new DataObj();
    }

    public void addObserver(iObserver observer) {
        observerList.add(observer);
    }

    public void removeObserver(iObserver observer) {
        int i = observerList.indexOf(observer);
        if (i >= 0){
            observerList.remove(i);
        }
    }

    public void notifyAllObserver(DataObj dataObj) {
        int length = observerList.size();
        for (int i = 0; i < length; i++){
            observerList.get(i).update(dataObj);
        }
    }

    public void setMeasurement(DataObj dataObj){
        this.notifyAllObserver(dataObj);
    }
}
