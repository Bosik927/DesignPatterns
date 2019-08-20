package com.github.bosik927.visitor.composite.components;

public class Leaf implements Component {

    private int number;

    public Leaf(int value) {
        this.number = value;
    }

    public void traverse() {
        System.out.print(number + " ");
    }
}