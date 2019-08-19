package com.github.bosik927.state.medium;

class ON extends State {

    private static ON instance = new ON();

    private ON() {}

    public static State instance() {
        return instance;
    }
}