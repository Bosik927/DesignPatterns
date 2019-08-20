package com.github.bosik927.abstractfactory.common.gui.application.control;

import com.github.bosik927.abstractfactory.common.button.boundary.Button;
import com.github.bosik927.abstractfactory.common.checkbox.boundary.Checkbox;
import com.github.bosik927.abstractfactory.common.gui.factory.boundary.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}