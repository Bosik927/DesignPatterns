package com.github.bosik927.prototype.sample;

import java.util.HashMap;
import java.util.Map;

class PersonFactory {

    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("bob", new Bob());
        prototypes.put("rick", new Rick());
    }

    public static Person getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }
}