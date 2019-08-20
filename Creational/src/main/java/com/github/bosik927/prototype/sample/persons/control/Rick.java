package com.github.bosik927.prototype.sample.persons.control;

import com.github.bosik927.prototype.sample.persons.boundary.Person;

public class Rick implements Person {

    private static final String NAME = "Rick";

    @Override
    public Person clone() {
        return new Rick();
    }

    @Override
    public String toString() {
        return NAME;
    }
}