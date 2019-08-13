package com.github.bosik927.abstractfactory.java8;

import com.github.bosik927.abstractfactory.java8.factory.boundary.AbstractFactory;
import com.github.bosik927.abstractfactory.java8.factory.control.FactoryProvider;

public class Main {

    public static void main(String... args){
        AbstractFactory animalFactory = FactoryProvider.getFactory("Animal");
        System.out.println(animalFactory);
        System.out.println(animalFactory.create("Cat"));
        System.out.println(animalFactory.create("Dog"));

        AbstractFactory colorFactory = FactoryProvider.getFactory("Color");
        System.out.println(colorFactory);
        System.out.println(colorFactory.create("Blue"));
        System.out.println(colorFactory.create("rEd"));
    }
}