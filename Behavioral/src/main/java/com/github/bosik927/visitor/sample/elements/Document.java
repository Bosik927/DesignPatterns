package com.github.bosik927.visitor.sample.elements;

import com.github.bosik927.visitor.sample.visitor.Visitor;

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