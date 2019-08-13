package com.github.bosik927.abstractfactory.java8.factory.control;

import com.github.bosik927.abstractfactory.java8.factory.boundary.AbstractFactory;
import com.github.bosik927.abstractfactory.java8.factory.boundary.Factors;

public class FactoryProvider {

    private static FactoryProvider instance;

    public static FactoryProvider getInstance() {
        if (instance == null) {
            synchronized (FactoryProvider.class) {
                if (instance == null) {
                    instance = new FactoryProvider();
                }
            }
        }
        return instance;
    }

    public AbstractFactory getFactory(String choice) {
        if (Factors.ANIMAL.name().equalsIgnoreCase(choice)) {
            return AnimalFactory.getInstance();
        } else if (Factors.COLOR.name().equalsIgnoreCase(choice)) {
            return ColorFactory.getInstance();
        }
        return null;
    }

    private FactoryProvider(){
    }
}