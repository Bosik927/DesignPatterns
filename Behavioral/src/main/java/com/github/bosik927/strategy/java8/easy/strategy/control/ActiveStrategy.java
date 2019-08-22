package com.github.bosik927.strategy.java8.easy.strategy.control;

import com.github.bosik927.strategy.java8.easy.strategy.boundary.Strategy;

public class ActiveStrategy implements Strategy {

    @Override
    public void performTask() {
        System.out.println("Perform task now!");
    }

}