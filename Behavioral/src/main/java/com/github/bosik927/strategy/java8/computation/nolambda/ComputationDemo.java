package com.github.bosik927.strategy.java8.computation.nolambda;

import com.github.bosik927.strategy.java8.computation.Computation;

import java.util.Arrays;
import java.util.List;

public class ComputationDemo {

    public static void main(String[] args) {
        List<Computation> computations =
                Arrays.asList(
                        new IntSum(),
                        new IntDifference(),
                        new IntProduct()
                );

        for (Computation comp : computations) {
            System.out.println(comp.compute(10, 4));
        }
    }
}