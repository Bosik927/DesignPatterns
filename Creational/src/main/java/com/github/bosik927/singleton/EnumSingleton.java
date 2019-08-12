package com.github.bosik927.singleton;

public enum EnumSingleton {
    INSTANCE;

    private EnumSingleton() {
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public void saySomething(){
        System.out.println("I'm enum Singleton");
    }
}