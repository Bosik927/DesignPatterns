package com.github.bosik927.prototype.sample;

class Tom implements Person {

    private final String NAME = "Tom";

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
