package com.github.bosik927.factorymethod.crossplatformgui.dialog;

import com.github.bosik927.factorymethod.crossplatformgui.button.Button;
import com.github.bosik927.factorymethod.crossplatformgui.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}