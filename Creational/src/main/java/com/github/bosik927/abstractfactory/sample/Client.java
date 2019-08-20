package com.github.bosik927.abstractfactory.sample;

import com.github.bosik927.abstractfactory.sample.cpu.CPU;

import com.github.bosik927.abstractfactory.sample.mmu.MMU;
import com.github.bosik927.abstractfactory.sample.toolkit.boundary.AbstractFactory;
import com.github.bosik927.abstractfactory.sample.toolkit.entity.Architecture;

public class Client {

    /*TODO: Handle optional.empty()*/
    public static void main(String[] args) {
        AbstractFactory emberFactory =  AbstractFactory.getFactory(Architecture.EMBER).get();
        CPU emberCpu = emberFactory.createCPU();
        MMU emberMmu = emberFactory.createMMU();
        System.out.println(emberCpu);
        System.out.println(emberMmu);

        AbstractFactory enginolaFactory =  AbstractFactory.getFactory(Architecture.ENGINOLA).get();
        CPU enginolaCpu = enginolaFactory.createCPU();
        MMU enginolaMmu = enginolaFactory.createMMU();
        System.out.println(enginolaCpu);
        System.out.println(enginolaMmu);
    }
}