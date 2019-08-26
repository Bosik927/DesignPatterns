package com.github.bosik927.templateclass.sample.control;

import com.github.bosik927.templateclass.sample.boundary.Specialization;

public class Realization extends Specialization {

    public void stepTwo() {
        System.out.println("Realization.stepTwo");
    }

    protected void step3_2() {
        System.out.println( "Realization.step3_2");
    }

    public void stepFor() {
        System.out.println("Realization.stepFor");
        super.stepFor();
    }
}