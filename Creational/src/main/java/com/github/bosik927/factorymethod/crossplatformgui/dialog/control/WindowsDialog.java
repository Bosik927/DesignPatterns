package com.github.bosik927.factorymethod.crossplatformgui.dialog.control;

import com.github.bosik927.factorymethod.crossplatformgui.button.boundary.Button;
import com.github.bosik927.factorymethod.crossplatformgui.button.control.WindowsButton;
import com.github.bosik927.factorymethod.crossplatformgui.dialog.boundary.Dialog;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}