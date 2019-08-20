package com.github.bosik927.abstractfactory.common.button.control;

import com.github.bosik927.abstractfactory.common.button.boundary.Button;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}