package com.github.bosik927.visitor.sample.visitor;

import com.github.bosik927.visitor.sample.elements.JsonElement;
import com.github.bosik927.visitor.sample.elements.XmlElement;

public interface Visitor {
    void visit(XmlElement xe);
    void visit(JsonElement je);
}