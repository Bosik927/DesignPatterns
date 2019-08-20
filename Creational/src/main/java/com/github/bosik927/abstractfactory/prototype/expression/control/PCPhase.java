package com.github.bosik927.abstractfactory.prototype.expression.control;

public class PCPhase extends Expression {

    private static int next = 0;
    private static final String[] PHASES = {"\"animal companion\"", "\"vertically challenged\"",
            "\"factually inaccurate\"", "\"chronologically gifted\""};

    public PCPhase() {
        super(PHASES[next]);
        next = (next + 1) % PHASES.length;
    }

    @Override
    public Expression clone() {
        return new PCPhase();
    }
}