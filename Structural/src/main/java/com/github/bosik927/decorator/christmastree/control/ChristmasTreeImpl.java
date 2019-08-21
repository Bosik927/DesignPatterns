package com.github.bosik927.decorator.christmastree.control;

import com.github.bosik927.decorator.christmastree.boundary.ChristmasTree;

public class ChristmasTreeImpl implements ChristmasTree {

    @Override
    public String decorate() {
        return "Christmas tree";
    }
}