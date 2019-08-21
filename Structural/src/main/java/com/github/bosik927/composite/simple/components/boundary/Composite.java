package com.github.bosik927.composite.simple.components.boundary;

public abstract class Composite implements Component {

    private Component[] children = new Component[9];
    private int total = 0;
    private int value;

    public Composite(int val) {
        value = val;
    }

    /*FIXME no safety*/
    public void add(Component c) {
        children[total++] = c;
    }

    public void traverse() {
        System.out.print(value + "  ");

        for (int i = 0; i < total; i++) {
            children[i].traverse();
        }
        System.out.println("END FOR" + value);
        System.out.println();
    }
}