package com.cenyol.study.designPartner.P01_ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cenyol on 12/04/2017.
 */
public interface iObservable {
    List<iObserver> observerList = new ArrayList<iObserver>();

    void addObserver(iObserver observer);
    void removeObserver(iObserver observer);
    void notifyAllObserver(DataObj dataObj);
}
