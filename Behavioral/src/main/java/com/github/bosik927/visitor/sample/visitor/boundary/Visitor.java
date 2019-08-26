package com.github.bosik927.visitor.sample.visitor.boundary;

import com.github.bosik927.visitor.sample.elements.control.JsonElement;
import com.github.bosik927.visitor.sample.elements.control.XmlElement;

public interface Visitor {
    void visit(XmlElement xe);
    void visit(JsonElement je);
}