package com.github.bosik927.bridge.sample.stackimpl;

public interface StackImpl {
    void push(int i);

    int pop();

    int top();

    boolean isEmpty();

    boolean isFull();
}