package com.github.bosik927.observer.sample.observers.control;

import com.github.bosik927.observer.sample.observers.boundary.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer o) {
        observers.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int value) {
        state = value;
        execute();
    }

    private void execute() {
        observers.forEach(Observer::update);
    }
}