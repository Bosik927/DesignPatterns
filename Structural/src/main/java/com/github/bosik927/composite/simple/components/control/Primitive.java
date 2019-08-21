package com.github.bosik927.composite.simple.components.control;

import com.github.bosik927.composite.simple.components.boundary.Component;

public class Primitive implements Component {

    private int value;

    public Primitive(int val) {
        value = val;
    }

    public void traverse() {
        System.out.print(value + "  ");
    }
}