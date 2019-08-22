package com.github.bosik927.strategy.java8.computation.nolambda.compution.control;

import com.github.bosik927.strategy.java8.computation.nolambda.compution.boundary.Computation;

public class IntSum implements Computation<Integer> {

    @Override
    public Integer compute(Integer n, Integer m) {
        return n + m;
    }

}