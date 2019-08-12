package com.github.bosik927.singleton;

public final class ThreadSafetySingleton {

    private static volatile ThreadSafetySingleton instance;

    public static ThreadSafetySingleton getInstance(String value) {
        if (instance == null) {
            synchronized (ThreadSafetySingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafetySingleton();
                }
            }
        }
        return instance;
    }

    public void saySomething() {
        System.out.println("I'm thread safety Singleton");
    }

    private ThreadSafetySingleton() {
    }
}