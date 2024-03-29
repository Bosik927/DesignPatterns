package com.github.bosik927.abstractfactory.java8.factory.control;

import com.github.bosik927.abstractfactory.java8.color.control.Blue;
import com.github.bosik927.abstractfactory.java8.color.boundary.Color;
import com.github.bosik927.abstractfactory.java8.color.boundary.Colors;
import com.github.bosik927.abstractfactory.java8.color.control.Red;
import com.github.bosik927.abstractfactory.java8.factory.boundary.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {

    private static AbstractFactory instance;

    public static AbstractFactory getInstance() {
        if (instance == null) {
            synchronized (AbstractFactory.class) {
                if (instance == null) {
                    instance = new ColorFactory();
                }
            }
        }
        return instance;
    }

    @Override
    public Color create(String color) {
        if (Colors.RED.name().equalsIgnoreCase(color)) {
            return new Red();
        } else if (Colors.BLUE.name().equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }

    private ColorFactory() {
    }
}