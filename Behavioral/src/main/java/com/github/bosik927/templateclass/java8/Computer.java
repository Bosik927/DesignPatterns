package com.github.bosik927.templateclass.java8;

import java.util.Map;

public class Computer {

    private Map<String, String> computerParts;

    public Computer(Map<String, String> computerParts) {
        this.computerParts = computerParts;
    }

    public Map<String, String> getComputerParts() {
        return computerParts;
    }
}