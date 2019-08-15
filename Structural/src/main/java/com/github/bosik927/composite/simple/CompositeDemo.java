package com.github.bosik927.composite.simple;

import com.github.bosik927.composite.simple.components.Column;
import com.github.bosik927.composite.simple.components.Composite;
import com.github.bosik927.composite.simple.components.Primitive;
import com.github.bosik927.composite.simple.components.Row;

public class CompositeDemo {

    public static void main(String[] args) {
        Composite first = new Row(1);
        Composite second = new Column(2);
        Composite third = new Column(3);
        Composite fourth = new Row(4);
        Composite fifth = new Row(5);

        first.add(second);
        first.add(third);
        first.add(new Primitive(6));

        third.add(fourth);
        third.add(fifth);
        third.add(new Primitive(8));

        second.add(new Primitive(7));

        fourth.add(new Primitive(9));

        fifth.add(new Primitive(10));

        first.traverse();
    }
}