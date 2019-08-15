package com.github.bosik927.decorator.sample;

import com.github.bosik927.decorator.sample.i.*;

public class DecoratorDemo {

    public static void main( String[] args ) {
        I[] array = {new X(new A()), new Y(new X(new A())),
                new Z(new Y(new X(new A())))};
        display(array);
    }

    private static void display(I[] array){
        for (I anArray : array) {
            anArray.doIt();
            System.out.print("  ");
        }
    }
}