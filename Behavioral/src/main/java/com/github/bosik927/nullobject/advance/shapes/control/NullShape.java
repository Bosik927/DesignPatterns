package com.github.bosik927.nullobject.advance.shapes.control;

import com.github.bosik927.nullobject.advance.shapes.boundary.Shape;

public class NullShape implements Shape {

    @Override
    public double area() {
        return 0.0d;
    }

    @Override
    public double perimeter() {
        return 0.0d;
    }

    @Override
    public void draw() {
        System.out.println("Null object can't be draw");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}