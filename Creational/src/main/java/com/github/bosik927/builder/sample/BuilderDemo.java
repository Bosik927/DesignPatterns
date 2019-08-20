package com.github.bosik927.builder.sample;

import com.github.bosik927.builder.sample.pizza.control.HawaiianPizzaBuilder;
import com.github.bosik927.builder.sample.pizza.control.Waiter;
import com.github.bosik927.builder.sample.pizza.entity.Pizza;
import com.github.bosik927.builder.sample.pizza.boundary.PizzaBuilder;
import com.github.bosik927.builder.sample.pizza.control.SpicyPizzaBuilder;

public class BuilderDemo {

    public static void main(String... args){
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        Pizza hawaiianPizza = waiter.getPizza();
        System.out.println(hawaiianPizza.toString());

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        Pizza spicyPizza = waiter.getPizza();
        System.out.println(spicyPizza.toString());
    }
}