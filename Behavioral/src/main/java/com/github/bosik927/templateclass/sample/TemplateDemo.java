package com.github.bosik927.templateclass.sample;

import com.github.bosik927.templateclass.sample.boundary.Generalization;
import com.github.bosik927.templateclass.sample.control.Realization;

public class TemplateDemo {

    public static void main(String[] args) {
        Generalization algorithm = new Realization();
        algorithm.findSolution();
    }
}