package com.github.bosik927.bridge.sample.stack;

import com.github.bosik927.bridge.sample.stackimpl.StackArray;
import com.github.bosik927.bridge.sample.stackimpl.StackImpl;
import com.github.bosik927.bridge.sample.stackimpl.StackList;

public class Stack {
    private StackImpl impl;

    public Stack(String s) {
        if (s.equals("array")) {
            impl = new StackArray();
        } else if (s.equals("list")) {
            impl = new StackList();
        } else {
            System.out.println("Stack: unknown parameter");
        }
    }

    public Stack() {
        this("array");
    }

    public void push(int in) {
        impl.push(in);
    }

    public int pop() {
        return impl.pop();
    }

    public int top() {
        return impl.top();
    }

    public boolean isEmpty() {
        return impl.isEmpty();
    }

    public boolean isFull() {
        return impl.isFull();
    }
}