package com.github.bosik927.visitor.sample.visitor;

import com.github.bosik927.visitor.sample.elements.JsonElement;
import com.github.bosik927.visitor.sample.elements.XmlElement;

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