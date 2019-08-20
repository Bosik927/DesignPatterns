package com.github.bosik927.builder.sample.pizza.boundary;

import com.github.bosik927.builder.sample.pizza.entity.Pizza;

abstract public class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}