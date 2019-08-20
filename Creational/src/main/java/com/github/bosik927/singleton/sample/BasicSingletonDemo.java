package com.github.bosik927.singleton.sample;

public class BasicSingletonDemo {

    static public void main(String... args){
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        BasicSingleton basicSingleton2 = BasicSingleton.getInstance();

        basicSingleton.saySomething();
        basicSingleton2.saySomething();

        System.out.println("Singletons are equals? : " + (basicSingleton==basicSingleton2));
    }
}