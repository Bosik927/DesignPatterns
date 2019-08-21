package com.github.bosik927.composite.simple.components.control;

import com.github.bosik927.composite.simple.components.boundary.Composite;

public class Row extends Composite {

    public Row(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Row");
        super.traverse();
    }
}