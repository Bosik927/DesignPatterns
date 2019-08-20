package com.github.bosik927.prototype.sample.persons.control;

import com.github.bosik927.prototype.sample.persons.boundary.Person;

public class Tom implements Person {

    private static final String NAME = "Tom";

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return NAME;
    }
}