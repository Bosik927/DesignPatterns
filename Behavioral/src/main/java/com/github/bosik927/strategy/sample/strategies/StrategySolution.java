package com.github.bosik927.strategy.sample.strategies;

@SuppressWarnings("ALL")
public abstract class StrategySolution implements Strategy {

    public void solve() {
        start();
        while (nextTry() && !isSolution()) {}
        stop();
    }

    abstract void start();
    abstract boolean nextTry();
    abstract boolean isSolution();
    abstract void stop();
}