package com.github.bosik927.bridge.sample.stack.control;

import com.github.bosik927.bridge.sample.stackimpl.boundary.StackImpl;
import com.github.bosik927.bridge.sample.stackimpl.control.StackList;

import static com.github.bosik927.bridge.sample.stack.entity.StackConstants.ARRAY;

public class StackFIFO extends Stack {

    private StackImpl stackImpl = new StackList();

    public StackFIFO() {
        super(ARRAY);
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