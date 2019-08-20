package com.github.bosik927.abstractfactory.sample.toolkit.control;

import com.github.bosik927.abstractfactory.sample.cpu.CPU;
import com.github.bosik927.abstractfactory.sample.cpu.EnginolaCPU;
import com.github.bosik927.abstractfactory.sample.mmu.EnginolaMMU;
import com.github.bosik927.abstractfactory.sample.mmu.MMU;
import com.github.bosik927.abstractfactory.sample.toolkit.boundary.AbstractFactory;

public class EnginolaToolkit extends AbstractFactory {

    @Override
    public CPU createCPU() {
        return new EnginolaCPU();
    }

    @Override
    public MMU createMMU() {
        return new EnginolaMMU();
    }
}