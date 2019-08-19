package com.github.bosik927.nullobject.advance.shapes;

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
        if ("Circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("Rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("Triangle".equalsIgnoreCase(shapeType)) {
            return new Triangle();
        }
        return new NullShape();
    }

    private ShapeFactory() {
    }
}