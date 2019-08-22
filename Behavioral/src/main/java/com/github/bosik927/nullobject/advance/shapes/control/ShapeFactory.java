package com.github.bosik927.nullobject.advance.shapes.control;

import com.github.bosik927.nullobject.advance.shapes.boundary.Shape;

import static com.github.bosik927.nullobject.advance.shapes.entity.SimpleShape.CIRCLE;
import static com.github.bosik927.nullobject.advance.shapes.entity.SimpleShape.RECTANGLE;
import static com.github.bosik927.nullobject.advance.shapes.entity.SimpleShape.TRANGLE;

public class ShapeFactory {

    private static volatile ShapeFactory instance;

    public static ShapeFactory getInstance() {
        if (instance == null) {
            synchronized (ShapeFactory.class) {
                if (instance == null) {
                    instance = new ShapeFactory();
                }
            }
        }
        return instance;
    }

    public Shape createShape(String shapeType) {
        if (CIRCLE.getName().equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if (RECTANGLE.getName().equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if (TRANGLE.getName().equalsIgnoreCase(shapeType)) {
            return new Triangle();
        }
        return new NullShape();
    }

    private ShapeFactory() {
    }
}