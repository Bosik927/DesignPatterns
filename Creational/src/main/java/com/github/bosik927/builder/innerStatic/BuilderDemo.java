package com.github.bosik927.builder.innerStatic;

import com.github.bosik927.builder.innerStatic.pizza.control.StaticPizza;

public class BuilderDemo {

    public static void main(String... args){
        StaticPizza pizza = new StaticPizza.Builder()
                .withDough("Dough")
                .withSauce("Sauce")
                .withTopping("Topping")
                .build();

        System.out.println(pizza);
    }
}