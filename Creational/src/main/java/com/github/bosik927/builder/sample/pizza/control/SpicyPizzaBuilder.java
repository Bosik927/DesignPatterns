package com.github.bosik927.builder.sample.pizza.control;

import com.github.bosik927.builder.sample.pizza.boundary.PizzaBuilder;

public class SpicyPizzaBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
}
