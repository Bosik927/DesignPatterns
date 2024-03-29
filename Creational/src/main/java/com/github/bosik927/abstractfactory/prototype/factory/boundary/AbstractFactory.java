package com.github.bosik927.abstractfactory.prototype.factory.boundary;

import com.github.bosik927.abstractfactory.prototype.expression.control.Expression;

public abstract class AbstractFactory {

    public Expression prototype;

    public Expression makePhase() {
        return prototype.clone();
    }

    public abstract Expression makeCompromise();

    public abstract Expression makeGrade();
}