package com.github.bosik927;

import com.github.bosik927.singleton.BasicSingleton;
import com.github.bosik927.singleton.EnumSingleton;
import com.github.bosik927.singleton.ThreadSafetySingleton;

public class CreationPatternsDemo {
    public static void main(String... args){
        /*BASIC SINGLETON*/
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        basicSingleton.saySomething();

        /*THREAD SAFETY SINGLETON*/
        ThreadSafetySingleton threadSafetySingleton = ThreadSafetySingleton.getInstance("");
        threadSafetySingleton.saySomething();

        /*ENUM SINGLETON*/
        EnumSingleton.INSTANCE.saySomething();
    }
}
