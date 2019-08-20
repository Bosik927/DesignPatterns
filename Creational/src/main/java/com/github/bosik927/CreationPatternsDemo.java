package com.github.bosik927;

import com.github.bosik927.builder.innerStatic.StaticPizza;
import com.github.bosik927.builder.sample.HawaiianPizzaBuilder;
import com.github.bosik927.builder.sample.Pizza;
import com.github.bosik927.builder.sample.PizzaBuilder;
import com.github.bosik927.builder.sample.SpicyPizzaBuilder;
import com.github.bosik927.builder.sample.Waiter;
import com.github.bosik927.prototype.advance.Employees;

import java.util.List;

public class CreationPatternsDemo {

    public static void main(String... args) throws CloneNotSupportedException {
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

        System.out.println();

        /*SAMPLE PROTOTYPE*/

        /*ADVANCE PROTOTYPE*/
        Employees employees = new Employees();
        employees.loadData();

        Employees newEmployees = (Employees) employees.clone();
        Employees newEmployees2 = (Employees) employees.clone();

        List<String> list = newEmployees.getEmployees();
        list.add("Cris");

        List<String> list1 = newEmployees2.getEmployees();
        list1.remove("Bob");

        System.out.println("emps List: "+employees.getEmployees());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }
}
