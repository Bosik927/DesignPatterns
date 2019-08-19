package com.github.bosik927.strategy.sample;

import com.github.bosik927.strategy.sample.strategies.BAR;
import com.github.bosik927.strategy.sample.strategies.FOO;
import com.github.bosik927.strategy.sample.strategies.Strategy;

public class StrategyDemo {

    private static void execute(Strategy strategy) {
        strategy.solve();
    }

    public static void main( String[] args ) {
        Strategy[] algorithms = {new FOO(), new BAR()};
        for (Strategy algorithm : algorithms) {
            execute(algorithm);
        }
    }
}