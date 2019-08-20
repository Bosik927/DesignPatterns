package com.github.bosik927.prototype.sample.persons.control;

import com.github.bosik927.prototype.sample.persons.boundary.Person;

public class Bob implements Person {

    private static final String NAME = "Bob";

    @Override
    public Person clone() {
        return new Bob();
    }

    @Override
    public String toString() {
        return NAME;
    }
}