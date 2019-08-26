package com.github.bosik927.visitor.composite.components.control;

import com.github.bosik927.visitor.composite.components.boundary.Component;

public class Leaf implements Component {

    private int number;

    public Leaf(int value) {
        this.number = value;
    }

    public void traverse() {
        System.out.print(number + " ");
    }
}