package com.github.bosik927.strategy.java8.computation.lambda;

import com.github.bosik927.strategy.java8.computation.nolambda.compution.boundary.Computation;

import java.util.Arrays;
import java.util.List;

public class ComputationDemo {

    public static void main(String[] args) {
        List<Computation<Integer>> computations =
                Arrays.asList(
                        Integer::sum,
                        (n, m)-> n*m,
                        (n, m)-> n-m
                );
        computations.forEach((comp) -> System.out.println(comp.compute(10, 4)));
    }
}