package com.github.bosik927.abstractfactory.java8.factory.control;

import com.github.bosik927.abstractfactory.java8.animals.boundary.Animal;
import com.github.bosik927.abstractfactory.java8.animals.boundary.Animals;
import com.github.bosik927.abstractfactory.java8.animals.control.Cat;
import com.github.bosik927.abstractfactory.java8.animals.control.Dog;
import com.github.bosik927.abstractfactory.java8.animals.control.Duck;
import com.github.bosik927.abstractfactory.java8.factory.boundary.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if (Animals.DOG.name().equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if (Animals.DUCK.name().equalsIgnoreCase(animalType)) {
            return new Duck();
        } else if (Animals.CAT.name().equalsIgnoreCase(animalType)) {
            return new Cat();
        }
        return null;
    }

}