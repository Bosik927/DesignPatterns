package com.github.bosik927.nullobject.advance;

import com.github.bosik927.nullobject.advance.shapes.boundary.Shape;
import com.github.bosik927.nullobject.advance.shapes.control.ShapeFactory;

public class ShapeMain {

    public static void main(String... args) {
        String[] shapeTypes = new String[] { "Circle", null, "Triangle", "Pentagon", "Rectangle", "Trapezoid"};
        ShapeFactory shapeFactory = ShapeFactory.getInstance();

        for (String shapeType : shapeTypes) {
            Shape shape = shapeFactory.createShape(shapeType);
            System.out.println("Shape area: " + shape.area());
            System.out.println("Shape Perimeter: " + shape.perimeter());
            shape.draw();
            System.out.println();
        }
    }
}