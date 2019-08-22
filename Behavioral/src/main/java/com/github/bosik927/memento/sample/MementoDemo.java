package com.github.bosik927.memento.sample;

import com.github.bosik927.memento.sample.control.Caretaker;
import com.github.bosik927.memento.sample.control.Originator;

public class MementoDemo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento( originator.save() );
        originator.setState("State3");
        caretaker.addMemento( originator.save() );
        originator.setState("State4");
        originator.restore( caretaker.getMemento() );
    }
}