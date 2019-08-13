package com.github.bosik927.abstractfactory.java8.color.control;

import com.github.bosik927.abstractfactory.java8.color.boundary.Color;

public class Blue implements Color {

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public String draw() {
        return "Draw on blue";
    }

    @Override
    public String toString() {
        return "Blue{}";
    }
}