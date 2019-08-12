package com.github.bosik927.builder.sample;

public class HawaiianPizzaBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
}