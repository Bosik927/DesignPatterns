package com.github.bosik927.composite.simple.components.control;

import com.github.bosik927.composite.simple.components.boundary.Composite;

public class Column extends Composite {

    public Column(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Col");
        super.traverse();
    }
}