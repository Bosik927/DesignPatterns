package com.github.bosik927.abstractfactory.sample.toolkit.boundary;

import com.github.bosik927.abstractfactory.sample.toolkit.control.EnginolaToolkit;
import com.github.bosik927.abstractfactory.sample.toolkit.entity.Architecture;
import com.github.bosik927.abstractfactory.sample.cpu.CPU;
import com.github.bosik927.abstractfactory.sample.mmu.MMU;
import com.github.bosik927.abstractfactory.sample.toolkit.control.EmberToolkit;

import java.util.Optional;

public abstract class AbstractFactory {

    private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
    private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();

    public static synchronized Optional<AbstractFactory> getFactory(Architecture architecture) {
        switch (architecture) {
            case ENGINOLA:
                return Optional.of(ENGINOLA_TOOLKIT);
            case EMBER:
                return Optional.of(EMBER_TOOLKIT);
        }
        return Optional.empty();
    }

    public abstract CPU createCPU();

    public abstract MMU createMMU();
}