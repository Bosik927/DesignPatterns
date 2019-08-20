package com.github.bosik927.objectpool.sample;

import com.github.bosik927.builder.sample.pizza.entity.Pizza;

public class PizzaPool extends ObjectPool<Pizza> {

    private String poolName;

    public PizzaPool(String poolName) {
        super();
        this.poolName = poolName;
    }

    @Override
    protected Pizza create() {
        return new Pizza();
    }

    @Override
    public void expire(Pizza pizza) {
    }

    @Override
    public boolean validate(Pizza pizza) {
      return true;
    }
}