package com.github.bosik927.abstractfactory.prototype.expression.control;

public class NotPCPhase extends Expression {

    private static int next = 0;
    private static final String[] PHASES = {"\"pet\"", "\"easy\"", "\"lie\"", "\"old\""};

    public NotPCPhase() {
        super(PHASES[next]);
        next = (next + 1) % PHASES.length;
    }

    @Override
    public Expression clone() {
        return new NotPCPhase();
    }
}