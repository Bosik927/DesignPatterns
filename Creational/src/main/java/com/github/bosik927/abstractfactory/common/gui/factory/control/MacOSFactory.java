package com.github.bosik927.abstractfactory.common.gui.factory.control;

import com.github.bosik927.abstractfactory.common.button.boundary.Button;
import com.github.bosik927.abstractfactory.common.button.control.MacOSButton;
import com.github.bosik927.abstractfactory.common.checkbox.boundary.Checkbox;
import com.github.bosik927.abstractfactory.common.checkbox.control.MacOSCheckbox;
import com.github.bosik927.abstractfactory.common.gui.factory.boundary.GUIFactory;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}