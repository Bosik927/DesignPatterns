package com.github.bosik927.bridge.sample.stack.control;

import static com.github.bosik927.bridge.sample.stack.entity.StackConstants.ARRAY;

public class StackHanoi extends Stack {
    private int totalRejected = 0;

    public StackHanoi() {
        super(ARRAY);
    }

    public StackHanoi(String s) {
        super(s);
    }

    public int reportRejected() {
        return totalRejected;
    }

    public void push(int in) {
        if (!isEmpty() && in > top()) {
            totalRejected++;
        } else {
            super.push(in);
        }
    }
}