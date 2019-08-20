package com.github.bosik927.abstractfactory.prototype;

import com.github.bosik927.abstractfactory.prototype.factory.boundary.AbstractFactory;
import com.github.bosik927.abstractfactory.prototype.factory.control.NotPCFactory;
import com.github.bosik927.abstractfactory.prototype.factory.control.PCFactory;

public class FactoryFmProto {

    public static void main(String[] args) {
        AbstractFactory factory = new PCFactory();
        displayPhases(factory);
        factory = new NotPCFactory();
        displayPhases(factory);
    }

    private static void displayPhases(AbstractFactory factory){
        for (int i = 0; i < 3; i++) {
            System.out.print(factory.makePhase() + " ");
        }
        System.out.println();
        System.out.println(factory.makeCompromise());
        System.out.println(factory.makeGrade());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
    }
}