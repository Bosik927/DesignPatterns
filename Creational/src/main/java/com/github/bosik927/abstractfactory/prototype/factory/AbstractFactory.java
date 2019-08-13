package com.github.bosik927.abstractfactory.prototype.factory;

import com.github.bosik927.abstractfactory.prototype.expression.Expression;

public abstract class AbstractFactory {

    public Expression prototype;

    public Expression makePhase() {
        return prototype.clone();
    }

    public abstract Expression makeCompromise();

    public abstract Expression makeGrade();
}