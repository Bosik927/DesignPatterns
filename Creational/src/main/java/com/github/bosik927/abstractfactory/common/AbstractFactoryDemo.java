package com.github.bosik927.abstractfactory.common;

import com.github.bosik927.abstractfactory.common.gui.application.control.Application;
import com.github.bosik927.abstractfactory.common.gui.factory.control.MacOSFactory;
import com.github.bosik927.abstractfactory.common.gui.factory.control.WindowsFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        String osName = System.getProperty("os.name").toLowerCase();
        /*CHANGE TO SEE DIFFERENCE*/
        if (osName.contains("mac")) {
            return new Application(new MacOSFactory());
        }
        return new Application(new WindowsFactory());
    }
}