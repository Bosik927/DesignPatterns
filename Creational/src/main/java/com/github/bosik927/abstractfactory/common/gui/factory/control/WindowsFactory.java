package com.github.bosik927.abstractfactory.common.gui.factory.control;

import com.github.bosik927.abstractfactory.common.button.boundary.Button;
import com.github.bosik927.abstractfactory.common.button.control.WindowsButton;
import com.github.bosik927.abstractfactory.common.checkbox.boundary.Checkbox;
import com.github.bosik927.abstractfactory.common.checkbox.control.WindowsCheckbox;
import com.github.bosik927.abstractfactory.common.gui.factory.boundary.GUIFactory;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}