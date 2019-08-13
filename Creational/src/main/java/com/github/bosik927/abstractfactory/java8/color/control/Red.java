package com.github.bosik927.abstractfactory.java8.color.control;

import com.github.bosik927.abstractfactory.java8.color.boundary.Color;

public class Red implements Color {

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String draw() {
        return "Draw on red";
    }

    @Override
    public String toString() {
        return "Red{}";
    }
}