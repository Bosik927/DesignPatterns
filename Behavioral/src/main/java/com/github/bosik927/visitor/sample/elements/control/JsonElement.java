package com.github.bosik927.visitor.sample.elements.control;

import com.github.bosik927.visitor.sample.elements.boundary.Element;
import com.github.bosik927.visitor.sample.visitor.boundary.Visitor;

public class JsonElement extends Element {

    public JsonElement(String uuid) {
        super(uuid);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}