package com.github.bosik927.composite.simple.components;

public class Row extends Composite {

    public Row(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Row");
        super.traverse();
    }
}