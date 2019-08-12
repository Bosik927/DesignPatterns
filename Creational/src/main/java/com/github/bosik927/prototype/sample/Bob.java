package com.github.bosik927.prototype.sample;

class Bob implements Person {

    private final String NAME = "Bob";

    @Override
    public Person clone() {
        return new Bob();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
