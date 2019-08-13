package com.github.bosik927.abstractfactory.java8.factory.boundary;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}