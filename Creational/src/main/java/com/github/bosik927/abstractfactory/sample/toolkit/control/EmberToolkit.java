package com.github.bosik927.abstractfactory.sample.toolkit.control;

import com.github.bosik927.abstractfactory.sample.cpu.CPU;
import com.github.bosik927.abstractfactory.sample.cpu.EmberCPU;
import com.github.bosik927.abstractfactory.sample.mmu.EmberMMU;
import com.github.bosik927.abstractfactory.sample.mmu.MMU;
import com.github.bosik927.abstractfactory.sample.toolkit.boundary.AbstractFactory;

public class EmberToolkit extends AbstractFactory {

    @Override
    public CPU createCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        return new EmberMMU();
    }
}