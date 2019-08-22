package com.github.bosik927.strategy.java8.computation.nolambda;

import com.github.bosik927.strategy.java8.computation.nolambda.compution.boundary.Computation;
import com.github.bosik927.strategy.java8.computation.nolambda.compution.control.IntDifference;
import com.github.bosik927.strategy.java8.computation.nolambda.compution.control.IntProduct;
import com.github.bosik927.strategy.java8.computation.nolambda.compution.control.IntSum;

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

        computations.forEach(computation -> computation.compute(10,4));
    }
}