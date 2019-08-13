package com.github.bosik927;

import com.github.bosik927.builder.innerStatic.StaticPizza;
import com.github.bosik927.builder.sample.*;
import com.github.bosik927.prototype.advance.Employees;
import com.github.bosik927.singleton.BasicSingleton;
import com.github.bosik927.singleton.EnumSingleton;
import com.github.bosik927.singleton.ThreadSafetySingleton;

import java.util.List;

public class CreationPatternsDemo {
    public static void main(String... args) throws CloneNotSupportedException {
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
