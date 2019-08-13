package com.github.bosik927.abstractfactory.java8.animals.control;

import com.github.bosik927.abstractfactory.java8.animals.boundary.Animal;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Chow";
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}