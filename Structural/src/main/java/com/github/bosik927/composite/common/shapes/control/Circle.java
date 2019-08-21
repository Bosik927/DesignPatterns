package com.github.bosik927.composite.common.shapes.control;

import com.github.bosik927.composite.common.shapes.boundary.BaseShape;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends BaseShape {

    public int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}