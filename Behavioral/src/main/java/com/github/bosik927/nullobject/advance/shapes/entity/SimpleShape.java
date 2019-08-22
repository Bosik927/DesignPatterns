package com.github.bosik927.nullobject.advance.shapes.entity;

public enum SimpleShape {

    CIRCLE("Circle"),
    RECTANGLE("Rectangle"),
    TRANGLE("Triangle");

    private String name;

    SimpleShape(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}