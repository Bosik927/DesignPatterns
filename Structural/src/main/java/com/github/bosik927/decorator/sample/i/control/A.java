package com.github.bosik927.decorator.sample.i.control;

import com.github.bosik927.decorator.sample.i.boundary.I;

public class A implements I {

    @Override
    public void doIt() {
        System.out.print('A');
    }
}