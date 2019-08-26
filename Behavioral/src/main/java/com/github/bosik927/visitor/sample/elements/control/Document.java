package com.github.bosik927.visitor.sample.elements.control;

import com.github.bosik927.visitor.sample.elements.boundary.Element;
import com.github.bosik927.visitor.sample.visitor.boundary.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {

    public List<Element> elements = new ArrayList<>();

    public Document(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor v) {
        elements.forEach(element -> element.accept(v));
    }
}