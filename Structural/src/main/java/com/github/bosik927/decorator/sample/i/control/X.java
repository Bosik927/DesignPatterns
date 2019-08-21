package com.github.bosik927.decorator.sample.i.control;

import com.github.bosik927.decorator.sample.i.boundary.D;
import com.github.bosik927.decorator.sample.i.boundary.I;

public class X extends D {

    public X(I inner) {
        super(inner);
    }

    @Override
    public void doIt() {
        super.doIt();
        doX();
    }

    private void doX() {
        System.out.print('X');
    }
}