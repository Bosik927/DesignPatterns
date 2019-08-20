package com.github.bosik927.visitor.sample.elements;

import com.github.bosik927.visitor.sample.visitor.Visitor;

public abstract class Element {

    public String uuid;

    public Element(String uuid) {
        this.uuid = uuid;
    }

    public abstract void accept(Visitor v);
}