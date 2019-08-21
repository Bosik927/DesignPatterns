package com.github.bosik927.bridge.sample.stack.control;

import com.github.bosik927.bridge.sample.stackimpl.control.StackArray;
import com.github.bosik927.bridge.sample.stackimpl.boundary.StackImpl;
import com.github.bosik927.bridge.sample.stackimpl.control.StackList;

import static com.github.bosik927.bridge.sample.stack.entity.StackConstants.*;

public class Stack {

    private StackImpl stackImpl;

    public Stack(String s) {
        if (s.equals(ARRAY)) {
            stackImpl = new StackArray();
        } else if (s.equals(LIST)) {
            stackImpl = new StackList();
        } else {
            System.out.println(STACK_UNKNOWN_PARAMETER);
        }
    }

    public Stack() {
        this(ARRAY);
    }

    public void push(int in) {
        stackImpl.push(in);
    }

    public int pop() {
        return stackImpl.pop();
    }

    public int top() {
        return stackImpl.top();
    }

    public boolean isEmpty() {
        return stackImpl.isEmpty();
    }

    public boolean isFull() {
        return stackImpl.isFull();
    }
}