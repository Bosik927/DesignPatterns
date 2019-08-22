package com.github.bosik927.strategy.java8.computation.nolambda.compution.boundary;

public interface Computation<T> {
    T compute(T n, T m);
}