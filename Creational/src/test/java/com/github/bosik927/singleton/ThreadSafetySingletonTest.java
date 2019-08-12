package com.github.bosik927.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreadSafetySingletonTest {

    @Test
    public void theSameObjectTest(){
        ThreadSafetySingleton threadSafetySingleton = ThreadSafetySingleton.getInstance("");
        ThreadSafetySingleton threadSafetySingleton2 = ThreadSafetySingleton.getInstance("2");

        assertEquals(threadSafetySingleton,threadSafetySingleton2);
    }
}