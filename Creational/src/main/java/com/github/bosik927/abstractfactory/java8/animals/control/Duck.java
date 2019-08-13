package com.github.bosik927.abstractfactory.java8.animals.control;

import com.github.bosik927.abstractfactory.java8.animals.boundary.Animal;

public class Duck implements Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}