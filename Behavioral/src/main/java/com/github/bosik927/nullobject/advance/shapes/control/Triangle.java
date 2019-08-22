package com.github.bosik927.nullobject.advance.shapes.control;

import com.github.bosik927.nullobject.advance.shapes.boundary.Shape;

public class Triangle implements Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle() {
        this(1.0d, 1.0d, 1.0d);
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double halfCircumference = (a + b + c) / 2;
        return Math.sqrt(halfCircumference * (halfCircumference - a) * (halfCircumference - b) * (halfCircumference - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle with area: " + area() + " and perimeter: " + perimeter());
    }

    @Override
    public boolean isNull() {
        return false;
    }
}