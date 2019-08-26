package com.github.bosik927.templateclass.sample.boundary;

public abstract class Generalization {

    public void findSolution() {
        stepOne();
        stepTwo();
        stepThr();
        stepFor();
    }

    private void stepOne() {
        System.out.println("Generalization.stepOne");
    }

    public abstract void stepTwo();
    abstract void stepThr();

    public void stepFor() {
        System.out.println( "Generalization.stepFor" );
    }
}