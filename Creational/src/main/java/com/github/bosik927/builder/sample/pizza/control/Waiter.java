package com.github.bosik927.builder.sample.pizza.control;

import com.github.bosik927.builder.sample.pizza.entity.Pizza;
import com.github.bosik927.builder.sample.pizza.boundary.PizzaBuilder;

public class Waiter {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder builder) {
        pizzaBuilder = builder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}