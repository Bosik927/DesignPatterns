package com.github.bosik927.factorymethod.crossplatformgui;

import com.github.bosik927.factorymethod.crossplatformgui.dialog.Dialog;
import com.github.bosik927.factorymethod.crossplatformgui.dialog.HtmlDialog;
import com.github.bosik927.factorymethod.crossplatformgui.dialog.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}