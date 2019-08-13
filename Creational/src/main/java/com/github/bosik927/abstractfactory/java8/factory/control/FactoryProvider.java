package com.github.bosik927.abstractfactory.java8.factory.control;

import com.github.bosik927.abstractfactory.java8.factory.boundary.AbstractFactory;
import com.github.bosik927.abstractfactory.java8.factory.boundary.Factors;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        if (Factors.ANIMAL.name().equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if (Factors.COLOR.name().equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}