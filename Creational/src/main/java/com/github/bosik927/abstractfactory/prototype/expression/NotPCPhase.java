package com.github.bosik927.abstractfactory.prototype.expression;

public class NotPCPhase extends Expression {

    private static int next = 0;
    private static final String[] list = {"\"pet\"", "\"easy\"", "\"lie\"", "\"old\""};

    public NotPCPhase() {
        super(list[next]);
        next = (next + 1) % list.length;
    }

    @Override
    public Expression clone() {
        return new NotPCPhase();
    }
}