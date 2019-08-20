package com.github.bosik927.abstractfactory.prototype.factory.control;

import com.github.bosik927.abstractfactory.prototype.expression.control.Expression;
import com.github.bosik927.abstractfactory.prototype.expression.control.NotPCPhase;
import com.github.bosik927.abstractfactory.prototype.factory.boundary.AbstractFactory;

public class NotPCFactory extends AbstractFactory {

    public NotPCFactory() {
        prototype = new NotPCPhase();
    }

    @Override
    public Expression makeGrade() {
        return new Expression("\"my way, or the highway\"");
    }

    @Override
    public Expression makeCompromise() {
        return new Expression("\"take test, deal with the results\"");
    }
}