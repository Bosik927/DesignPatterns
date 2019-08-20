package com.github.bosik927.singleton.sample;

public class BasicSingleton {

    public static BasicSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void saySomething() {
        System.out.println("I'm basic Singleton");
    }

    private static class SingletonHolder {
        private static final BasicSingleton INSTANCE = new BasicSingleton();
    }

    private BasicSingleton() {
    }
}