package com.github.bosik927.singleton.enumclass;

public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public void saySomething() {
        System.out.println("I'm enum Singleton");
    }
}