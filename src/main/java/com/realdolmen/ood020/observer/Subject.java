package com.realdolmen.ood020.observer;

import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.internal.xjc.reader.Ring.add;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public abstract class Subject {
    List<Observer> observers = new ArrayList<>();



    public boolean addObserver(Observer observer){
        return observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    };

    public void notifyObserver() {
        for (Observer ob : observers) {
            ob.update();
        }
    }

}
