package com.github.bosik927.strategy.java8.easy;

class ActiveStrategy implements Strategy{

    @Override
    public void performTask() {
        System.out.println("Perform task now!");
    }

}