package com.github.bosik927.visitor.sample.elements;

import com.github.bosik927.visitor.sample.visitor.Visitor;

public class XmlElement extends Element {

    public XmlElement(String uuid) {
        super(uuid);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}