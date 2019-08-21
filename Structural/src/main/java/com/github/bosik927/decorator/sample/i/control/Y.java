package com.github.bosik927.decorator.sample.i.control;

import com.github.bosik927.decorator.sample.i.boundary.D;
import com.github.bosik927.decorator.sample.i.boundary.I;

public class Y extends D {

    public Y(I inner) {
        super(inner);
    }

    @Override
    public void doIt() {
        super.doIt();
        doY();
    }

    private void doY() {
        System.out.print('Y');
    }
}