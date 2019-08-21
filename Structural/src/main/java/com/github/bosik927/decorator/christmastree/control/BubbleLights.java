package com.github.bosik927.decorator.christmastree.control;

import com.github.bosik927.decorator.christmastree.boundary.ChristmasTree;
import com.github.bosik927.decorator.christmastree.boundary.TreeDecorator;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}