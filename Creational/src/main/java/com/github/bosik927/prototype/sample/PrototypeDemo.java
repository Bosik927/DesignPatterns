package com.github.bosik927.prototype.sample;

import com.github.bosik927.prototype.sample.factory.control.PersonFactory;
import com.github.bosik927.prototype.sample.persons.boundary.Person;

public class PrototypeDemo {

    public static void main(String... args) {
        Person bob = PersonFactory.getPrototype("Bob");
        System.out.println(bob);

        Person rick = PersonFactory.getPrototype("RiCk");
        System.out.println(rick);

        Person nobody = PersonFactory.getPrototype("nobody");
        System.out.println(nobody);
    }
}