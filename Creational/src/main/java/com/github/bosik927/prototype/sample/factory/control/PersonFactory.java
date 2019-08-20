package com.github.bosik927.prototype.sample.factory.control;

import com.github.bosik927.prototype.sample.persons.boundary.Person;
import com.github.bosik927.prototype.sample.persons.control.Bob;
import com.github.bosik927.prototype.sample.persons.control.Rick;
import com.github.bosik927.prototype.sample.persons.control.Tom;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {

    private static final Map<String, Person> PROTOTYPES = new HashMap<>();

    static {
        PROTOTYPES.put("tom", new Tom());
        PROTOTYPES.put("bob", new Bob());
        PROTOTYPES.put("rick", new Rick());
    }

    public static Person getPrototype(String type) {
        try {
            return PROTOTYPES.get(type.toLowerCase()).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }

    private PersonFactory(){
    }
}