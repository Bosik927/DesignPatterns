package com.github.bosik927.decorator.sample;

import com.github.bosik927.decorator.sample.i.boundary.I;
import com.github.bosik927.decorator.sample.i.control.A;
import com.github.bosik927.decorator.sample.i.control.X;
import com.github.bosik927.decorator.sample.i.control.Y;
import com.github.bosik927.decorator.sample.i.control.Z;

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