package com.github.bosik927.bridge.sample.stack;

import com.github.bosik927.bridge.sample.stackimpl.StackImpl;
import com.github.bosik927.bridge.sample.stackimpl.StackList;

public class StackFIFO extends Stack {
    private StackImpl stackImpl = new StackList();

    public StackFIFO() {
        super("array");
    }

    public StackFIFO(String s) {
        super(s);
    }

    public int pop() {
        while (!isEmpty()) {
            stackImpl.push(super.pop());
        }
        int ret = stackImpl.pop();
        while (!stackImpl.isEmpty()) {
            push(stackImpl.pop());
        }
        return ret;
    }
}