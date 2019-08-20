package com.github.bosik927.singleton.enumclass;

public class EnumSingletonDemo {

    static public void main(String... args){
        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.getInstance();

        enumSingleton.saySomething();
        enumSingleton2.saySomething();

        System.out.println("Singletons are equals? : " + (enumSingleton==enumSingleton2));
    }
}