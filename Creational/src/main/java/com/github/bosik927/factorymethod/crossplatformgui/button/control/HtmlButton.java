package com.github.bosik927.factorymethod.crossplatformgui.button.control;

import com.github.bosik927.factorymethod.crossplatformgui.button.boundary.Button;

public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! button says - 'Hello World!'");
    }
}