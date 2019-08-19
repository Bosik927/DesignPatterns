package com.github.bosik927.strategy.java8.easy;

class LazyStrategy implements Strategy{

    @Override
    public void performTask() {
        System.out.println("Perform task a day before deadline!");
    }

}