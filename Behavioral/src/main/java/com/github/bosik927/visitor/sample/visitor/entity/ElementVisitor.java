package com.github.bosik927.visitor.sample.visitor.entity;

import com.github.bosik927.visitor.sample.elements.control.JsonElement;
import com.github.bosik927.visitor.sample.elements.control.XmlElement;
import com.github.bosik927.visitor.sample.visitor.boundary.Visitor;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(XmlElement xmlElement) {
        System.out.println("processing xml element with uuid: " + xmlElement.uuid);
    }

    @Override
    public void visit(JsonElement jsonElement) {
        System.out.println("processing json element with uuid: " + jsonElement.uuid);
    }
}