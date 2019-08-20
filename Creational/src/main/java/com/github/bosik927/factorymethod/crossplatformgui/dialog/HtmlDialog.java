package com.github.bosik927.factorymethod.crossplatformgui.dialog;

import com.github.bosik927.factorymethod.crossplatformgui.button.Button;
import com.github.bosik927.factorymethod.crossplatformgui.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}