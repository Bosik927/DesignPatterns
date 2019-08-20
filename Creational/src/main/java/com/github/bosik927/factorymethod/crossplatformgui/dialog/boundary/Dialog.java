package com.github.bosik927.factorymethod.crossplatformgui.dialog.boundary;

import com.github.bosik927.factorymethod.crossplatformgui.button.boundary.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}