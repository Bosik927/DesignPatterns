package com.github.bosik927.singleton.threadsafety;

public class ThreadSafetySingletonDemo {

    static public void main(String... args){
        ThreadSafetySingleton threadSafetySingleton = ThreadSafetySingleton.getInstance();
        ThreadSafetySingleton threadSafetySingleton2 = ThreadSafetySingleton.getInstance();

        threadSafetySingleton.saySomething();
        threadSafetySingleton2.saySomething();

        System.out.println("Singletons are equals? : " + (threadSafetySingleton==threadSafetySingleton2));
    }
}