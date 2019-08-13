package com.github.bosik927.abstractfactory.java8.animals.control;

import com.github.bosik927.abstractfactory.java8.animals.boundary.Animal;

public class Cat implements Animal {

    @Override
    public String getAnimal() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}