package com.github.bosik927.visitor.sample;

import com.github.bosik927.visitor.sample.elements.Document;
import com.github.bosik927.visitor.sample.elements.JsonElement;
import com.github.bosik927.visitor.sample.elements.XmlElement;
import com.github.bosik927.visitor.sample.visitor.ElementVisitor;
import com.github.bosik927.visitor.sample.visitor.Visitor;

import java.util.UUID;

public class VisitorDemo {

    public static void main(String[] args) {
        Visitor v = new ElementVisitor();

        Document d = new Document(generateUuid());
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new XmlElement(generateUuid()));

        d.accept(v);
    }

    private static String generateUuid() {
        return UUID.randomUUID().toString();
    }
}