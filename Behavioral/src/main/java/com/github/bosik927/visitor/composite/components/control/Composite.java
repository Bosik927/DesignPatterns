package com.github.bosik927.visitor.composite.components.control;

import com.github.bosik927.visitor.composite.components.boundary.Component;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private static char next = 'a';
    private List<Component> children = new ArrayList<>();
    private char letter = next++;

    public void add(Component c) {
        children.add(c);
    }

    public void traverse() {
        System.out.print(letter + " ");
        children.forEach(Component::traverse);
    }
}
