package com.github.bosik927.strategy.java8.computation.nolambda;

import com.github.bosik927.strategy.java8.computation.Computation;

class IntDifference implements Computation<Integer> {

    @Override
    public Integer compute(Integer n, Integer m) {
        return n - m;
    }
}