package com.github.bosik927.factorymethod.crossplatformgui.dialog.control;

import com.github.bosik927.factorymethod.crossplatformgui.button.boundary.Button;
import com.github.bosik927.factorymethod.crossplatformgui.button.control.HtmlButton;
import com.github.bosik927.factorymethod.crossplatformgui.dialog.boundary.Dialog;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}