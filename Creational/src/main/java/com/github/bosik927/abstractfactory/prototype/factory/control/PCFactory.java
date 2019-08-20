package com.github.bosik927.abstractfactory.prototype.factory.control;

import com.github.bosik927.abstractfactory.prototype.expression.control.Expression;
import com.github.bosik927.abstractfactory.prototype.expression.control.PCPhase;
import com.github.bosik927.abstractfactory.prototype.factory.boundary.AbstractFactory;

public class PCFactory extends AbstractFactory {

    public PCFactory() {
        prototype = new PCPhase();
    }

    @Override
    public Expression makeCompromise() {
        return new Expression("\"do it your way, any way, or no way\"");
    }

    @Override
    public Expression makeGrade() {
        return new Expression("\"you pass, self-esteem intact\"");
    }
}