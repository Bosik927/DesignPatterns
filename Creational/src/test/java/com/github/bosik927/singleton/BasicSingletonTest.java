package com.github.bosik927.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicSingletonTest {

    @Test
    public void theSameObjectTest(){
        BasicSingleton basicSingleton1 = BasicSingleton.getInstance();
        BasicSingleton basicSingleton2 = BasicSingleton.getInstance();

        assertEquals(basicSingleton1,basicSingleton2);
    }

}