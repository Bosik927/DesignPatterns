package com.github.bosik927;

import com.github.bosik927.builder.innerStatic.StaticPizza;
import com.github.bosik927.builder.sample.*;
import com.github.bosik927.singleton.BasicSingleton;
import com.github.bosik927.singleton.EnumSingleton;
import com.github.bosik927.singleton.ThreadSafetySingleton;

public class CreationPatternsDemo {
    public static void main(String... args) {
        /*BASIC SINGLETON*/
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        basicSingleton.saySomething();

        /*THREAD SAFETY SINGLETON*/
        ThreadSafetySingleton threadSafetySingleton = ThreadSafetySingleton.getInstance("");
        threadSafetySingleton.saySomething();

        /*ENUM SINGLETON*/
        EnumSingleton.INSTANCE.saySomething();

        System.out.println();

        /*SAMPLE BUILDER*/
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

        /*STATIC BUILDER*/
        StaticPizza pizza = new StaticPizza.Builder()
                .withDough("Dough")
                .withSauce("Sauce")
                .withTopping("Topping")
                .build();

        System.out.println(pizza);
    }
}
