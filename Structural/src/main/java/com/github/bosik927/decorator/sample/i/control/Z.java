package com.github.bosik927.decorator.sample.i.control;

import com.github.bosik927.decorator.sample.i.boundary.D;
import com.github.bosik927.decorator.sample.i.boundary.I;

public class Z extends D {

    public Z(I inner) {
        super(inner);
    }

    @Override
    public void doIt() {
        super.doIt();
        doZ();
    }

    private void doZ() {
        System.out.print('Z');
    }
}