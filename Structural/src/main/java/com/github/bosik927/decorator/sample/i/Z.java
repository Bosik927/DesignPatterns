package com.github.bosik927.decorator.sample.i;

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