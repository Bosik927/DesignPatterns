package com.github.bosik927.prototype.sample;

class Rick implements Person {

    private final String NAME = "Rick";

    @Override
    public Person clone() {
        return new Rick();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
