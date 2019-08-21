package com.github.bosik927.prototype.common.cache.control;

import com.github.bosik927.prototype.common.cache.boundary.Cacheable;
import com.github.bosik927.prototype.common.shapes.boundary.Shape;
import com.github.bosik927.prototype.common.shapes.control.Circle;
import com.github.bosik927.prototype.common.shapes.control.Rectangle;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache implements Cacheable<Shape> {

    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}