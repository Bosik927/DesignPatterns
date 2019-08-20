package com.github.bosik927.abstractfactory.common.gui.factory.boundary;

import com.github.bosik927.abstractfactory.common.button.boundary.Button;
import com.github.bosik927.abstractfactory.common.checkbox.boundary.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}