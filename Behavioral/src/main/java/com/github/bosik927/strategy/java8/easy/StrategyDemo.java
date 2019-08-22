package com.github.bosik927.strategy.java8.easy;

import com.github.bosik927.strategy.java8.easy.strategy.boundary.Strategy;
import com.github.bosik927.strategy.java8.easy.strategy.control.ActiveStrategy;
import com.github.bosik927.strategy.java8.easy.strategy.control.LazyStrategy;

import java.util.Arrays;
import java.util.List;

public class StrategyDemo {

    public static void main(String[] args) {
        /*JAVA 7*/
        List<Strategy> strategies =
                Arrays.asList(
                        new LazyStrategy(),
                        new ActiveStrategy()
                );

        for(Strategy stg : strategies){
            stg.performTask();
        }

        /*JAVA 8 - lambda*/
        List<Strategy> strategies2 =
                Arrays.asList(
                        () -> System.out.println("Perform task a day before deadline!"),
                        () -> System.out.println("Perform task now!")
                );

        strategies2.forEach(Strategy::performTask);
    }
}
