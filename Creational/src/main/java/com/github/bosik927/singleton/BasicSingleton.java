package com.github.bosik927.singleton;

public class BasicSingleton {

    public static BasicSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BasicSingleton INSTANCE = new BasicSingleton();
    }

    public void saySomething() {
        System.out.println("I'm basic Singleton");
    }

    private BasicSingleton() {
    }
}