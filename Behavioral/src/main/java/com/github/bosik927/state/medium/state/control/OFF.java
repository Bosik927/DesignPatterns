package com.github.bosik927.state.medium.state.control;

class OFF extends State {

    private static OFF instance = new OFF();

    private OFF() { }

    public static State instance() {
        return instance;
    }

    @Override
    public void push(Button button) {
        button.setCurrent(ON.instance());
        System.out.println("   turning ON");
    }
}
